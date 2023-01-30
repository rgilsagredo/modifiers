package daw.programacion.modifiers.access;

import static daw.programacion.modifiers.nonaccess.FinalModifier.UN_MENSAJE_CONSTANTE;

public class OtraClase {

    public void metodo() {

        AccessModifiers am = new AccessModifiers();
        System.out.println(am.mensajeDefault); // ok por estar en el mismo paquete
        System.out.println(am.mensajePublic); // ok por ser public
        System.out.println(am.mensajeProtected); // ok por estar en el mismo paquete (aunque no es subclase)
        // System.out.println(am.mesajePrivate); // no es posible pues estoy en otra
        // clase

        System.out.println(UN_MENSAJE_CONSTANTE);
        // si hago un import static me traigo la constante y la puedo usar alegremente
        // sin tener que hacer FinalModifier.UN_MENSAJE_CONSTANTE

    }

}
