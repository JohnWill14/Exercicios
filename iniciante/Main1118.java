import java.util.Scanner;
import java.io.PrintStream;

public class Main1118{
	private static PrintStream  out;
	private static Scanner sc;	
	static{
		out=System.out;
		sc=new Scanner(System.in);
	}	
	public static void main(String[] args) {
		int cont=0,opt=0;
		double soma=0;
		main:while(true){
			cont=0;
			soma=0;
			repete:while(true){
				if(cont==2)break repete;
				double nota;
				nota=sc.nextDouble();
				if(nota<0||nota>10){
					out.println("nota invalida");			
					continue repete;
				}
				cont++;	
				soma+=nota;
			}	
			out.println("media = "+String.format("%.2f",soma/2));
			do{
				out.println("novo calculo (1-sim 2-nao)");
				opt=sc.nextInt();
			}while(opt<1||opt>2);

			if(opt==2)break main;
		}
	}
	
}
