import java.util.Scanner;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
public class Main1176{
	private static Scanner sc;
	private static PrintStream ps;
	private static long[]  numeros;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
		numeros=new long[65];
		for(int i=0;i<numeros.length;i++)numeros[i]=-1;
	}
	public static void main(String... args){
		int qt=sc.nextInt();
		while(qt>0){
			qt--;
			int n=sc.nextInt();
			StringBuffer sb=new StringBuffer();
			fibo(n);
			sb.append("Fib("+n+") = "+fibo(n));
			ps.println(sb);
		}
	}
	public static long  fibo(int b){
		
		if(b==1)return 1;
		if(b<=0)return 0;
		if(numeros[b]!= -1)return numeros[b];

		long fib=fibo(b-1)+fibo(b-2);
		numeros[b]=(fib);
		return numeros[b];
	}
}
