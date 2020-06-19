import java.util.Scanner;
import java.io.PrintStream;
public class Main2868{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		int cont=Integer.parseInt(sc.nextLine());
		while(cont-- >0){
			String[] entrada=sc.nextLine().split(" ");
			int valor=resultado(Integer.parseInt(entrada[0]),entrada[1],
				Integer.parseInt(entrada[2]));
			int ans=Integer.parseInt(entrada[4]);

			int distancia=Math.abs(ans-valor);
			ps.print("E");

			for(int i=0;i<distancia;i++){
				ps.print("r");
			}
			ps.println("ou!");
		}
	}
	public static int resultado(int a,String operator,int b){
		int valor=0;
		switch(operator){
			case "+":
				valor=a+b;
			break;
			case "-":
				valor=a-b;
			break;
			default:
				valor=a*b;
				break;
		}
		return valor;
	}
	
	
}

