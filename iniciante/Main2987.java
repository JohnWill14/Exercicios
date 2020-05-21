import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;
public class Main2987{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		char c=sc.next().toLowerCase().charAt(0);
		ps.println((int)c-'a'+1);
	}
	
	
	
}

