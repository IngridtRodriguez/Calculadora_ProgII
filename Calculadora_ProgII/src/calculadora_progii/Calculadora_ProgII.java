/*
Hecho por:
         Rodríguez, Ingridt
         Sanchez, Jason     
Salón 1IL 124
 */
package calculadora_progii;
import java.util.Scanner;

public class Calculadora_ProgII {

    public static void main(String[] args) {
        double a = 0, b, i, resultado=0;
        char r = 0;
        int continua=0;
        Scanner in= new Scanner (System.in);
        
        while (r!='='){
            
            if(continua==1)
            {
                a=0;
                System.out.println("Ingrese un operador ");
                r=in.next().charAt(0);
                if(r=='=')
                    break;
                resultado=Calculadora.calcular(a,resultado,r);
            }
                    
            if(continua==0)
            {
                System.out.println("Ingrese un número: ");
                a=in.nextDouble();
            }
            System.out.println("Ingrese un operador ");
            r=in.next().charAt(0);
            if(r=='=')
                    break;
            else
                if (r!='+' && r!='-' && r!='*' && r!='/')
            {
               for (i=0;i<1;i++)
                {
                    System.out.println("Signo no válido,inserte un signo valido: ");
                    r=in.next().charAt(0);
                    if (r!='+' && r!='-' && r!='*' && r!='=')
                        i--;
                }
            }
        else
            resultado = Calculadora.calcular(a,resultado,r);
        
        continua=1;
            
        }
        System.out.println("El resultado final:\n  "+resultado);
    }

    
    
}
