import java.util.Scanner;
import java.io.PrintStream;
public class Main1101{
	private static Scanner sc;
	private static PrintStream out;
	static{
		sc=new Scanner(System.in);
		out=System.out;
	}
	public static void main(String args[]){
		repeticao:while(true){
			int a=sc.nextInt(),b=sc.nextInt();
			if(a<=0||b<=0)break repeticao;
			int sum=0;
			if(b<a){
				int aux=a;
				a=b;
				b=aux;
			}		
			for(int i=a;i<=b;i++){
				out.print(i+" ");
				sum+=i;
			}	
			out.println("Sum="+sum);
		}
	}

}
