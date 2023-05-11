package tarea;

import java.util.Scanner;

public class zodiaco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String fechaNacimiento;

		do {
			System.out.println("Ingrese la fecha de nacimiento (en formato dd/mm), o 'salir' para terminar: ");
			fechaNacimiento = scanner.nextLine();

			if (!fechaNacimiento.equalsIgnoreCase("salir")) {
				// Extraer el día y el mes de la fecha de nacimiento
				int dia, mes;
				try {
					dia = Integer.parseInt(fechaNacimiento.substring(0, 2));
					mes = Integer.parseInt(fechaNacimiento.substring(3, 5));

					if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
						System.out.println("Fecha de nacimiento invalida. Por favor, ingrese una fecha valida.");
						System.out.println();
						continue;
					}

					// Determinar el signo zodiacal
					String signoZodiacal = determinarSignoZodiacal(dia, mes);

					// Mostrar el resultado
					System.out.println("Tu signo zodiacal es: " + signoZodiacal);
					System.out.println();
				} catch (NumberFormatException | StringIndexOutOfBoundsException e) {
					System.out.println("Formato de fecha invalido. Por favor, ingrese una fecha valida.");
					System.out.println();
				}
			}
		} while (!fechaNacimiento.equalsIgnoreCase("salir"));

		scanner.close();
	}

	public static String determinarSignoZodiacal(int dia, int mes) {
		String signo = "";
		if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
			signo = "Acuario";
		} else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
			signo = "Piscis";
		} else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
			signo = "Aries";
		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
			signo = "Tauro";
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			signo = "Géminis";
		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			signo = "Cáncer";
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
			signo = "Leo";
		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			signo = "Virgo";
		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			signo = "Libra";
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			signo = "Escorpio";
		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			signo = "Sagitario";
		} else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
			signo = "Capricornio";
		}
		return signo;
	}
}
