import java.util.Scanner;
import java.io.PrintStream;
public class Main1435{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int n;
		while(true){
			n=sc.nextInt();
			if(n==0)break;
			int[][] matriz=new int[n][n];
			preencheMatriz(matriz);	
			imprimiMatriz(matriz);				
		}
	}
	public static void preencheMatriz(int[][] m){
		int ii=0,ie=m[0].length;
		while(true){
			if(ie%2==0&&ii==ie)break;
			if(ie%2!=0&&ii>ie)break;
			for(int i=ii;i<ie;i++){
				for(int j=ii;j<ie;j++){
					m[i][j]+=1;
				}
			}
			ie--;
			ii++;
		}
	}
	public static void imprimiMatriz(int[][] m){
		for(int i=0;i<m[0].length;i++){			
			for(int j=0;j<m[0].length;j++){
				if(j>0)
					ps.print(String.format("%4d",m[i][j]));
				else 
					ps.print(String.format("%3d",m[i][j]));
			}
			ps.println();
		}
		ps.println();
	}
}
