import java.util.Scanner;
import java.io.PrintStream;

public class Main1149{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){
                int a,b;
                a=sc.nextInt();
                do{ 
                        b=sc.nextInt();
                }while(b<=0);  
                int soma=0;
                for(int i=a;i<a+b;i++)soma+=i;
                ps.println(soma);
        }
}   
