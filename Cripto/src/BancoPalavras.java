
public class BancoPalavras {
	
	public String criptografaMsg (String msg, String key) {
		int[] guardachave = new int[900];
		int j= -1;
		char aux,auxmsg;
		String conc="";
				for(int i=0;i<msg.length();i++) {
					if(j==key.length()-1)j= -1;
					j++;
					aux = key.charAt(j);
					guardachave[i] = (int)aux-65;
					if(msg.charAt(i) != ' ') {
					auxmsg = (char)(msg.charAt(i)+guardachave[i]);
					}else {
						auxmsg = ' ';
					}
					conc = conc.concat(""+auxmsg);
					//System.out.println("indice "+j+" valorchar-"+guardachave[i]+" palavra-"+conc);
				}
		return conc;
	}
	
	public String descriptografaMsg (String msg, String key) {
		
		int[] guardachave = new int[900];
		int j= -1;
		char aux,auxmsg;
		String conc="";
				for(int i=0;i<msg.length();i++) {
					if(j==key.length()-1)j= -1;
					j++;
					aux = key.charAt(j);
					guardachave[i] = (int)aux-65;
					if(msg.charAt(i) != ' ') {
						auxmsg = (char)(msg.charAt(i)-guardachave[i]);
						}else {
							auxmsg = ' ';
						}
					conc = conc.concat(""+auxmsg);
					//System.out.println("indice "+j+" valorchar-"+guardachave[i]+" palavra-"+conc);
				}
		return conc;
	}
	
}
