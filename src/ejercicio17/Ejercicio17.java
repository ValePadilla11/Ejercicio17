/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;
import java.util.Scanner;
public class Ejercicio17 {

    public static void main(String[] args) {
        double r, a, l;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del radio:");
        r = entrada.nextDouble();
        a = Math.PI * Math.pow(r,2);
        l = 2 * Math.PI * r;
        System.out.println("El radio es: " + r);       
        System.out.println("El area del circulo es: " + a);       
        System.out.println("La longuitud de la circunferencia : " + l);
        
        
    }
    
}
