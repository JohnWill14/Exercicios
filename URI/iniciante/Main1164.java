import java.util.Scanner;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
public class Main1164{
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
                        int sun=0;
                        for(int i=1;i<a;i++)
                                if(a%i==0)sun+=i;
                        if(sun==a)ps.println(a+" eh perfeito");
                        else ps.println(a+" nao eh perfeito");
                }
        }
}

