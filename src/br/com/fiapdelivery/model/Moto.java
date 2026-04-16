package br.com.fiapdelivery.model;

public class Moto extends VeiculosDeEntrega {

    private boolean possuiBau;

    public Moto(String placa, double capacidadeCarga, boolean possuiBau) {
        super(placa, capacidadeCarga);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return this.possuiBau;
    }

    @Override
    public String descreverVeiculo() {
        if (this.possuiBau) {
            return "Moto com bau";
        } else {
            return "Moto sem bau";
        }
    }
}