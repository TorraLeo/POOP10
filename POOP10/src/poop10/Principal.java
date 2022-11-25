package poop10;

import ExcepcionesPropias.DemasiadosRetirosException;
import ExcepcionesPropias.DepositoExcesivoException;
import ExcepcionesPropias.SaldoInsuficienteException;

public class Principal {

    public static void main(String[] args) {
        System.out.println("\n-creacion de excepciones-");
        Cuenta cuenta = new Cuenta();
        try {
            System.out.println("\n-saldo insuficiente-");

            // saldo insuficiente
            cuenta.depositar(18000);
            System.out.println("saldo de la cuenta " + cuenta.getSaldo());

            cuenta.retirar(10000);

            System.out.println("saldo de la cuenta " + cuenta.getSaldo());

            cuenta.retirar(10000);
            System.out.println("saldo de la cuenta " + cuenta.getSaldo());

        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        } catch (DepositoExcesivoException ex) {
            System.out.println(ex.getMessage());
        } catch (DemasiadosRetirosException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("\n-deposito excesivo-");
            // deposito excesivo
            cuenta.depositar(21000);
        } catch (DepositoExcesivoException ex2) {
            System.out.println(ex2.getMessage());
        }

        try {
            System.out.println("\n-demasiados retiros-");
            // demasiados retiros
            cuenta.retirar(1000);
            cuenta.retirar(1000);
            cuenta.retirar(1000);
        } catch (DemasiadosRetirosException ex3) {
            System.out.println(ex3.getMessage());
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
    }
    // wawa
    // dame 2 we
}
