import java.util.Scanner;
import java.io.PrintStream;

public class Main1116{
	private static PrintStream  out;
	private static Scanner sc;	
	static{
		out=System.out;
		sc=new Scanner(System.in);
	}	
	public static void main(String[] args) {
		int num=sc.nextInt();
		while(num-- >0){
			int a=sc.nextInt(),b=sc.nextInt();
			if(b==0)out.println("divisao impossivel");
			else{
				out.println(String.format("%.1f",a/(b*1.0)));
			}
		}		
		
	}
	
}
