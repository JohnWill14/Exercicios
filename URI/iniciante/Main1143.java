import java.util.Scanner;
import java.io.PrintStream;

public class Main1143{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){
                int n=sc.nextInt();
                for(int i=1;i<=n;i++)ps.println(i+" "+(i*i)+" "+(i*i*i));

        }
}
1
