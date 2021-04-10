package ceu.usp.pr2;

/**
 * Clase que calcula de forma recursiva y no recursiva distintas funciones
 *
 */
public class App {

    public static int factorialIterativo (int numero){
        int valor = 1;
        for (int i = 1; i <= numero; i++){
            valor *= i;
        }
        return valor;
    }
    
    public static int factorialRecursivo(int numero){
        if (numero == 1){
            return 1;
        }else{
            return numero * factorialRecursivo(--numero);
        }
    }

    public static void main( String[] args ){
        System.out.println(factorialIterativo(10));
    }
}
