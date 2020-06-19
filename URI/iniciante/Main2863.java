import java.util.Scanner;
import java.io.PrintStream;
public class Main2863{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		while(sc.hasNextInt()){
			int itens=sc.nextInt();

			double menor=12d;

			while(itens-- >0){
				double d=sc.nextDouble();
				if(menor>d)menor=d;
			}
			ps.println(String.format("%.2f",menor));
		}
	}
	
	
}

