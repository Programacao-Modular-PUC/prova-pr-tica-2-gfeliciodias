/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pm_prova2_m;

/**
 *
 * @author 733633
 */
public class Premium extends Aluguel{
    private boolean kmIlimitado;
    private boolean seguro;

    public Premium(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status, boolean kmIlimitado, boolean seguro) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
        this.kmIlimitado = true;
        this.seguro = true;
    }

  

    @Override
    public void exibirDetalhes() {
        System.out.println("Aluguel Premium");
        System.out.println("KM ilimitado: " + kmIlimitado);
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