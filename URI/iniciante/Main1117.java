import java.util.Scanner;
import java.io.PrintStream;

public class Main1117{
	private static PrintStream  out;
	private static Scanner sc;	
	static{
		out=System.out;
		sc=new Scanner(System.in);
	}	
	public static void main(String[] args) {
		int cont=0;
		double soma=0;
		while(true){
			if(cont==2)break;
			double nota;
			nota=sc.nextDouble();
			if(nota<0||nota>10){
				out.println("nota invalida");			
				continue;
			}
			cont++;	
			soma+=nota;
		}	
		out.println("media = "+String.format("%.2f",soma/2));
	}
	
}
