package poop10;

import ExcepcionesPropias.DemasiadosRetirosException;
import ExcepcionesPropias.DepositoExcesivoException;
import ExcepcionesPropias.SaldoInsuficienteException;

public class Cuenta {

    private double saldo;
    private int retiros;

    public Cuenta() {
    }

    public Cuenta(double saldo) {
        this.saldo = saldo;
        this.retiros = 0;
    }

    public void retirar(double monto) throws SaldoInsuficienteException, DemasiadosRetirosException {
        System.out.println("retirando  $" + monto);
        
        if (this.saldo > monto) {
            if (this.retiros < 3) {
                this.saldo -= monto;
                this.retiros += 1;
            } else {
                throw new DemasiadosRetirosException();
            }
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    public void depositar(double monto) throws DepositoExcesivoException {
        System.out.println("depositando  $" + monto);

        if (monto > 20000) {
            throw new DepositoExcesivoException();
        } else {
            this.saldo += monto;
        }

    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }

}