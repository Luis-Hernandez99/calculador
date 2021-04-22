package calculador;

import java.util.Scanner;
public class calculador 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner (System.in);
        
        int numero1,numero2, suma, resta,multiplicacion,division;
        
        System.out.println ("Dame el primer numero");
        numero1 = entrada.nextInt();
        System.out.println ("Dame el segundo numero");
        numero2 = entrada.nextInt();
        
        suma = numero1+numero2;
        resta = numero1-numero2;
        multiplicacion = numero1*numero2;
        division = numero1/numero2;
        
        System.out.println ("El resultado de la suma es"+suma);
        System.out.println ("El resultado de la resta es"+resta);
        System.out.println ("El resultado de la multiplicacion es"+multiplicacion);
        System.out.println ("El resultado de la division es"+division);
    }
}