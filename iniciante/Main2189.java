import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintStream;

public class Main2189{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int cont=0;
		while(true){
			cont++;
			int qtd=sc.nextInt();
			if(qtd==0)break;
			int ganhador=0;
			for(int i=1;i<=qtd;i++){
				if(sc.nextInt()==i){
					ganhador=i;
				}
			}
			ps.println("Teste "+cont);
			ps.println(ganhador+"\n");
		}
	}

	
}

