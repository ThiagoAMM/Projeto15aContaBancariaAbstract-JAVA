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
public class ContaCorrente extends ContaBancaria {

    private double taxaDeOperação;

    public ContaCorrente() {
    }

    public ContaCorrente(int numConta, double saldo, double taxaDeOperação) {
        super(numConta, saldo);
        this.taxaDeOperação = taxaDeOperação;
    }

    public double getTaxaDeOperação() {
        return taxaDeOperação;
    }

    public void setTaxaDeOperação(double taxaDeOperação) {
        this.taxaDeOperação = taxaDeOperação;
    }

    @Override
    public double depositar(double valor) {
        double total;
        total = valor - this.taxaDeOperação;
        System.out.println("DEPOSITO REALIZADO COM SUCESSO!");
        return this.saldo += total;
    }

    @Override
    public double sacar(double valor) {
        double total;
        if (valor > this.saldo) {
            System.out.println("SALDO INSUFICIENTE!");
            return 0;
        }
        System.out.println("SAQUE REALIZADO COM SUCESSO!");
        total = this.taxaDeOperação + valor;
        return this.saldo -= total;
    }
}
