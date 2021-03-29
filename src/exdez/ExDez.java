/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exdez;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExDez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 10. Faça um programa que calcule e imprima a área de um retângulo.
        Scanner entrada = new Scanner(System.in);
        float base;
        float altura;
        float area;
        System.out.println("Digite a base do retangulo: ");
        base = entrada.nextFloat();
        System.out.println("Digite a altura do Retangulo: ");
        altura = entrada.nextFloat();
        area = base*altura;
        System.out.println("A area do retangulo é de: "+area);
        
        
    }
    
}
