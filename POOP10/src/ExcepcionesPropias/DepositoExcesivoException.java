package ExcepcionesPropias;

public class DepositoExcesivoException extends Exception {

    public DepositoExcesivoException() {
        super("Su deposito no puede exceder los 20000");
    }

}