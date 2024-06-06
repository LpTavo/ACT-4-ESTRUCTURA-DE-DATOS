import java.util.Arrays;

public class EjemploArrays {
    public static void main(String[] args) {
       
        int[] numeros = {5, 3, 8, 1, 2};

      
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));

     
        int indice = Arrays.binarySearch(numeros, 3);
        System.out.println("Índice del elemento 3: " + indice);

     
        int[] copiaNumeros = Arrays.copyOf(numeros, 7);
        System.out.println("Copia del array con longitud 7: " + Arrays.toString(copiaNumeros));

       
        Arrays.fill(copiaNumeros, 5);
        System.out.println("Copia del array lleno de 5: " + Arrays.toString(copiaNumeros));

      
        String[] nombres = {"Ana", "Luis", "Pedro"};
        System.out.println("Array de nombres: " + Arrays.toString(nombres));
        System.out.println("Lista de nombres: " + Arrays.asList(nombres));
    }
}
