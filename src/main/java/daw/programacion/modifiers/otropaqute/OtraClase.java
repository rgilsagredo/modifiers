package daw.programacion.modifiers.otropaqute;

import daw.programacion.modifiers.access.AccessModifiers;

public class OtraClase {

    public void metodo() {
        AccessModifiers am = new AccessModifiers();
        // System.out.println(am.mensajeDefault); // no ok por no estar en el mismo paquete
        System.out.println(am.mensajePublic); // ok por ser public
        // System.out.println(am.mensajeProtected); // no ok por no estar en el mismo paquete 
        // System.out.println(am.mesajePrivate); // no es posible pues estoy en otra clase

    }

}
