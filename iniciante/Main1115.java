import java.util.Scanner;
import java.io.PrintStream;
public class Main1115{
	private static Scanner sc;
	private static PrintStream out;
	static{
		sc=new Scanner(System.in);
		out=System.out;
	}
	public static void main(String args[]){
		repeticao:while(true){
			int a=sc.nextInt(),b=sc.nextInt();
			if(a==0||b==0)break repeticao;
			if(a>0&&b>0)out.println("primeiro");
			else if(a<0&&b>0)out.println("segundo");
			else if(a<0&&b<0)out.println("terceiro");
			else out.println("quarto");
		}
	}

}
