// Suma de números enteros definidos por el usuario almacenados en un arreglo.

public class SumaArreglo {

    public static void main(String[] args) 
    {
        int sum[] = new int[20];
        int suma = 0, n;
        
        for (int count = 0; count < sum.length; count++)
        {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor " + (count + 1) + ":")); // Se muestra mensaje para que el usuario decida los numeros enteros.
            sum[count] = n;
            suma += sum[count];
        }

        for (int count = 0; count < sum.length; count++) // Ciclo for para imprimir elementos dentro del arreglo.
        {
            System.out.println(sum[count]);
        }
        
        JOptionPane.showMessageDialog(null,"La suma de los elementos del arreglo es: " + suma); //Imprimir suma total usando JOptionPane.
    }
}