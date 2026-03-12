
package com.mycompany.descontoproduto;

import javax.swing.JOptionPane;

public class DescontoProduto {

    public static void main(String[] args) 
            
    {
        System.out.println("Vamos descobrir o desconto desse produto!");
        double produto;
        produto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do produto: "));
        desconto(produto);
    }

    static void desconto (double n)
    {
        double d = n * 0.15;
        double valorFinal = n - d;
        JOptionPane.showMessageDialog(null, "O valor com desconto é de: "+ valorFinal);
    }
}