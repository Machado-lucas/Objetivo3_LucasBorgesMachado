package br.edu.ifsul.model;

public class ContaCorrente extends Conta implements AssociadoVip {
    private int qdeCotas;
    public ContaCorrente() {
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    public ContaCorrente(int id, double saldo) {
        super(id, saldo);
    }

    @Override
    public double lucro(int qdeCotas, double valorCota) {
        return 0;
    }

    @Override
    public int getQdeCotas() {
        return qdeCotas;
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
        return "ContaCorrente{" +
                "qdeCotas=" + qdeCotas +
                ", id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
