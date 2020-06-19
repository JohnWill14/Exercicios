import java.util.Scanner;
import java.io.PrintStream;
public class Main2862{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int cont=sc.nextInt();
		while(cont-- >0){
			ps.println(sc.nextInt()>8000?"Mais de 8000!":"Inseto!");
		}
	}
	
	
}

