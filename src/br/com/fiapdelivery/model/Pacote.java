package br.com.fiapdelivery.model;

public class Pacote {

    private String codigo;
    private double pesoKg;
    private String status;

    // Construtor obrigatório - pacote não pode nascer sem código e peso
    public Pacote(String codigo, double pesoKg) {
        this.codigo = codigo;
        this.setPesoKg(pesoKg);
        this.status = "Pendente"; // status inicial padrão
    }

    // Método de negócio com nome significativo
    public void atualizarStatus(String novoStatus) {
        if (novoStatus != null && !novoStatus.trim().isEmpty()) {
            this.status = novoStatus;
            System.out.println("Pacote " + this.codigo + " atualizado para: " + this.status);
        } else {
            System.out.println("Erro: Status inválido!");
        }
    }

    public String getCodigo() { return this.codigo; }
    public double getPesoKg() { return this.pesoKg; }
    public String getStatus() { return this.status; }

    private void setPesoKg(double pesoKg) {
        if (pesoKg > 0) {
            this.pesoKg = pesoKg;
        } else {
            System.out.println("Erro: Peso deve ser positivo!");
            this.pesoKg = 0;
        }
    }
}