package br.com.desafio.banco.poo;

public class Main {
       public static void main(String[] args) {
           Cliente Neliane = new Cliente();
            Neliane.setNome("Neliane");

            Conta cc = new ContaCorrente(Neliane);
            Conta poupanca = new ContaPoupanca(Neliane);

            cc.depositar(10000);
            cc.transferir(100, poupanca);

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        }

    }
