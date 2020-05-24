import java.util.Scanner;
import java.util.Arrays;
import java.io.PrintStream;

public class Main1582{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		while(sc.hasNextInt()){
			int[] num=new int[3];
			for(int i=0;i<3;i++)num[i]=sc.nextInt();
			Arrays.sort(num);
			int a=num[0];
			int b=num[1];
			int c=num[2];

			if(!tripaPitagorica(a,b,c)){
				ps.println("tripla");
			}else{
				ps.print("tripla pitagorica");
				if(tripaPrimitiva(a,b,c)){
					ps.print(" primitiva");
				}
				ps.println();
			}

		}
	}
	
	public static  boolean tripaPitagorica(int a,int b,int c){
		int somaQuadrados=a*a+b*b;
		return (c*c)==somaQuadrados;
	}
	public static  boolean tripaPrimitiva(int a,int b,int c){
		if(mdc(a,b)==1||mdc(b,c)==1){
			return true;
		}
		return false;
	}
	public static int mdc(int a,int b){
		if(b==0){
			return a;
		}
		return mdc(b,a%b);
	}	
}

