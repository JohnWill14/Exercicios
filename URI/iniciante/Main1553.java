import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintStream;

public class Main1553{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		while(true){
			int n=sc.nextInt();


			int feq=sc.nextInt();

			if(n+feq==0)break;
			
			int[] perguntas=new int[n];
			for(int i=0;i<n;i++){
				perguntas[sc.nextInt()-1]+=1;
			}
			int cont=0;
			for(int i=0;i<n;i++){
				if(perguntas[i]>=feq)cont++;
			}
			ps.println(cont);
			


		}
	}
	
	public static  boolean tripaPitagorica(int a,int b,int c){
		int somaQuadrados=a*a+b*b;
		return (c*c)==somaQuadrados;
	}
	public static  boolean tripaPrimitiva(int a,int b,int c){
		if(mdc(a,b)==1||mdc(b,c)==1){
			return true;
		}
		return false;
	}
	public static int mdc(int a,int b){
		if(b==0){
			return a;
		}
		return mdc(b,a%b);
	}	
}

