import java.util.Scanner;
import java.io.PrintStream;
public class Main2871{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		while(sc.hasNextInt()){
			int a=sc.nextInt();
			int b=sc.nextInt();

			int litros=0; 

			for(int i=0;i<a;i++){
				for(int j=0;j<b;j++){
					litros+=sc.nextInt();
				}
			}
			ps.println(litros/60+" saca(s) e "+(litros%60)+" litro(s)");
		}

	}
	
	
	
}

