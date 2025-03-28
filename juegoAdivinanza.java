import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(100) + 1; 
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int maxIntentos = 10;
        int numeroUsuario = 0;
        boolean adivinado = false;
        boolean entradaValida = false;

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Debes adivinar un número entre 1 y 100.");
        System.out.println("Tienes 10 intentos. ¡Buena suerte!");

        while(intentos < maxIntentos){

            System.out.println("Intento "+ (intentos+1) +" de "+ maxIntentos +". Introduce un numero: ");
            
            if (scanner.hasNextInt()) {
                numeroUsuario = scanner.nextInt();
                entradaValida = true;
            } 
            else {
                System.out.println("Error: Entrada no valida. Por favor, ingresa un número entre 1 y 100.");
                scanner.next(); 
            }

                 if (numeroUsuario < 1 || numeroUsuario > 100) {
                    System.out.println("Número fuera de rango. Introduce un número entre 1 y 100.");
                    continue;
                }

                if(entradaValida==true)
                 intentos++;

                if (numeroUsuario == numeroAleatorio) {
                    System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                    adivinado = true;
                    break;
                }

                else if (numeroUsuario < numeroAleatorio) 
                    System.out.println("El número es mayor. Intenta de nuevo.");
                
                else 
                    System.out.println("El número es menor. Intenta de nuevo.");
                

        }

            if (!adivinado) 
            System.out.println("Lo siento, has agotado tus intentos. El número era " + numeroAleatorio);

            scanner.close();

 }
}
