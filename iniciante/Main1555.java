import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintStream;

public class Main1555{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int n=sc.nextInt();
		while(n-- >0){
			int a,b;
			a=sc.nextInt();
			b=sc.nextInt();
			int[] val=new int[]{
				rafael(a,b),
				beto(a,b),
				carlos(a,b)
			};
			int maior=-99999999;
			int indice=-1;
			for(int i=0;i<3;i++){
				// ps.print(val[i]+" ");
				if(maior<val[i]){
					maior=val[i];
					indice=i;
				}
			}
			// ps.println();
			String venceu;
			if(indice==0)venceu="Rafael";
			else if(indice==1)venceu="Beto";
			else venceu="Carlos";

			ps.println(venceu+" ganhou");
		}	
	
	}
	public static int  rafael(int x, int y){
		return (3*x)*(3*x)+y*y;
	}
	public static int  beto(int x,int y){
		return 2* (x)*(x)+(5*y)*(5*y);
	}
	public static int  carlos(int x,int y){
		return -100*x+y*y*y;
	}




	
}

