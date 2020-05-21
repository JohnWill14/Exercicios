import java.util.Scanner;
import java.io.PrintStream;
public class Main1564{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		while(sc.hasNextInt()){
			ps.println(sc.nextInt()==0?"vai ter copa!":"vai ter duas!");
		}
	}
	
	
}

