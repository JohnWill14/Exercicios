import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintStream;
public class Main2872{
	private static Scanner sc;
	private static PrintStream ps;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String... args){
		while(sc.hasNextLine()){
			List<String> packages=new ArrayList<>();
			boolean adiciona=false;
			while(true){
				String entrada=sc.nextLine();
				if(entrada.equals("1")){
					adiciona=true;
				}else if(entrada.equals("0")){
					Collections.sort(packages);
					for(String s:packages){
						ps.println(s);
					}
					ps.println();
					break;
				}else if(adiciona){
					packages.add(entrada);
				}
			}

		}

	}
	
	
	
}

