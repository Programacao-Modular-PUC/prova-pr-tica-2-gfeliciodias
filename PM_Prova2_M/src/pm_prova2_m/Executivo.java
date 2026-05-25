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
public class Executivo extends Aluguel implements Avaliavel{

    private boolean kmIlimitado;
    private boolean motoristaParticular;
    private int nota;

    public Executivo(String nomeCliente, int quantidadeDias, double valorTotal, StatusAluguel status, boolean kmIlimitado, boolean motoristaParticular, int nota) {
        super(nomeCliente, quantidadeDias, valorTotal, status);
        this.kmIlimitado = kmIlimitado;
        this.motoristaParticular = motoristaParticular;
        this.nota = nota;
    
    }   
    

    @Override
    public void avaliar(int nota) {
        List<int> avaliacoes = new ArrayList<> ();
        
        avaliacoes.add(nota);
        
        int notaMedia = avaliacoes /avaliacoes.size();
        System.out.println("Avaliacao: " + notaMedia);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Aluguel Executivo");
        System.out.println("KM ilimitado: " + kmIlimitado);
        System.out.println("Motorista: " + motoristaParticular);
        System.out.println("Nota: " + nota);

        for (Veiculo v : veiculos) {
            System.out.println(v.getModelo());
        }

        System.out.println();
    }

   
}
