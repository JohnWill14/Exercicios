import java.util.Scanner;
import java.io.PrintStream;
public class Main1156{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){
                double soma=0; 
                for(int i=0,qt=1;qt<=39;i+=1,qt+=2)soma+=qt/Math.pow(2,i);
                ps.println(String.format("%.2f",soma));
        
        }
}   

