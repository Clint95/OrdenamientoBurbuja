
package Ordenamientos;
/**
 * esta clase contiene los metodos necesarios para el funcionamiento del programa
 * @author Juan Ricardo Rodriguez
 * @version 1.0.0
 * @since OrdenamientoBurbuja 1.0.0
 */
public class OrdenamientoBurbuja {
    /** 
    *@param arreglo recibe como parametro un arreglo digitado en el main para
    * poder orednarlo
    *@return arreglo retorna el arreglo ya ordenado 
    *@since OrdenamientoBurbuja 1.0.0
    */
    public int[] ordenarB(int [] arreglo){
     int temporal;
     int tamaño=arreglo.length;
     
        for(int i=1;i<tamaño;i++){
            for(int j=0;j<tamaño-1;j++){
                if(arreglo[j]>arreglo[j+1]){
                    temporal=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temporal;
                    
                }
            }
        }
        return arreglo;
    }
    /**
    * este metodo permite listar el arreglo ya ordenado por un llamado desde
    * el main
    * @param arre recibe el arreglo ordenado como parametro para poder imprimirlo
    * @since OrdenamientoBurbuja 1.0.0
    */
    public static void listarArreglo(int [] arre){
        String Cadena=" ";
            for(int i=0; i<arre.length;i++){
                Cadena= Cadena+ arre[i]+"  ";
            }
        System.out.println("Arreglo Ordenado");
        System.out.print(Cadena);
    }

}

