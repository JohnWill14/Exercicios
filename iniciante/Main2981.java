import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;
public class Main2981{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int a=sc.nextInt();
		int b=sc.nextInt();
		int valor=(a/b);
		ps.print("A UFSC fecha dia ");
		if(valor<=9){
			valor+=21;
			ps.print(valor+" de setembro.");
		}else{
			valor-=9;
			ps.print(valor+" de outubro.");

		}
		ps.println();
	}
	
	
	
}

