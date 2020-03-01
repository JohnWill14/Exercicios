import java.util.Scanner;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
public class Main1159{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){
                int a;
                while(true){
                        a=sc.nextInt();
                        if(a==0)break;
                        a=a%2==0?a:a+1;
                        int count=0,soma=0;
                        for(int i=a;count<5;i+=2){
                                count++;
                                soma+=i;
                        }
                        ps.println(soma);
                }
        }
}
