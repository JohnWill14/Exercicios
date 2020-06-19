import java.util.Scanner;
import java.io.PrintStream;

public class Main2880{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String[] args) {
		String mensage=sc.next();
		String crib=sc.next();
		
		int dif=mensage.length()-crib.length();
		int cont=0;
		for(int i=0;i<=dif;i++){
			boolean nomeQualquer=false;
			for(int j=0;j<crib.length();j++){	
				int indice=j;
				if(mensage.charAt(j+i)==crib.charAt(indice)){
					nomeQualquer=true;
					break;
				}
			}
			if(!nomeQualquer)cont++;
		}
		ps.println(cont);
	}
}
