#include<bits/stdc++.h>
using namespace std;

int main(){

	while(true){
		//Se pegar o Coreia trollou geral
		double a,b,c,d;
		scanf("%lf %lf %lf %lf",&a,&b,&c,&d);
		if(a+b+c+d==0)break;

		double valor=((a/2.0+b)*c)/(d*1.0);
		printf("%.5f\n",valor);
	}

}
