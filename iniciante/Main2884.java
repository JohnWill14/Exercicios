import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.PrintStream;

 

public class Main2884{
	private static Scanner sc;
	private static PrintStream ps;
	private static int cont=0;
	static{
		sc=new Scanner(System.in);
		ps=System.out;
	}
	public static void main(String[] args) {
		int nInterruptores=sc.nextInt();
		int l=sc.nextInt();

		int[] lampadas=new int[l];

		int nacesas=sc.nextInt();
		List<Integer> acesas=new ArrayList<>();
		for(int i=0;i<nacesas;i++){
			acesas.add(sc.nextInt()-1);
			lampadas[acesas.get(i)]=1;
		}

		Interruptor[] interruptores=new Interruptor[nInterruptores];
		int[] aux;
		for(int i=0;i<nInterruptores;i++){
			int qtd=sc.nextInt();
			aux=new int[qtd];
			for(int j=0;j<qtd;j++)aux[j]=sc.nextInt()-1;

			Interruptor input=new Interruptor(aux);
			interruptores[i]=input;
		}

		int cont=0,percorreInterruptor=0;
		while(algumaLigada(lampadas)){
			if(cont>0){
				if(percorreInterruptor==nInterruptores){
					percorreInterruptor=0;
					if(estadoOrigem(acesas,lampadas)){
						cont=-1;
						break;
					}
				}
			}

			cont++;
			apagaLampadas(interruptores[percorreInterruptor],lampadas);
			percorreInterruptor+=1;

		}
		ps.println(cont);
	}
	public static void apagaLampadas(Interruptor interruptor,int[] lampadas){
		for(int apaga:interruptor.getLampadas()){
			lampadas[apaga]=lampadas[apaga]==0?1:0;
		}
	}
	public static boolean algumaLigada(int... vet){
		for(int i:vet){
			if(i==1)return true;
		}
		return false;
	}
	public static boolean estadoOrigem(List<Integer> acesas,int[] vet){
		for(int i=0;i<vet.length;i++){
			if(vet[i]==1){
				if(!acesas.contains(i))return false;
			}
		}
		return true;
	}
	
	private static class Interruptor{
		private int[] lampadas;
		public Interruptor(int[] vet){
			this.lampadas=vet;
		}
		public  void setLampadas(int[] vet){
			this.lampadas=vet;
		}
		public  int[] getLampadas(){
			return this.lampadas;
		}
	}
	
}
