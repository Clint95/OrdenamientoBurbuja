package Ordenamientos;
/**
 * @author Juan Ricardo Rodriguez
 * @version 1.0.0
 * @since OrdenamientoBurbuja 1.0.0
 */
import java.util.Scanner;

public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        inicia en main habilitando la entrada de datos por teclado
        */
        Scanner Ingresado= new Scanner (System.in);
        OrdenamientoBurbuja burbuja = new OrdenamientoBurbuja();
        
        System.out.println("Hola, este programa realiza el procedimiento llamado"
                + ".... Ordenamiento de Burbuja....");
        /*
        solicita el tamañao del vector que se quiere ordenar
        */
        System.out.println("Digita el tamaño del arreglo a ordenar ");
            int valor=Ingresado.nextInt();
            int[] arreglo = new int[valor];
        /*
        solicita los elementos del vector uno a uno    
        */    
        System.out.println("Digita los elementos del arreglo");
            for(int i=0;i<valor;i++){
                    arreglo[i]=Ingresado.nextInt();
            }
        /*
            se hace el llamado a los metodos para ordenar e imprimir el vector
            */    
            burbuja.ordenarB(arreglo);
            OrdenamientoBurbuja.listarArreglo(arreglo);
    }
    
}
