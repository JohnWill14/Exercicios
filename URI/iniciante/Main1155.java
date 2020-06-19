import java.util.Scanner;
import java.io.PrintStream;
public class Main1155{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){
                double soma=0; 
                for(int i=1;i<=100;i++)soma+=1.0/i;
                ps.println(String.format("%.2f",soma));
        }
}   
    
