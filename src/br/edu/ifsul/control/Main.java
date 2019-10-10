package br.edu.ifsul.control;


import br.edu.ifsul.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //QUESTAO A
        ContaPoupanca cp1 = new ContaPoupanca(1, 2000.0);
        ContaPoupanca cp2 = new ContaPoupanca(2, 3000.0);
        ContaPoupanca cp3 = new ContaPoupanca(3, 10000.0);

        ContaCorrente cc1 = new ContaCorrente(4, 5000.0);
        ContaCorrente cc2 = new ContaCorrente(5, 10000.0);
        ContaCorrente cc3 = new ContaCorrente(6, 7540.0);

        Associado associado1 = new Associado(7);
        Associado associado2 = new Associado(8);
        Associado associado3 = new Associado(9);

        System.out.println(cp1);
        System.out.println(cp2);
        System.out.println(cp3);
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);
        System.out.println(associado1);
        System.out.println(associado2);
        System.out.println(associado3);

        //QUESTAO B
        List<Conta> contas = new ArrayList<>();
        contas.add(cp1);
        contas.add(cp2);
        contas.add(cp3);
        contas.add(cc1);
        contas.add(cc2);
        contas.add(cc3);
        System.out.println("\nLista de contas na ordem de inserção:\n" + contas);

        List<AssociadoVip> associados = new ArrayList<>();
        associados.add(cc1);
        associados.add(cc2);
        associados.add(cc3);
        associados.add(associado1);
        associados.add(associado2);
        associados.add(associado3);
        System.out.println("\nLista de associados na ordem de inserção:\n" + associados);

        //QUESTAO C


        System.out.println("\nConta poupança antes da atualização:\n" + cp1);
        cp1.deposita(1000.0);
        cp1.atualiza(5.0);
        cp1.saca(50.0);
        System.out.println("\nConta poupança atualizada:\n" + cp1);

        //QUESTAO D

        System.out.println("\nConta corrente antes do depósito: \n" + cc1);
        cc1.deposita(500.0);
        System.out.println("\nConta corrente depois do depósito e antes do saque: \n" + cc1);
        cc1.saca(400.0);
        System.out.println("\nConta corrente depois do saque: \n" + cc1);

        //QUESTAO E

        cc1.setQdeCotas(100);
        cc2.setQdeCotas(400);
        cc3.setQdeCotas(600);
        associado1.setQdeCotas(300);
        associado2.setQdeCotas(600);
        associado3.setQdeCotas(600);

        System.out.println("\nLista de associados com quantidade de cotas atualizadas:\n" + associados);

        //QUESTAO F

        associados.sort(Comparator.comparingInt(AssociadoVip::getQdeCotas).reversed());
        System.out.println("\nLista de associados em ordem decrescente (baseado na quantidade de cotas\n" + associados);
        System.out.println("\nLista de associados com maior cota do sistema:\n" + Main.getMaxAssociados(associados));

        //QUESTAO G

        contas.sort(Comparator.comparingDouble(Conta::getSaldo).reversed());
        System.out.println("\nLista de contas em ordem decrescente(baseado no saldo):\n" + contas);
        System.out.println("\nLista de contas com o mairo saldo do sistema:\n" + Main.getMaxContas(contas));

    }
        //método utilitário
        private static List<Conta> getMaxContas(List<Conta> contas){
            List<Conta> maxs = new ArrayList<>();
            if(!contas.isEmpty()){
                Conta funcMax = Collections.max(contas, Comparator.comparingDouble(Conta::getSaldo));
                maxs.add(funcMax);
                for (int i = 1; i < contas.size(); i++) {
                    if(funcMax.getSaldo() == contas.get(i).getSaldo()){
                        maxs.add(contas.get(i));
                    }
                }
            }
            return maxs;
        }

        //método utilitário
        private static List<AssociadoVip> getMaxAssociados(List<AssociadoVip> associados){
            List<AssociadoVip> maxs = new ArrayList<>();
            if(!associados.isEmpty()){
                AssociadoVip assMax = Collections.max(associados, Comparator.comparingInt(AssociadoVip::getQdeCotas));
                maxs.add(assMax);
                for (int i = 1; i < associados.size(); i++) {
                    if(assMax.getQdeCotas() == associados.get(i).getQdeCotas()){
                        maxs.add(associados.get(i));
                    }
                }
            }
            return maxs;
    }
}
