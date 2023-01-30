package daw.programacion.modifiers.nonaccess;

public final class FinalModifier {

    /*
     * final tiene diferente comportamiento según sea final class, final método o
     * final variable
     */

    /*
     * si decimos final class (como esta clase) le dice a java que esta clase no
     * puede tener subclases. Usar solo cuando *realmente* no tenga nigún sentido
     * poder/querer hacer subclases de una clase dada. En general, siempre
     * es buena idea poder extender funcionalidad.
     */

    /*
     * si decimos final metodo, lo que hacemos es que prohibimos a las subclases
     * hacer un @Override de ese método. Se usa para métodos de alguna clase padre
     * que
     * tienen que tener una funcionalidad común en todas las subclases.
     * Ver método metodoFinal en la clase
     * daw.programacion.modifiers.access.AccessModifiers
     * y en su subclase daw.programacion.modifiers.otropaqute.SubClase
     */

    /*
     * una variable/atributo final es que solo se le puede asignar un valor
     * exactamente una vez.
     * El pricipal uso es crear constantes, es decir, cosas que no van a cambiar en
     * la ejecución del programa.
     * OJO: las conctantes se declaran como public/protected/default/private static
     * final
     * NOMBRE_CONSTANTE justo después de
     * la declaracion de la clase (es decir, al principio del código, antes edel
     * resto de atributos)
     */

    public static final String UN_MENSAJE_CONSTANTE = "mensaje constante"; // declaración de una constante
    private final int NUMERO = 0;

    public void metodo() {
        // this.NUMERO = 3; // no es posible cambiar el valor, pues el atributo es final
        final String str;
        str = "valor";
        // str = "otra cosa"; // no es posible pues ya tiene un valor asignado
        System.out.println(UN_MENSAJE_CONSTANTE); // puedo acceder tranquilamente a las constantes desde cualquier punto de mi clase
        // ver también daw.programacion.modifiers.otropaqute.OtraClase
    }
}

// class OtraClase extends FinalModifier{

// // esto no puede ocurrir pues FinalModifier es final

// }
