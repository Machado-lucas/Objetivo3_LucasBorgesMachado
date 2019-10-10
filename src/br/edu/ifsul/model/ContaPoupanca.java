package br.edu.ifsul.model;

public class ContaPoupanca extends Conta{
    public ContaPoupanca() {
    }

    public ContaPoupanca(int id, double saldo) {
        super(id, saldo);
    }



    @Override
    public void deposita(double valor) {
        saldo += valor;
    }

    @Override
    public void saca(double valor) {
        saldo -= valor;
    }

    @Override
    public void atualiza(double taxa) {
        saldo = saldo + (saldo * (taxa/100));
    }

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
