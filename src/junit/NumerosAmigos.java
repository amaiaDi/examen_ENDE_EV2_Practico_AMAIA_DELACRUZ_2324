package junit;

public class NumerosAmigos {
	private int n1;
	private int n2;
	
	public NumerosAmigos(int a, int b){
		n1=a;
		n2=b;
	}

	/**
	 * Comprueba si dos numeros son amigos 
	 * @return boolean
	 */
	public boolean amigo(){
		
		//Comprueba si dos numeros son amigos 
		boolean esAmigo = false;
		
		int rdo_n1=0,rdo_n2=0;

		//Suma los divisores de N1
		for(int i = 1;i < n1;i++){
			if(n1% i == 0){
				rdo_n1+= i;
			}
		}

		//Suma los divisores de N2
		for(int i = 1;i < n2;i++){
			if(n2% i == 0){
				rdo_n2+= i;
			}
		}

		//Si la suma de los divisores del N1 es igual a N2, los numeros son amigos. 
		//o si la suma de los divisores del N2 es igual a N1, los numeros son amigos. 
		if(rdo_n1 == n2 && rdo_n2 == n1){
			esAmigo = true;
		}

		return esAmigo;
	}
	
	/**
	 * Metodo que devuelve Null si N1 o N2 es igual a 0,
	 * si n1 es igual a n2 devuelve un Integer de 1, si no devuelve un Integer de 0
	 * @return Integer
	 */
	public Integer esN1IgualAN2(){
		
		//Si n1 o n2 es 0 devuelve null
		if(n1==0 || n2==0) {
			return null;
		}else if(n1==n2) {
			return 1;
		}else {
			return 0;
		}
	}
	
} 

