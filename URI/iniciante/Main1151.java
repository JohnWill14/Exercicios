import java.util.Scanner;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
public class Main1151{
	private static Scanner sc;
	private static PrintStream ps;
	private static int[]  numeros;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
		numeros=new int[47];
		for(int i=0;i<numeros.length;i++)numeros[i]=-1;
	}
	public static void main(String... args){
		int n=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		fibo(n);
		for(int i=0;i<n-1;i++){
			sb.append(fibo(i)+" ");
		}
		sb.append(fibo(n-1));
		ps.println(sb);
	}
	public static int  fibo(int b){
		
		if(numeros[b]!= -1)return numeros[b];
		if(b<=0)return 0;
		if(b==1)return 1;

		int fib=fibo(b-1)+fibo(b-2);
		numeros[b]=(fib);
		return numeros[b];
	}
}
