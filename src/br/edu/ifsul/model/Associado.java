package br.edu.ifsul.model;

public class Associado implements AssociadoVip {
    private int id;
    private int qdeCotas;

    public Associado() {
    }

    public Associado(int id) {
        this.id = id;
    }

    @Override
    public double lucro(int qdeCotas, double valorCota) {
        return 0;
    }

    @Override
    public int getQdeCotas() {
        return qdeCotas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQdeCotas(int qdeCotas) {
        this.qdeCotas = qdeCotas;
    }

    @Override
    public String toString() {
        return "Associado{" +
                "id=" + id +
                ", qdeCotas=" + qdeCotas +
                '}';
    }
}
