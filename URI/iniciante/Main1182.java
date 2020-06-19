import java.util.Scanner;
import java.io.PrintStream;
public class Main1182{
        private static Scanner sc;
        private static PrintStream ps;
        static{
                sc=new Scanner(System.in);
                ps=System.out;
        }
        public static void main(String... args){
                int linha=sc.nextInt();
                double[][] matriz=new double[12][12];

                char  c =sc.next().charAt(0);
                for(int i=0;i<12;i++)
                        for(int j=0;j<12;j++)
                                matriz[i][j]=sc.nextDouble();
                double res=0;
                switch(c){
                case 'S':
                        for(int i=0;i<12;i++)res+=matriz[i][linha];
                case 'M':
                        for(int i=0;i<12;i++)res+=matriz[i][linha];
                        res/=12.0;
                }
                ps.println(String.format("%.1f",res));
                
        }
}
