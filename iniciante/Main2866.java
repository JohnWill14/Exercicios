import java.util.Scanner;
import java.io.PrintStream;
public class Main2866{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int cont=sc.nextInt();
		while(cont-- >0){
			String str=sc.next();
			StringBuilder sb=new StringBuilder();

			for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				if(c>='a'&&c<='z')sb.append(c);
			}
			ps.println(sb.reverse());
		}
	}
	
	
}

