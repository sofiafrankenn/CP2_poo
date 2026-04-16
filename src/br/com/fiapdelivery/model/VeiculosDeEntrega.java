package br.com.fiapdelivery.model;

public class VeiculosDeEntrega {

    private String placa;
    private double capacidadeCarga;

    public VeiculosDeEntrega(String placa, double capacidadeCarga) {
        this.setPlaca(placa);
        this.setCapacidadeCarga(capacidadeCarga);
    }

    public String getPlaca() {
        return this.placa;
    }

    public double getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    // metodo base
    public String descreverVeiculo() {
        return "Veiculo de entrega";
    }

    private void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Erro: Placa inválida!");
        }
    }

    private void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga > 0) {
            this.capacidadeCarga = capacidadeCarga;
        } else {
            System.out.println("Erro: Capacidade de carga deve ser positiva!");
            this.capacidadeCarga = 0;
        }
    }
}