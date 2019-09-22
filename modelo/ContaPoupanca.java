/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USER
 */
public class ContaPoupanca extends ContaBancaria {

    private double limite;

    public ContaPoupanca() {
    }

    public ContaPoupanca(double limite, int numConta, double saldo) {
        super(numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double depositar(double valor) {
        System.out.println("DEPOSITO REALIZADO COM SUCESSO!");
        return this.saldo += valor;
    }

    @Override
    public double sacar(double valor) {
        if (valor > limite) {
            System.out.println("LIMITE ULTRAPASSADO!");
            return 0;
        }
        System.out.println("SAQUE REALIZADO COM SUCESSO!");
        return this.saldo -= valor;
    }

}
