package daw.programacion.modifiers;

import daw.programacion.modifiers.nonaccess.StaticModifier;

import static daw.programacion.modifiers.nonaccess.StaticModifier.numeroDeAmigos;
import static daw.programacion.modifiers.nonaccess.StaticModifier.printearNumeroDeAmigos;;

public class Modifiers {
    public static void main(String[] args) {

        StaticModifier finn = new StaticModifier("Finn");
        StaticModifier jake = new StaticModifier("Jake");
        StaticModifier bmo = new StaticModifier("BMO");

        System.out.println(bmo.numeroDeAmigos); // se puede acceder desde una instancia, pero no es lo recomendado
        System.out.println(StaticModifier.numeroDeAmigos); // mejor así, no hace falta llamar a un objeto, con el nombre
                                                           // de la clase accedemos
        System.out.println(numeroDeAmigos); // si hacemos un import static (ver arriba) no hace falta nombar la clase

        // igual con los métodos estáticos
        bmo.printearNumeroDeAmigos(); // no recomendado
        StaticModifier.printearNumeroDeAmigos(); // foirma correcta
        printearNumeroDeAmigos(); // con import static

    }
}
