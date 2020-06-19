import java.util.Scanner;
import java.io.PrintStream;
public class Main1188{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		String s=sc.next();
		double[][] vet=new double[12][12];
		for(int i=0;i<12;i++)
			for(int j=0;j<12;j++)vet[i][j]=sc.nextDouble();
		double sun=0;
		int count=0;
		for(int i=7;i<12;i++)
			for(int j=12-i;j<i;j++){
				sun+=vet[i][j];
				count+=1;
				//ps.println("OLA "+count);
		}
		double ans;
		if(s.equals("M"))ans=sun/count;
		else ans=sun;
		ps.println(String.format("%.1f",ans));	
	}
}
