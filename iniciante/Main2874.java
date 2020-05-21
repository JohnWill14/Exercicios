import java.util.Scanner;
import java.io.PrintStream;
public class Main2874{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		while(sc.hasNextLine()){
			int termos=Integer.parseInt(sc.nextLine());
			//String[] binario=new String[termos];
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<termos;i++){
				String str=new StringBuffer(sc.nextLine()).reverse().toString();
				sb.append((char)parseBinarioToInteger(str));
			}
			ps.println(sb);

		}

	}
	public static int parseBinarioToInteger(String str){
		// ps.println("ola: "+str);
		int sun=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='1'){
				sun+=(int)Math.pow(2,i);
			}
		}
		return sun;
	}	
	
	
}

