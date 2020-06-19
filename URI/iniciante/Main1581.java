import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.PrintStream;

public class Main1581{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int n=sc.nextInt();
		while(n-- >0){
			int q=sc.nextInt();
			String[] str=new String[q];
			for(int i=0;i<q;i++)str[i]=sc.next();
			boolean life=true;
			for(int i=1;i<q;i++)
				if(!str[i-1].equals(str[i])){
					life=false;
					break;
				}
			if(life)ps.println(str[0]);
			else ps.println("ingles");
		}
	}
	
	
}

