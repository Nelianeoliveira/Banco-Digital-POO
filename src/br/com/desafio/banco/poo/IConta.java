package br.com.desafio.banco.poo;
//Métodos de "interface" sempre são públicos.
public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino);
    void imprimirExtrato();
}
