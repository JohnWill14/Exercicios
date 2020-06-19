import java.util.Scanner;
import java.util.Collections;
import java.util.HashSet;
import java.io.PrintStream;
import java.util.Set;
import java.util.Iterator;
import java.util.Comparator;
public class Main1589{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int a=sc.nextInt();
		while(a-- >0){
			int a1=sc.nextInt();
			int a2=sc.nextInt();
			ps.println(a1+a2);
		}
	}
	
	
}

