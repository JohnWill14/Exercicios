import java.util.Scanner;
import java.io.PrintStream;
public class Main1534{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int n;
		while(sc.hasNextInt()){
			n=sc.nextInt();
			if(n==0)break;
			int[][] matriz=new int[n][n];
			preencheMatriz(matriz);	
			imprimiMatriz(matriz);				
		}
	}
	public static void preencheMatriz(int[][] m){
		for(int i=0;i<m[0].length;i++)
			for(int j=0;j<m[0].length;j++)
				m[i][j]=3;
		int pos=0;	
		
		for(int i=0;i<m[0].length;i++){
			m[i][pos]=1;
			m[i][m[0].length-1-pos]=2;
			pos+=1;
		}
	}

	public static void imprimiMatriz(int[][] m){
		for(int i=0;i<m[0].length;i++){			
			for(int j=0;j<m[0].length;j++){
				ps.print(String.format("%d",m[i][j]));
			}
			ps.println();
		}
//		ps.println();
	}
}
