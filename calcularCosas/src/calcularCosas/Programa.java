package calcularCosas;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.setProperty("console.encoding", "UTF-8");
        Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el sexo (H/M): ");
        char sexo = scanner.nextLine().charAt(0);

        System.out.print("Ingrese el peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la altura (cm): ");
        double altura = scanner.nextDouble();

        // Crear objeto de la clase Persona
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        // Mostrar estado de peso de la persona 1
        int estadoPeso1 = (int) persona1.calcularIMC();

        if (estadoPeso1 == -1) {
            System.out.println(persona1.getNombre() + " está por debajo de su peso ideal.");
        } else if (estadoPeso1 == 0) {
            System.out.println(persona1.getNombre() + " está en su peso ideal.");
        } else {
            System.out.println(persona1.getNombre() + " tiene sobrepeso.");
        }

        // Comprobar si la persona 1 es mayor de edad
        boolean esMayor1 = persona1.esMayorDeEdad();
        System.out.println(persona1.getNombre() + " es mayor de edad: " + esMayor1);

        // Mostrar información de la persona 1
        System.out.println("Información de " + persona1.getNombre() + ":");
        System.out.println(persona1);
    }
}
