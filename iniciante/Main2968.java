import java.util.Scanner;
import java.io.PrintStream;

public class Main2968{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String[] args) {
		int voltas=sc.nextInt();
		int placas=sc.nextInt();

		double fator=((voltas*placas)/10d);
		for(int i=0;i<9;i++){
			double val=Math.ceil(fator+fator*i);
			ps.print(String.format("%.0f",val));
			if(i!=8)ps.print(" ");
		}
		ps.println();
		
	}
}
