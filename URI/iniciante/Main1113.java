import java.util.Scanner;
import java.io.PrintStream;
public class Main1113{
	private static Scanner sc;
	private static PrintStream out;
	static{
		sc=new Scanner(System.in);
		out=System.out;
	}
	public static void main(String args[]){
		repeticao:while(true){
			int a=sc.nextInt(),b=sc.nextInt();
			if(a==b)break repeticao;
			else if(a<b)out.println("Crescente");
			else out.println("Decrescente");
		}
	}

}
