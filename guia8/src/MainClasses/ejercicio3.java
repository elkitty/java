package MainClasses;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author marianomello
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PersonaServicio personaservicio = new PersonaServicio();
        Persona[] personas = new Persona[4];
        int[] imcResultados = new int[4];
        boolean[] mayoresEdad = new boolean[4];

        // Crear los objetos de tipo Persona
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingresa los datos de la persona " + (i + 1));
            personas[i] = personaservicio.crearPersona();
            imcResultados[i] = personaservicio.calcularIMC(personas[i]);
            mayoresEdad[i] = personaservicio.esMayorDeEdad(personas[i]);
        }

        // imprimir línea vacía
        System.out.println("-----------------");

        // Mostrar resultados
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Resultados para la persona " + (i + 1) + ":");
            System.out.println(personas[i]);
            System.out.println("Es mayor de edad: " + mayoresEdad[i]);
            switch (imcResultados[i]) {
                case -1:
                    System.out.println("Tiene bajo peso");
                    break;
                case 0:
                    System.out.println("Tiene peso normal");
                    break;
                case 1:
                    System.out.println("Tiene sobrepeso");
                    break;
            }
            System.out.println();
        }

        // Calcular porcentajes
        int porcentajeBajoPeso = 0;
        int porcentajeNormal = 0;
        int porcentajeSobrepeso = 0;
        int cantidadMayoresEdad = 0;
        int cantidadMenoresEdad = 0;
        for (int i = 0; i < personas.length; i++) {
            if (imcResultados[i] == -1) {
                porcentajeBajoPeso++;
            } else if (imcResultados[i] == 0) {
                porcentajeNormal++;
            } else {
                porcentajeSobrepeso++;
            }
            if (mayoresEdad[i]) {
                cantidadMayoresEdad++;
            } else {
                cantidadMenoresEdad++;
            }
        }
        double porcentajeBajoPesoFinal = (porcentajeBajoPeso * 100) / personas.length;
        double porcentajeNormalFinal = (porcentajeNormal * 100) / personas.length;
        double porcentajeSobrepesoFinal = (porcentajeSobrepeso * 100) / personas.length;
        double porcentajeMayoresEdad = (cantidadMayoresEdad * 100) / personas.length;
        double porcentajeMenoresEdad = (cantidadMenoresEdad * 100) / personas.length;

        // Mostrar porcentajes
        System.out.println("Porcentaje de personas con bajo peso: " + porcentajeBajoPesoFinal + "%");
        System.out.println("Porcentaje de personas con peso normal: " + porcentajeNormalFinal + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrepesoFinal + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenoresEdad + "%");
    }

}
