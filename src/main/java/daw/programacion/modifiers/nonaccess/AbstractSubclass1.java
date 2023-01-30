package daw.programacion.modifiers.nonaccess;

public class AbstractSubclass1 extends AbstractModifier {

    @Override
    public void metodoAbstracto() {
        System.out.println("Estoy obligado a hacer una implementación");

    }

    @Override
    public void metodoNoAbstracto(){
        System.out.println("de este método no abstracto puedo o no hacer un override");
    }

    // @Override
    // public void metodoFinal(){
    //     System.out.println("De un método final no puedo hacer un override");
    // }

}
