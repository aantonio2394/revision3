package revision_codigo5;

import java.util.Scanner;// le puse esto para poder usar el scanner de abajo

public class Codigo5 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);// Crear un objeto Scanner para la entrada del usuario usando scanner

       
        System.out.print("Introduzca un número: ");//

        // Leer un número entero desde la entrada estandar en lugar de nextLine() y la conversion incorrecta de String a int
        int c = s.nextInt();

       
        int afo = 0;
        int noAfo = 0;

      
        while (c > 0) {
      
            int digito = c % 10;

            // aqui Verifica si el dígito es 3, 7, 8 o 9 y actualizar contadores
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
                afo++;
            } else {
                noAfo++;
            }

            
            c /= 10;
        }

        // Comparar contadores y mostrar si el número es afortunado o no
        if (afo > noAfo) {
            System.out.println("El número es afortunado.");
        } else {
            System.out.println("El número no es afortunado.");
        }

        // Cerrar el Scanner para evitar pérdida de recursos, que se fuguen 
        s.close();
    }
}
