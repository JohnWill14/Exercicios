import java.util.Scanner;
import java.io.PrintStream;
public class Main1099{
	private static Scanner sc;
	private static PrintStream out;
	static{
		sc=new Scanner(System.in);
		out=System.out;
	}
	public static void main(String args[]){
		int num=sc.nextInt();
		while(num-- >0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(b<a){
				int aux=a;
				a=b;
				b=aux;
			}
			int soma=0;
			for(int i=a+1;i<b;i++){
				if(i%2==1)soma+=i;
			}
			out.println(soma);
		}
	}
}
