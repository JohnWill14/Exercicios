import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.io.PrintStream;

public class Main1547{
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
			int num=sc.nextInt();

			int[] especulacao=new int[q];

			for(int i=0;i<q;i++){
				especulacao[i]=Math.abs(sc.nextInt()-num);
			}

			int menor=99999;
			int indice=-1;

			for(int i=0;i<q;i++){
				if(menor>especulacao[i]){
					menor=especulacao[i];
					indice=i;
				}
			}
			ps.println((++indice));

		}
	}
	
	
}

