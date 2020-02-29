import java.util.Scanner;
import java.io.PrintStream;

public class Main1142{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){
                int numero=sc.nextInt();
                int variante=1;
                for(int i=0;i<numero;i++){
                        for(int j=variante;j<variante+3;j++)ps.print(j+" ");
                        ps.println("PUM");
                        variante+=4;
                }
        }
}
