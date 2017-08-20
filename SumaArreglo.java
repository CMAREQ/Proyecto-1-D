// Suma de números enteros aleatorios almacenados en un arreglo.

public class SumaArreglo {

    public static void main(String[] args) 
    {
        int sum[] = new int[20];
        int suma = 0, rand;
        
        for (int count = 0; count < sum.length; count++)
        {
            rand = (int) (Math.random() * (100) + 1); // Generar números aleatorios entre 1 y 100, incluyendolos.
            sum[count] = rand;
            suma += sum[count];
        }

        for (int count = 0; count < sum.length; count++) // Ciclo for para imprimir elementos dentro del arreglo.
        {
            System.out.println(sum[count]);
        }
        
        System.out.println("La suma de los elementos del arreglo es: " + suma); //Imprimir suma total.
    }
}