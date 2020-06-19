import java.util.Scanner;
import java.io.PrintStream;
public class Main1183{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		double[][] matriz=new double[12][12];

		String c =sc.next();
		for(int i=0;i<12;i++)
			for(int j=0;j<12;j++)
				matriz[i][j]=sc.nextDouble();
		double res=0;
		int count=0;
		for(int i=0;i<12;i++){
			for(int j=0;j<12;j++)
				if(j>i){
					count+=1;
					res+=matriz[i][j];
				}
		}
		if(c.equals("S")){
			res=res;
		}
		else{

			res/=count;
		}
		ps.println(String.format("%.1f",res));
		
	}
}
