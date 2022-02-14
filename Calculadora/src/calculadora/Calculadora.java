/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Adrian
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
         int  variableUno = resta.numerosEnteros(5, 3);
         double variableDos = resta.numerosReales(1, 2);
         double variableTres = resta.numerosReales(3, 5, 2);
         double variableCuatro = resta.sobreAcumulado(1);
         
        Cociente c1 = new Cociente();
        double numerosReales = c1.numerosReales(5.0, 2.0);
        double numerosEnteros = c1.numerosEnteros(2, 5);
        double inversoNumeroReal = c1.inversoNumeroReal(5);
        double raiz = c1.raiz(2);
    }
    
}
