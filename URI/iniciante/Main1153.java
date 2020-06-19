import java.util.Scanner;
import java.io.PrintStream;
public class Main1153{
	private static Scanner sc;
	private static PrintStream ps;
	private static long[]  numeros;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
		numeros=new long[47];
		for(int i=0;i<numeros.length;i++)numeros[i]=-1;
	}
	public static void main(String... args){
		int n=sc.nextInt();
		ps.println(fat(n));
	}
	public static long  fat(int n){
		if(numeros[n]!=-1)return numeros[n];
		if(n==1)return 1;
		long  fatorial=n*fat(n-1);
		numeros[n]=fatorial;
		return numeros[n];
	} 
	
}
