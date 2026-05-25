/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 733633
 */
public class Basico extends Aluguel {

    private int limiteKm;
    private boolean seguro;
    

    public Basico(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status, int limiteKm, boolean seguro) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
        this.limiteKm = 100;
        this.seguro = false;
        
    }

 

    @Override
    public void exibirDetalhes() {
        System.out.println("Aluguel Basico");
        System.out.println("Limite KM: " + limiteKm);
        System.out.println("Seguro: " + seguro);

        for (Veiculo v : veiculos) {
            System.out.println(v.getModelo());
        }

        System.out.println();
    }

   

    @Override
    public boolean possuiSeguroIncluso() {
        if(seguro == true){
            return seguro;
        } else {
        throw new UnsupportedOperationException("Não possui seguro ."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}