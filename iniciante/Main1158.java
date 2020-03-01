import java.util.Scanner;
import java.io.PrintStream;
import java.util.List;
import java.util.ArrayList;
public class Main1158{
        private static Scanner sc;
        private static PrintStream ps;
        private static long[]  numeros;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
                numeros=new long[62];
                for(int i=0;i<numeros.length;i++)numeros[i]=-1;
        }
        public static void main(String... args){
                int casos=sc.nextInt();
                while(casos-- >0){
                        int a=sc.nextInt(),b=sc.nextInt();
                        a=a%2!=0?a:a+1;
                        int cont=0,soma=0;
                        for(int i=a;cont<b;i+=2){
                                soma+=i;
                                cont+=1;
                        }
                        ps.println(soma);
                }
        }
}
