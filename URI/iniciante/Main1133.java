import java.util.Scanner;
import java.io.PrintStream;

public class Main1133{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int a=sc.nextInt();
		int b=sc.nextInt();
		int[] vet=sort(a,b);
		a=vet[0];b=vet[1];
		for(int i=++a;i<b;i++){
			if(confirm(i))ps.println(i);
		}	
	} 
	public static boolean confirm(int x){
		int resto=x%5;
		return resto==2||resto==3;
	}
	public static int[] sort(int number,int number2){
		if(number>number2){
			int aux=number;
			number=number2;
			number2=aux;
		}	
		return new int[]{
			number,number2
		};
	}
}
