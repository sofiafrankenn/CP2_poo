package br.com.fiapdelivery.model;

public class Rota {

    private Pacote pacoteAEntregar;
    private VeiculosDeEntrega veiculoDesignado;

    public Rota(Pacote pacoteAEntregar, VeiculosDeEntrega veiculoDesignado) {
        this.pacoteAEntregar = pacoteAEntregar;
        this.veiculoDesignado = veiculoDesignado;
    }

    public void iniciarEntrega() {
        System.out.println("Iniciando entrega do pacote "
            + this.pacoteAEntregar.getCodigo()
            + " no veículo: "
            + this.veiculoDesignado.descreverVeiculo());

        this.pacoteAEntregar.atualizarStatus("Em trânsito");
    }

    public Pacote getPacoteAEntregar() { return this.pacoteAEntregar; }
    public VeiculosDeEntrega getVeiculoDesignado() { return this.veiculoDesignado; }
}