import java.util.Scanner;
import java.io.PrintStream;

public class Main1131{
	private static PrintStream  out;
	private static Scanner sc;	
	static{
		out=System.out;
		sc=new Scanner(System.in);
	}	
	public static void main(String[] args) {
		int gInter=0,gGremio=0,inter=0,gremio=0,empate=0,cont=0;		
		while(true){
			cont++;
			int a=sc.nextInt();
			int b=sc.nextInt();
			gInter+=a;gGremio+=b;
			if(a==b)empate++;
			else if(a>b)inter++;
			else gremio++;
			out.println("Novo grenal (1-sim 2-nao)");
			int opt=sc.nextInt();
			if(opt==2)break;
		}
		out.println(cont+" grenais");
		out.println("Inter:"+inter);
		out.println("Gremio:"+gremio);
		out.println("Empates:"+empate);
		out.println((inter>gremio?"Inter":"Gremio")+" venceu mais");
	}
	
}
