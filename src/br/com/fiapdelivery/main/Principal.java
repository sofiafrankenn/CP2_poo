package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class Principal {

    public static void main(String[] args) {

        System.out.println("--- FiapDelivery - Sistema de Logística ---\n");

        // Teste 1: Caminhao
        System.out.println("--- ENTREGA 1 (CAMINHAO) ---");
        Caminhao caminhao = new Caminhao("ABC-1234", 1000.0, 4);
        Pacote pacote1 = new Pacote("BR999", 10.5);
        Rota rotaCaminhao = new Rota(pacote1, caminhao);
        rotaCaminhao.iniciarEntrega();

        System.out.println();

        // Teste 2: Moto
        System.out.println("--- ENTREGA 2 (MOTO) ---");
        Moto moto = new Moto("XYZ-9999", 30.0, true);
        Pacote pacote2 = new Pacote("BR001", 2.0);
        Rota rotaMoto = new Rota(pacote2, moto);
        rotaMoto.iniciarEntrega();

        System.out.println();

        // Teste 3: validação
        System.out.println("--- TESTE DE VALIDACAO ---");

        // teste invalido
       	System.out.println("\n- Caso invalido (capacidade negativa) -");
       	Caminhao caminhaoInvalido = new Caminhao("DEF-5678", -500.0, 2);
     	System.out.println("Capacidade registrada: " + caminhaoInvalido.getCapacidadeCarga());

     	// teste valido
     	System.out.println("\n- Caso valido -");
     	Caminhao caminhaoValido = new Caminhao("GHI-0001", 800.0, 6);
     	System.out.println("Capacidade registrada: " + caminhaoValido.getCapacidadeCarga());
        System.out.println();
        
        // Teste 4: detalhes
        System.out.println("--- DETALHES DOS OBJETOS ---");

        System.out.println("\n-- CAMINHAO --");
        System.out.println("Placa: " + caminhao.getPlaca());
        System.out.println("Capacidade: " + caminhao.getCapacidadeCarga());
        System.out.println("Descricao: " + caminhao.descreverVeiculo());

        System.out.println("\n-- MOTO --");
        System.out.println("Placa: " + moto.getPlaca());
        System.out.println("Capacidade: " + moto.getCapacidadeCarga());
        System.out.println("Possui bau: " + (moto.isPossuiBau() ? "sim" : "nao"));        System.out.println("Descricao: " + moto.descreverVeiculo());

        System.out.println("\n-- PACOTE 1 (CAMINHAO) --");
        System.out.println("Codigo: " + pacote1.getCodigo());
        System.out.println("Peso: " + pacote1.getPesoKg());
        System.out.println("Status: " + pacote1.getStatus());

        System.out.println("\n-- PACOTE 2 (MOTO) --");
        System.out.println("Codigo: " + pacote2.getCodigo());
        System.out.println("Peso: " + pacote2.getPesoKg());
        System.out.println("Status: " + pacote2.getStatus());
    }
}