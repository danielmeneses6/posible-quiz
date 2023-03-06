/* el ejercicio requeria un programa sin interaccion con el usuario donde
se hicieran presente los 4 algoritmos de ordenamiento y los dos algoritmos de busqueda
(seleccion,burbuja,insercion,mergesort)(secuencial y binario)
en esta clase es donde se encuentran todos los metodos o los algoritmos
en el caso de los de ordenamiento se manda como parametro el vector creado en consola
y en el caso de los de busqueda se mada como parametro el vector y un numero asignado de manera
aleatoria dentro de un determinado rango el caul es aquel que se buscara en el vector
*/

package quiz;

import java.util.Arrays;

public class AlgoritmosByo {

 public void burbuja(int[] v)
    {
        int aux=0;
         for(int i=0; i<v.length;i++)
        {
            for(int j=0; j<(v.length-1);j++)
            {
                if(v[j]>v[j+1])
                {
                    aux=v[j];
                    v[j]=v[j+1];
                    v[j+1]=aux;
                }
            }
        
        }
         System.out.println("el arreglo ordenado por este metodo queda de la forma: ");
         for(int i=0;i<v.length;i++)
         {
             System.out.print(v[i]+"//");
         }
    }
    public void insercion(int[] v1)
    {
        for (int i = 1; i < v1.length; ++i) {
        int k = v1[i];
        int j = i - 1;
        while (j >= 0 && v1[j] > k) {
            v1[j + 1] = v1[j];
            j = j - 1;
        }
        v1[j + 1] = k;
    }
         for(int i=0;i<v1.length;i++)
         {
             System.out.print(v1[i]+"//");
         }
    }
    public void seleccion(int[] v2)
    {
        int minimo,aux;
        for(int i=0;i<v2.length;i++)
        {
            minimo=i;
            for(int j=i+1;j<v2.length;j++)
            {
                if(v2[j]<v2[minimo])
                {
                    minimo=j;
                }
            }
            aux=v2[i];
            v2[i]=v2[minimo];
            v2[minimo]=aux;
        }
         for(int i=0;i<v2.length;i++)
         {
             System.out.print(v2[i]+"//");
         }
    }
    public void mergesort(int[] v3)
    {
       mergeSort(v3, 0, v3.length - 1);
        System.out.println("el arreglo ordenado por este metodo quedaria de la siguiente manera: ");
        System.out.println(Arrays.toString(v3));
    }
    public void mergeSort(int[] v3, int par, int par1) {
       if (v3.length > 1) {
        int mid = v3.length / 2;
        int[] leftArr = Arrays.copyOfRange(v3, 0, mid);
        int[] rightArr = Arrays.copyOfRange(v3, mid, v3.length);
        mergeSort(leftArr, 0, leftArr.length - 1);
        mergeSort(rightArr, 0, rightArr.length - 1);
        merge(v3, leftArr, rightArr);
       }
    }
    public void merge(int[] v3, int[] leftArr, int[] rightArr) {
        int i = 0, j = 0, k = 0;
    while (i < leftArr.length && j < rightArr.length) {
        if (leftArr[i] <= rightArr[j]) {
            v3[k++] = leftArr[i++];
        } else {
            v3[k++] = rightArr[j++];
        }
    }
    while (i < leftArr.length) {
        v3[k++] = leftArr[i++];
    }
    while (j < rightArr.length) {
        v3[k++] = rightArr[j++];
    }
    }
    public void secuencial(int[] v4,int a)
    {
        System.out.println("se buscó el numero: "+a+" por metodo secuencial");
        boolean b=false;
        int pos=0,rep=0;
        for(int i=0;i<v4.length;i++)
        {
            if(b==false)
            {
            if(v4[i]==a)
            {
                b=true;
                pos=i;
            }
            }
            else
            {
                 if(v4[i]==a)
            {
                rep++;
            }
            }
        }
        if(b==true)
        {
            if(rep==0)
            System.out.println("numero: "+a+" encontrado en la posicion: "+pos+" del arreglo");
            else
                System.out.println("numero: "+a+" encontrado en diversas posiciones, siendo una aparicion en la posicion: "+pos+" del arreglo");
        }
        else
            System.out.println("el numero que se busca no se encontro en el arreglo");
    }
    public void binaria(int[] v4,int a)
    {
        Arrays.sort(v4);
        int inicio = 0;
        int fin = v4.length - 1;
        boolean encontrado = false;
        int medio = 0;

        while (inicio <= fin && !encontrado) {
            medio = (inicio + fin) / 2;
            if (v4[medio] == a) {
                encontrado = true;
            } else if (v4[medio] < a) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        if (encontrado==true) {
            System.out.println("el numero: "+a+" fue encontrado");;
        } else {
            System.out.println("el numero: "+a+" no fue encontrado");;
        }
    }
    }
//para entender los diferentes algoritmos es mejor buscar una explicacion en linea,
//pero basicamente a cada uno le llegan los datos asignados aleatoriamente desde consola
//y en los metodos ya se hace el procesos necesario para llegar al objetivo de cada uno
