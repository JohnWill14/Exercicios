import java.util.Scanner;
import java.io.PrintStream;

public class Main1098{
	private static PrintStream  out;
	private static Scanner input;	
	public static void main(String[] args) {
		out=System.out;
		input=new Scanner(System.in);
	
		for (double i=0;i<=2 ;i+=0.2 ) {
			for(int j=1;j<=3;j++){
				if(!isDecimal(i))
					out.print("I="+String.format("%.1f",i));
				else
					out.print("I="+String.format("%.0f",i));
				if(!isDecimal(i+j)){
					out.println( " J="+String.format("%.1f",i+j));
				}else{
					out.println( " J="+String.format("%.0f",i+j));
				}
			}
			
		}
	}
	public static boolean isDecimal(double x){
		int num= (int)((x+1)*10);
		//System.out.println(""+num);
		if(num%10==0)return true;
		return false;
	}
}
