import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.PrintStream;

public class Main1551{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int n=Integer.parseInt(sc.nextLine());
		while(n-- >0){
			
			String str=sc.nextLine();

			Set<Character> test=new HashSet();
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)>='a'&&str.charAt(i)<='z'
					||str.charAt(i)>='A'&&str.charAt(i)<='Z'){
					char c=(str.charAt(i)+"").toLowerCase().charAt(0);
					test.add(c);
				}
			}
			int palavras=test.size();

			if(palavras==26){
				ps.println("frase completa");
			}else if(palavras>13){
				ps.println("frase quase completa");
			}else ps.println("frase mal elaborada");
		}	
	
	}
	
	
}

