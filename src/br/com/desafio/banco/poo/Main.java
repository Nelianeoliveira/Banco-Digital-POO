package br.com.desafio.banco.poo;

public class Main {
       public static void main(String[] args) {
            Cliente venilton = new Cliente();
            venilton.setNome("Neliane");

            Conta cc = new ContaCorrente(venilton);
            Conta poupanca = new ContaPoupanca(venilton);

            cc.depositar(10000);
            cc.transferir(100, poupanca);

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        }

    }
