import java.util.*;

public class Ejercicio5 {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int total;
	
		int hombresmenores = 0;
		int mujeresmayores = 0;
	
		int sexo;
		int edad;
		System.out.println("Escriba el numero total de edades que desea ingresar");
		total = scanner.nextInt();
		for (int i = 0 ;i < total;i++) {
			System.out.println("Ingrese el sexo de la persona para tener su edad ( " + (i+1) + " )");
			System.out.println("1. Masculino");
			System.out.println("2. Femenino");
			sexo = scanner.nextInt();
			if (sexo==1) {
				System.out.println("Ingrese la edad (masculino)");
				edad = scanner.nextInt();
				if (edad<18) {
					hombresmenores = hombresmenores+1;
				}
			} else {
				System.out.println("Ingrese la edad (Femenino)");
				edad = scanner.nextInt();
				if (edad>=18) {
					mujeresmayores = mujeresmayores+1;
				}
			}
		}
		System.out.println("El total de mujeres mayores de Edad son "+mujeresmayores);
		System.out.println("El total de hombres menores de Edad son "+hombresmenores);
	}


}

