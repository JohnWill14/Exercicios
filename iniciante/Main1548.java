import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintStream;

public class Main1548{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int n=sc.nextInt();
		while(n-- >0){
			int q=sc.nextInt();
			int[] val=new int[q];
			int[] test=new int[q];
			for(int i=0;i<q;i++){
				int v=sc.nextInt();
				val[i]=v;
				test[i]=v;
			}
			Arrays.sort(val);
			// Arrays.reverse(val);
			int cont=0;
			for(int i=0;i<q;i++){
				// ps.print(val[i]);
				if(val[q-1-i]==test[i])cont++;
			}
			ps.println(cont);
		}	
	
	}
	
	
}

