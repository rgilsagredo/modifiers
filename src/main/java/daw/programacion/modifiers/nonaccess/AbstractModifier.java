package daw.programacion.modifiers.nonaccess;

public abstract class AbstractModifier { // no puedo crear objetos de esta clase
    /*
     * El modificador abstract se puede aplicar a clases y métodos.
     */

    /*
     * Para clases es simple: una clase abstracta NO puyede ser instanciada
     * (no puedo crear objetos de esa clase). PEro sí puede extenderse.
     * El propósito de clases abstractas es prevenir que se puedan crear objetos
     * de esa clase porque "no tendría sentido".
     * Las clases abstractas sirven como placeholder de atributos y métodos
     * de sus subclases, pero nunca van a ser usadas per se.
     * El ejemplo fácil es el de Animal <-- Perro <-- Doberman
     * Solo la clase Doberman (quizás Perro también) tiene sentido ser instanciada
     * (qué es un animal?), por tanto Animal y Perro serían abstractas, pero
     * Doberman no.
     * 
     * Así, en las clases abstractas metemos toda la funcionalidad que es común a
     * subclases, y las subclases ya especializarán lo que necesiten.
     * Eso sí, a veces la funcionalidad se deja hecha en la superclase abstracta
     * y a veces solo se deja "mencionada", dejando que la subclase especifique.
     * 
     */

    /*
     * Los métodos abtractos solo pueden existir en clases abstractas.
     * No quedan definidos (es decir, se dejan sin body)
     * Pero cualquier subclase de la clase que tiene un método abstracto
     * está OBLIGADA a implementarlo (o dejarlo como abstracto y
     * "pasar el marrón a la siguiente subclase").
     * 
     * El propósito de métodos abtractos es obligar funcionalidad a las subclases
     * 
     */
    public abstract void metodoAbstracto(); // se "dice" lo que hace en subclases

    public void metodoNoAbstracto() {
        System.out.println("Soy un método no abstracto, no estoy obligado a ser implementadfo en subclases");
    }

    public final void metodoFinal(){
        System.out.println("Soy un método final y bno puedo ser sobreescrito");
    }

}
