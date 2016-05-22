package calculadora_progii;
import java.util.Scanner;

public class Calculadora {
   
    static double calcular(double a, double resultado, char r) {
        double b;
        Scanner in= new Scanner (System.in);
    System.out.println("Inserte otro numero: ");
    b=in.nextDouble();
    
    switch(r)
    {
        case '+':
            resultado = (resultado+b)+a;
            break;
        case '-':
            if(resultado==0)
                resultado= (resultado+a)-b;
            else
                resultado = (resultado-b)-a;
            break;
        case '*':
            if (a==0)
                resultado = (resultado*b);
            else
                resultado = (resultado*b)*a;
            break;
        case '/':
            if (b==0)
                resultado=0;
            else if(resultado==0)
                resultado=a/b;
            else
                resultado=(resultado)/b;
    }
    return resultado;
    }
    
}
