import java.util.Scanner;

public class CalificacionesMateria {
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner (System.in);
		
		float actividad1, actividad2, evidencia1, actividad3, actividad4, evidencia2;
		
		System.out.println ("Calificacion actividad1: ");
		actividad1 = entrada.nextFloat();
		System.out.println ("Calificacion actividad2: ");
		actividad2 = entrada.nextFloat();
		System.out.println ("Calificacion evidencia1: ");
		evidencia1 = entrada.nextFloat();
		System.out.println ("Calificacion actividad3: ");
		actividad3 = entrada.nextFloat();
		System.out.println ("Calificacion actividad4: ");
		actividad4 = entrada.nextFloat();
		System.out.println ("Calificacion evidencia2: ");
		evidencia2 = entrada.nextFloat();
		
		actividad1 *= 0.10f; 
		actividad2 *= 0.10f;
		evidencia1 *= 0.30f;
		actividad3 *= 0.10f;
		actividad4 *= 0.10f;
		evidencia2 *= 0.30f;

		float notaFinal = actividad1 + actividad2 + evidencia1 + actividad3 + actividad4 + evidencia2;
		
		System.out.println("EL resultado final es: " + notaFinal);
		
	}

}
