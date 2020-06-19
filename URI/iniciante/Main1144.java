import java.util.Scanner;
import java.io.PrintStream;

public class Main1144{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){
                int n=sc.nextInt();
                for(int i=1;i<=n;i++){
                        ps.println(i+" "+pow(i,2)+" "+pow(i,3));
                        ps.println(i+" "+(pow(i,2)+1)+" "+(pow(i,3)+1));
                
                }
                        
        }
        public static int pow(int number,int exp){
                
                return (int) (Math.pow(number,exp));
        }
}
