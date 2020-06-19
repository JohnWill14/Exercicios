import java.util.Scanner;
import java.io.PrintStream;

public class Main1904{
	private static PrintStream  out;
	private static Scanner input;	
	public static void main(String[] args) {
		out=System.out;
		input=new Scanner(System.in);

		int repete=input.nextInt();

		int cobaia=0,coelhos=0,ratos=0,sapos=0;

		while(repete-- >0){
			int qtd=input.nextInt();
			String caractere=input.next();
			switch (caractere){
				case "C":
					coelhos+=qtd;
					break;
				case "R":
					ratos+=qtd;
					break;
				case "S":
					sapos+=qtd;
					break;

			}
			cobaia+=qtd;
		}
		saida(cobaia,coelhos,ratos,sapos);
	}
	private static void saida(int cobaias,int coelhos,int ratos,int sapos){
		System.out.println("Total: "+cobaias+" cobaias");
		System.out.println("Total de coelhos: "+coelhos);
		System.out.println("Total de ratos: "+ratos);
		System.out.println("Total de sapos: "+sapos);

		System.out.println("Percentual de coelhos: "+formata(coelhos/(cobaias*1.0)*100)+" %");
		System.out.println("Percentual de ratos: "+formata(ratos/(cobaias*1.0)*100)+" %");
		System.out.println("Percentual de sapos: "+formata(sapos/(cobaias*1.0)*100)+" %");

	}
	private static String formata(double x){
		 return String.format("%.2f",(x));

	}
}
