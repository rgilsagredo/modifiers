package daw.programacion.modifiers.nonaccess;

public class StaticModifier {
    /*
     * Se puede usar para clases, pero no lo vamos a ver, así que solo para
     * atributos y métodos
     * La idea de static es que el atributo/método pertence a la clase, e lugar de a
     * una instancia de la clase
     * Por tanto, no tengo que crear objetos de esa clase para poder acceder a algo
     * static.
     * Además, se comparte entre los objetos de la clase
     */

    public static int numeroDeAmigos;
    private String nombreDeAmigo;

    public StaticModifier(String nombreDeAmigo) {
        this.nombreDeAmigo = nombreDeAmigo;
        numeroDeAmigos++;
        // cada vez que llamemos al constructor, aumenta el número de amigos, y es común
        // para todas las instancias de la clase
        // ver daw.programacion.modifiers.Modifiers para ver cómo actúa
    }

    public static void printearNumeroDeAmigos() {
        System.out.println("Tienes " + numeroDeAmigos + " amigos");
    }

}
