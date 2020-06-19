import java.util.Scanner;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
public class Main1165{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){

                int n=sc.nextInt();
                while(n-- >0){
                        int a=sc.nextInt();
                        boolean sun=true;
                        for(int i=2;i<=(int)Math.sqrt(a);i++)
                                if(a%i==0)sun=false;
                        if(sun)ps.println(a+" eh primo");
                        else ps.println(a+" nao eh primo");
                }
        }
}
