import java.util.Scanner;
import java.io.PrintStream;

public class Main1134{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int[] combustivel=new int[]{
			0,0,0
		};
		while(true){
			int x=sc.nextInt();
			x-=1;
			if(x>3||x<0)continue;
			if(x==3)break;
			combustivel[x]+=1;
		}
		ps.println("MUITO OBRIGADO");
		ps.println("Alcool: "+combustivel[0]);
		ps.println("Gasolina: "+combustivel[1]);
		ps.println("Diesel: "+combustivel[2]);
	}
}
