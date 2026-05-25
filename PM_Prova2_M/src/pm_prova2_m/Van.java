/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 733633
 */
public class Van extends Veiculo implements Avaliavel, Inspecionavel {
    private int maxPassageiros;
    Veiculo veiculo;
    

    public Van(String placa, String modelo, int anoFabricacao, double valorDiaria, double quilometragem, StatusVeiculo status, int maxPassageiros) {
        super(placa, modelo, anoFabricacao, valorDiaria, quilometragem, status);
        this.maxPassageiros = maxPassageiros;
        
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Van");
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAnoFabricacao());
        System.out.println("Diaria: " + veiculo.getValorDiaria());
        System.out.println("KM: " + veiculo.getQuilometragem());
        System.out.println("Status: " + veiculo.getStatus());
        System.out.println("Maximo passageiros: " + maxPassageiros);
        System.out.println("Nota: " + avaliar());
        System.out.println();
    }


   @Override
    public void avaliar(int nota) {
        List<int> avaliacoes = new ArrayList<> ();
        
        avaliacoes.add(nota);
        
        int notaMedia = avaliacoes /avaliacoes.size();
        System.out.println("Avaliacao: " +notaMedia);
    }

    @Override
    public void realizarInspecao() {
        System.out.println("Inséção realizada na moto " + veiculo.getModelo());
    }
    
}
