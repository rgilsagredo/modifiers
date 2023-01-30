package daw.programacion.modifiers.access;

public class AccessModifiers {

    /*
     * Los modificadores de acceso especifican la accesibilidad/scope de una
     * clase/atributo/metodo
     * 
     * Los modificadores son public,protected,default,private en función de menos a
     * más restricción (ojo default no se suele usar, y se "pone" no poniendo ningún
     * otro modificador)
     * 
     * Si algo es public, se puede acceder a ese algo cualquier otra clase
     * 
     * Si algo es protected, se puede acceder a ese algo desde cualquier clase del
     * mismo paquete y desde subclases (que pueden estar en otros paquetes)
     * 
     * Si algo es default, se puede acceder a ese algo desde el mismo paquete
     * exclusivamente
     * 
     * Si algo es private, solo se puede acceder a ese algo desde la propia clase
     * 
     */

    /*
     * Para las clases, solo tiene sentido definir modificadores public y default.
     * Si haces una clase "private class NombreClase()", esa clase no puede ser
     * instanciada en ningún otro sitio, y por tanto no hace nada.
     */

    private String mensajePrivate = "mensaje private";
    String mensajeDefault = "mensaje default";
    protected String mensajeProtected = "mensaje protected";
    public String mensajePublic = "mensaje public";
    /*
     * Ves la clase OtraClase de este paquete y la clase OtraClase de otro-paquete
     * y la subclase SubClase de otropaquete
     */

    public AccessModifiers() {
    }

    public final void metodoFinal() {
        System.out.println("No puedo ser sobreescrito");
    }

    public void metodoNoFinal() {
        System.out.println("Puedo ser sobreescrito");
    }

}
