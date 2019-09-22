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
import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        ContaCorrente cc01 = new ContaCorrente();
        ContaPoupanca cp01 = new ContaPoupanca();

        cc01.setNumConta(1);
        cc01.setSaldo(7500.0);
        cc01.setTaxaDeOperação(5.0);

        cp01.setNumConta(2);
        cp01.setSaldo(5000.0);
        cp01.setLimite(cp01.saldo + 800);

        int opc;
        double valor;
        System.out.println("\n-------------BANCO POO-------------------");
        System.out.println("\nSelecione o Tipo de Conta:\n1-Conta Corrente\n2-Conta Poupança");
        System.out.println("Opção: ");
        opc = entrada.nextInt();

        switch (opc) {
            case 1:
                do {
                    System.out.println("\n-------------CONTA CORRENTE-------------------");
                    System.out.println("\nSelecione uma operação:\n1-Sacar\n2-Depositar\n0-Sair");
                    System.out.println("Opção: ");
                    opc = entrada.nextInt();

                    switch (opc) {
                        case 0:
                            System.out.println("\nFim da Operação...");
                            break;
                        case 1:
                            System.out.println("\nConta: " + cc01.getNumConta() + ", Saldo Disponivel: " + cc01.getSaldo());
                            System.out.println("\nInf o Valor para Sacar: ");
                            valor = entrada.nextDouble();
                            if (cc01.sacar(valor) != 0) {
                                System.out.println("\nValor do Saque: " + valor + "\nValor da taxa: " + cc01.getTaxaDeOperação());
                                System.out.println("\nSaldo Restante: " + cc01.getSaldo());
                            }
                            break;
                        case 2:
                            System.out.println("\nConta: " + cc01.getNumConta() + ", Saldo Disponivel: " + cc01.getSaldo());
                            System.out.println("\nInf o Valor para Depositar: ");
                            valor = entrada.nextDouble();
                            cc01.depositar(valor);
                            System.out.println("\nValor do Deposito: " + valor + "\nValor da taxa: " + cc01.getTaxaDeOperação());
                            System.out.println("\nNovo Saldo: " + cc01.getSaldo());
                            break;
                        default:
                            System.out.println("Opção invalida...");
                            break;
                    }
                } while (opc != 0);
                break;
            case 2:
                do {
                    System.out.println("\n-------------CONTA POUPANCA-------------------");
                    System.out.println("\nSelecione uma operação:\n1-Sacar\n2-Depositar\n0-Sair");
                    System.out.println("Opção: ");
                    opc = entrada.nextInt();

                    switch (opc) {
                        case 0:
                            System.out.println("\nFim da Operação...");
                            break;
                        case 1:
                            cp01.setLimite(cp01.saldo + 800);
                            System.out.println("\nConta: " + cp01.getNumConta() + ", Saldo Disponivel: " + cp01.getSaldo() + ", Limite de Saque: até " + cp01.getLimite());
                            System.out.println("\nInf o Valor para Sacar: ");
                            valor = entrada.nextDouble();
                            if (cp01.sacar(valor) != 0) {
                                System.out.println("\nValor do Saque: " + valor);
                                System.out.println("\nSaldo Restante: " + cp01.getSaldo());
                            }
                            break;
                        case 2:
                            System.out.println("\nConta: " + cp01.getNumConta() + ", Saldo Disponivel: " + cp01.getSaldo());
                            System.out.println("\nInf o Valor para Depositar: ");
                            valor = entrada.nextDouble();
                            cp01.depositar(valor);
                            System.out.println("\nValor do Deposito: " + valor);
                            System.out.println("\nNovo Saldo: " + cp01.getSaldo());
                            break;
                        default:
                            System.out.println("Opção invalida...");
                            break;
                    }
                } while (opc != 0);
                break;
            default:
                System.out.println("Opção de Conta inexistente...");
                break;
        }
    }

}
