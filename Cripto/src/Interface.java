import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frame;
	private JTextField mandamsg;
	private JTextField recebemsg;
	private JTextField chavemsg;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	public Interface() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		recebemsg = new JTextField();
		recebemsg.setColumns(10);
		recebemsg.setBounds(40, 158, 363, 53);
		frame.getContentPane().add(recebemsg);
		
		mandamsg = new JTextField();
		mandamsg.setBounds(40, 45, 363, 53);
		frame.getContentPane().add(mandamsg);
		mandamsg.setColumns(10);
		
		JButton botaocrip = new JButton("Criptografar Mensagem");
		botaocrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Erro_Campo e = new Erro_Campo();
				
				int contador=0,conterro=0;
				int j=0;
				BancoPalavras bd = new BancoPalavras();
				
				
				String msg = mandamsg.getText().trim().toUpperCase();
				String key = chavemsg.getText().trim().toUpperCase();
				

				char a;
				
				for(j=0;j<key.length();j++) 
				{
					a = key.charAt(j);
						if(a=='A')
						{
							contador++;
						}
				}
				
				/*for(j=0;j<key.length();j++) 
				{
					a = key.charAt(j);
						if(a<58 && a>47)
						{
							contadornum++;
						}
				}
				*/
				if(contador==key.length()) 
				{
					recebemsg.setText(e.Erro_a());
					conterro++;
				}
				if(key.length()==1)
				{
					recebemsg.setText(e.Erro_1letra());
					conterro++;
				} 
				if(key.length()==0)
				{
					recebemsg.setText(e.Erro_void());
					conterro++;
				}
				if(conterro==0) {
					recebemsg.setText(bd.criptografaMsg(msg, key));
					chavemsg.setText("");
					mandamsg.setText("");
				}
				if(conterro!=0) {
					conterro=0;
				}
			}
		});
		
		chavemsg = new JTextField();
		chavemsg.setBounds(317, 109, 86, 20);
		frame.getContentPane().add(chavemsg);
		chavemsg.setColumns(10);
		botaocrip.setBounds(40, 109, 215, 23);
		frame.getContentPane().add(botaocrip);
		
		JButton botaodescrip = new JButton("Descriptografar Mensagem");
		botaodescrip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Erro_Campo e = new Erro_Campo();
				
				int contador=0,conterro=0;
				int j=0;
				BancoPalavras bd = new BancoPalavras();
				
				
				String msg = mandamsg.getText().trim();
				String key = chavemsg.getText().trim().toUpperCase();
				

				char a;
				
				for(j=0;j<key.length();j++) 
				{
					a = key.charAt(j);
						if(a=='A')
						{
							contador++;
						}
				}
				
				/*for(j=0;j<key.length();j++) 
				{
					a = key.charAt(j);
						if(a<58 && a>47)
						{
							contadornum++;
						}
				}
				*/
				if(contador==key.length()) 
				{
					recebemsg.setText(e.Erro_a());
					conterro++;
				}
				if(key.length()==1)
				{
					recebemsg.setText(e.Erro_1letra());
					conterro++;
				} 
				if(key.length()==0)
				{
					recebemsg.setText(e.Erro_void());
					conterro++;
				}
				if(conterro==0) {
					recebemsg.setText(bd.descriptografaMsg(msg, key));
					chavemsg.setText("");
					mandamsg.setText("");
				}
				if(conterro!=0) {
					conterro=0;
				}
			}
		});
		botaodescrip.setBounds(40, 219, 215, 23);
		frame.getContentPane().add(botaodescrip);
		
		JLabel txt1 = new JLabel("Mensagem:");
		txt1.setBounds(40, 30, 125, 14);
		frame.getContentPane().add(txt1);
		
		JLabel txt2 = new JLabel("Mensagem Criptografada:");
		txt2.setBounds(40, 140, 188, 14);
		frame.getContentPane().add(txt2);
		
		JLabel txt3 = new JLabel("Chave:");
		txt3.setBounds(275, 113, 58, 14);
		frame.getContentPane().add(txt3);
	}
}
