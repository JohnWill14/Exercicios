import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;
public class Main2982{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int n=leiaInt();
		int g=0,v=0;
		while(n-- >0){
			char c=sc.next().charAt(0);
			int p=leiaInt();
			if(c=='G')g+=p;
			else v+=p;


		}
		if(v>=g)ps.println("A greve vai parar.");
		else ps.println("NAO VAI TER CORTE, VAI TER LUTA!");
	}
	public static int leiaInt(){
		return Integer.parseInt(sc.next());
	}
	
	
}

