mport java.util.Scanner;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
public class Main1160{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){

                int n=sc.nextInt();
                while(n-- >0){
                        int pa=sc.nextInt(),pb=sc.nextInt();
                        double  ga=sc.nextDouble(),gb=sc.nextDouble();
                        int anos=0;
                        while(pa<=pb){
                                anos+=1;
                                pa+=(int)pa*ga/100;
                                pb+=(int)pb*gb/100;
                                if(anos>100)break;
                        }
                        if(anos>100)ps.println("Mais de 1 seculo.");
                        else ps.println(anos+" anos.");
                }
        }
}
