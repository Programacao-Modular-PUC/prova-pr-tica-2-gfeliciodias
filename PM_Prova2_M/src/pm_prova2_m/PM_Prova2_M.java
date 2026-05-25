/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pm_prova2_m;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author glbra
 */
public class PM_Prova2_M {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        ArrayList<Aluguel> alugueis = new ArrayList<>();

        Carro carro = new Carro(
                "AAA1111",
                "Civic",
                2020,
                250,
                50000,
                StatusVeiculo.DISPONIVEL,
                4
        );
        

        Moto moto = new Moto(
                "CCC3333",
                "Bros 160",
                2008,
                160,
                200000,
                StatusVeiculo.MANUTENCAO,
                300
        );
        

        Van van = new Van(
                "EEE5555",
                "Sprinter",
                2022,
                450,
                10000,
                StatusVeiculo.DISPONIVEL,
                15
        );
       

        veiculos.add(carro);
        veiculos.add(moto);
        veiculos.add(van);

        Basico basico = new Basico(
                "Lucas",
                3,
                750,
                StatusAluguel.ATIVO
        );

        Premium premium = new Premium(
                "Mariana",
                5,
                2250,
                StatusAluguel.ATIVO
        );

        alugueis.add(basico);
        alugueis.add(premium);
    }
    
}
