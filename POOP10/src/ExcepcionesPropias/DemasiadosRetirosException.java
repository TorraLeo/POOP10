package ExcepcionesPropias;

public class DemasiadosRetirosException extends Exception {

    public DemasiadosRetirosException() {
        super("Demasiados retiros, no se pueden realizar más de 3");
    }

}