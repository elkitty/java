package egg.guia3;

public class ejercicioExtra2 {

    /*
     * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
    A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
    C tome el valor de A, A tome el valor de D y D tome el valor de B.
    Mostrar los valores iniciales y los valores finales de cada variable.
    Utilizar sólo una variable auxiliar.
     */
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int C = 15;
        int D = 20;
        int temp;

        System.out.println("Valores iniciales:");
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);

        temp = B;
        B = C;
        C = A;
        A = D;
        D = temp;

        System.out.println("Valores finales:");
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);
    }

}
