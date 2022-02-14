package calculadora;




/**
 * @author Diego Llive
 * 
 
 *
 */
public class suma {
	
	
	/**
	 * Mètodo que devulve el resultado de la suma de dos nùmeros enteros  
	 * @param a es el primer nùmero para realizar la suma 
	 * @param b es el segundo nùmero para realizar la suma 
	 * @return devuelve el valor de la suma de a+b 
	 */
	
	public int suma_enteros (int d , int m) { // mètodo que nos devuele un valor entero , con los parametros a y b 
		  
		  int totals ;
		  	totals = d+m  ; 
		  	return totals ; 
	  }
	
	
	
	
	/**
	 * Mètodo que devuelve el resultado de la suma de dos nùmeros reales 
	 * @param a es el primen nùmero para realizar la suma 
	 * @param b es el segundo nùmero para realizar la suma 
	 * @return devuelve el valor de la suma de a+b
	 */
	
	public double suma_reales (double a , double b) { // mètodo que nos devuelve un valor decimal , con los parametros a y b 
		  
		  int totalr ; 
		  	totalr = (int) ((int) a+b) ;
		  	return totalr ;
		  }
	
	 
	
	/**
	 * Metodo que devuelve el resultado de la suma de tres nùmero reales 
	 * @param a es el primer nùmero para realizar la suma 
	 * @param b es el segundo nùmero para realizar la suma 
	 * @param c es el tercer nùmero para realizar la suma 
	 * @return devulve el valor de la suma entre a+b+c 
	 */
	
	public double suma_3reales (double a , double b , double c) { // mètodo que nos devuelve un valor decimal , con los parametros a , b y c
		  
		  int totalr3 ;
		  totalr3 = (int) ((int) a+b+c) ;
		  return totalr3 ; 
	  }
	
	
	
	/**
	 * Metodo que guarda la suma del valor acumulado
	 * @param a es el nùmero que va a sumar el valor acumulado 
	 * @return devuelve el resultado 
	 */
	public int valor_acumulado (int a) { 
		  
		  int totalv ;
		  totalv = a ;
		  
		  int Sumatorio = 0 ;
		  int Contador = 0 ;
		  
		  while (Contador !=0) {
			  
			  Sumatorio = Sumatorio + Contador ; 
			  Contador -- ; 
			  
			  
		  }
		  
		  return totalv ; 
	
	

}
}
