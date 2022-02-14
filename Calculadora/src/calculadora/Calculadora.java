/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Adrian, Irene, Diego F,  Diego L
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	
    	Producto p1= new Producto();
		p1.prod1(5, 1);
		p1.prod2(-2, -5);
		p1.prod3Nega(5, 9, 0);
		p1.pot1(2, 4445);

		
         Resta resta = new Resta();
         var variableUno = resta.numerosEnteros(5, 3);
         var variableDos = resta.numerosReales(1, 2);
         var variableTres = resta.numerosReales(3, 5, 2);
         var variableCuatro = resta.sobreAcumulado(1);
         
         
        Cociente c1 = new Cociente();
        var numerosReales = c1.numerosReales(5.0, 2.0);
        var numerosEnteros = c1.numerosEnteros(2, 5);
        var inversoNumeroReal = c1.inversoNumeroReal(5);
        var raiz = c1.raiz(2);
        
        
        Suma s1= new Suma();
        System.out.println(s1.suma_enteros(5,4));
        System.out.println(s1.suma_reales(3.4,4.2));
        System.out.println(s1.suma_3reales(4.5,2.4,5.7));
        System.out.println(s1.valor_acumulado(3));
    }
}
