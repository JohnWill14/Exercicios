import java.util.Scanner;
import java.io.PrintStream;

public class Main2251{
	private static Scanner sc;
	private static PrintStream ps;
	private static int cont=0;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String[] args) {
		int numero=0;
		while(true){
			numero+=1;
			int qtd=sc.nextInt();
			if(qtd==0)break;
						ps.println("Teste "+numero);
			ps.println(String.format("%.0f",Math.pow(2,qtd)-1d)+"\n");
		}
		
	}
	
}
