/**
 * La clase Fecha tiene la intención de representar el tipo abstracto fecha.
 * Aunque ya existen librerías encargadas de esta funcion:
 * @see <a href="http://www.baeldung.com/java-8-date-time-intro"> Ver documentacion tipo Time </a>
 * En este ejercicio podemos tener una compresión más profunda de su funcionamiento interno.
 * 
 * @author Mauricio Toro, Andres Paez
 * @version 1
 */
import java.util.Date;
import java.time.LocalDateTime;

public class Fecha {
    

    /*
    varibales con atributo final indican que una variable es de tipo 
    constante, es decir, no admitirá cambios después de su declaración y asignación de valor.
    final determina que un atributo no puede ser sobreescrito o redefinido.
    Se le asigna esta característica para evitar que se sobrescriban valores.
    tener en cuenta tipado de las 3 variables!.
    */

    private final int dia;
    private final int mes;
    private final int año;


    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Fecha(int dia, int mes, int año) {
      
     
     
      
      Date hoy = new Date();
      this.mes= hoy.getMonth()+1;
      this.año=hoy.getYear()+1900;
      this.dia=hoy.getDay();
      
    
    }

    /**
     * Método para obtener la variable global dia.
     *
     * @return el dia
     */
    public int dia() {
      return dia;
    }

    /**
     * Método para obtener la variable global mes.
     *
     * @return el mes
     */
    public int mes() {
      return mes;
    }

    /**
     * Método para obtener la variable global anio.
     *
     * @return el año
     */
    public int año() {
      return año;
    }

    /**
    * @param otra representa la fecha con la cual se va a comparar.
    *
    * El método comprar se encarga de devolvernos respuesta a tres posibilidades.
    * 1: si la fecha es menor que la otra retorna -1.
    * 2: si la fecha es igual que la otra retorna 0.
    * 3: si la fecha es mayor que la otra retorna 1.
    *
    * @return -1 sí es menor; 0 sí es igual; 1 sí es mayor.
    *
    */

  /*  public int comparar(Fecha otra) {
      
        
    }*/


     /**
    * toString se encargará de convertir el tipo abstracto fecha en un tipo cadena
    * para su posterior visualización
    *
    * @return una cadena que contiene la fecha
    */
   /* public String toString() {
        int mensaje= "año: "+año+"mes: "+mes+"dia: "+dia;
        return mensaje;
    }*/
    
    public static void main (String args[]){
     Object obj = new Object();
       Date hoy = new Date();
      LocalDateTime localDate= LocalDateTime.now().plusDays(2);
       LocalDateTime localDate2= LocalDateTime.now();
       int cont=0;
     
            if(localDate2.equals(localDate)){
                cont=0;
            }else{
                if(localDate2.compareTo(localDate)>0){
                    cont++;
                }else{
                     if(localDate2.compareTo(localDate)<0){
                    cont--;
                }
            }
        }
      System.out.println(cont);


    }
}