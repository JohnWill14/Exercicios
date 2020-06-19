import java.util.Scanner;
import java.io.PrintStream;

public class Main1145{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){
                int a=sc.nextInt(),b=sc.nextInt();
                int count=1;
                int br=0;
                while(count!=b+1){
                        br+=1;
                        ps.print(count);
                        count+=1;
                        if(br%a==0){
                                br=0;
                                ps.println();

                        }
                        else ps.print(" ");
                }
        }
}

