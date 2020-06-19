import java.util.Scanner;
import java.io.PrintStream;
public class Main1114{
	private static Scanner sc;
	private static PrintStream out;
	static{
		sc=new Scanner(System.in);
		out=System.out;
	}
	public static void main(String args[]){
		repeticao:while(true){
			int a=sc.nextInt();
			if(a!=2002)out.println("Senha Invalida");
			else{
				out.println("Acesso Permitido");
				break repeticao;
			}
		}
	}

}
