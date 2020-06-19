import java.util.Scanner;
import java.io.PrintStream;
public class Main1478{
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
		boolean soma;
		int count=0;
		while(count<m[0].length){
			soma=false;
			int valor=1;
			for(int i=0;i<m[0].length;i++){
				if(soma)m[count][i]=++valor;
				else m[count][i]=count-i+1;

				if(i==count)soma=true;
			}
			count+=1;
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
