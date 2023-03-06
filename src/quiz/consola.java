/* el ejercicio requeria un programa sin interaccion con el usuario donde
se hicieran presente los 4 algoritmos de ordenamiento y los dos algoritmos de busqueda
(seleccion,burbuja,insercion,mergesort)(secuencial y binario)
*/
package quiz;
import java.util.Random;
public class consola {

  
    public static void main(String[] args) {
        AlgoritmosByo objeto=new AlgoritmosByo();
        System.out.println("se generara un arreglo de numeros aleatorios");
        System.out.println("se usara un tamaño de 10-20 datos enteros del 0 al 15 pero en el codigo se tratara como una variable este tamaño");
        System.out.println("esto debido a que no habra interacción consola-usuario, el numero a buscar tambien sera aleatorio dentro de dicho rango");
        System.out.println("todos estos rangos son modificables y no afecta el funcionamiento si se ponen limites distintos");
        //en este caso se tomo lo que sale en consola y asi se asignan los valores, pero sino se cambian
        //y funciona normal el programa con diferentes rangos y tamaños
        int aleatorio=0,tamaño=0;
        int min=10,max=20;
        int rango=15;
       //para asignar un valor aleatorio dentro de un rango se utiliza una librearia
       //la cual para usarse se necesita crear este objeto:
        Random t=new Random();
        //aqui se le asigna el valor aleatorio dentro de ese rango maximo y minimo a la variable
        tamaño=t.nextInt(max-min+1)+min;
        
        //cree distintos vectores para que cada algoritmo lo ordenara por si mismo ya que con
        //solo uno, una vez se ordene por un metodo a los otros ese vector ya les llega ordenado
         int [] vector= new int [tamaño];
         int [] vector1= new int [tamaño];
         int [] vector2= new int [tamaño];
         int [] vector3= new int [tamaño];
         int [] vector4= new int [tamaño];
         //aqui se le asigna un valor x dentro del rango al valor que se va a buscar en los de busqueda
         aleatorio=(int)(Math.random()*rango);
        for(int i=0;i<tamaño;i++)
        {
            vector[i]=(int)(Math.random()*rango);
        }
         for(int i=0;i<tamaño;i++)
        {
            vector1[i]=vector[i];
            vector2[i]=vector[i];
            vector3[i]=vector[i];
            vector4[i]=vector[i];
        }
        System.out.println("el tamaño del vector es: "+tamaño);
        System.out.println("el vector es de la siguiente forma: ");
        for(int i=0;i<tamaño;i++)
        {
            System.out.print(vector[i]+"//");
        }
        System.out.println("ordenamiento por burbuja: ");
        objeto.burbuja(vector);
        System.out.println(" ");
        System.out.println("ordenamiento por insercion: ");
        objeto.insercion(vector1);
        System.out.println(" ");
        System.out.println("ordenamiento por seleccion: ");
        objeto.seleccion(vector2);
        System.out.println(" ");
        System.out.println("ordenamiento por mergesort: ");
        objeto.mergesort(vector3);
        System.out.println(" ");
        System.out.println("busqueda secuencial: ");
        objeto.secuencial(vector4,aleatorio);
        System.out.println(" ");
        System.out.println("busqueda binaria: ");
        objeto.binaria(vector4,aleatorio);
        System.out.println(" ");
    }
    
    
}
