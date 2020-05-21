import java.util.Scanner;
import java.io.PrintStream;
public class Main1557{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		while(true){
			int v=sc.nextInt();
			if(v==0)break;

			int[][] vet=new int[v][v];


			for(int i=0;i<v;i++ ){
				for(int j=0;j<v;j++ ){
					vet[i][j]=(int)Math.pow(2,j+i);
				}	
			}
			int tam=(int)Math.log10(vet[v-1][v-1])+2;
			String str;

			for(int i=0;i<v;i++ ){
				for(int j=0;j<v;j++ ){
					int aux=tam;
					if(j==0){
						aux--;
					}
					if(aux!=0)
						str="%"+aux+"d";
					else str="%d";
					ps.print(String.format(str,vet[i][j]));
				}	
				ps.println();
			}

			ps.println();

		}
	}
	
	
}

