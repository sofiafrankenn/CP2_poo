package br.com.fiapdelivery.model;

public class Caminhao extends VeiculosDeEntrega {

    private int numeroEixos;

    public Caminhao(String placa, double capacidadeCarga, int numeroEixos) {
        super(placa, capacidadeCarga);
        this.setNumeroEixos(numeroEixos);
    }

    public int getNumeroEixos() {
        return this.numeroEixos;
    }

    // override
    @Override
    public String descreverVeiculo() {
        return "Caminhao com " + this.numeroEixos + " eixos";
    }

    private void setNumeroEixos(int numeroEixos) {
        if (numeroEixos > 0) {
            this.numeroEixos = numeroEixos;
        } else {
            System.out.println("Erro: Número de eixos inválido!");
            this.numeroEixos = 2;
        }
    }
}