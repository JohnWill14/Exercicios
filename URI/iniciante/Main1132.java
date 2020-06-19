import java.util.Scanner;
import java.io.PrintStream;

public class Main1132{
	private static PrintStream  out;
	private static Scanner sc;	
	static{
		out=System.out;
		sc=new Scanner(System.in);
	}	
	public static void main(String[] args) {
		int a=sc.nextInt(),b=sc.nextInt();
		if(a>b){
			int aux=a;
			a=b;
			b=aux;
		}
		long soma=0;
		for(int i=a;i<=b;i++)soma+=isMult13(i)?0:i;
		out.println(soma);
	}
	public static boolean isMult13(int n){
		return n%13==0;
	}
	
}
