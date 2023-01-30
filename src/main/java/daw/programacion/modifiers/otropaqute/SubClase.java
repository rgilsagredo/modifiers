package daw.programacion.modifiers.otropaqute;

import daw.programacion.modifiers.access.AccessModifiers;

public class SubClase extends AccessModifiers {

    public void metodo() {
        // System.out.println(this.mensajeDefault); // no ok por no estar en el mismo
        // paquete
        System.out.println(this.mensajePublic); // ok por ser public
        System.out.println(this.mensajeProtected); // ok por estar ser subclase
        // System.out.println(this.mesajePrivate); // no es posible pues estoy en otra
        // clase

    }

    @Override
    public void metodoNoFinal() {
        System.out.println("Estoy siendo sobreescrito por SubClase");
    }

    // @Override
    // public void metodoFinal() {
    //     System.out.println("Esto no es posible pues el metodo es final en la clase padre");
    // }

}
