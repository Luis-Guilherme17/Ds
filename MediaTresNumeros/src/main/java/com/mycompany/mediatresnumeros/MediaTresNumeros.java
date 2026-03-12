package com.mycompany.mediatresnumeros;

import javax.swing.JOptionPane;

public class MediaTresNumeros {
    public static void main(String[] args) {
        System.out.println("Vamos descobrir a média desses três valores!");
        double valor1, valor2, valor3;

        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo valor: "));
        valor3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do terceiro valor: "));

        media(valor1 + valor2 + valor3);
    }

    // Método estático, fora do main
    static void media(double soma) {
        double m = soma / 3;
        JOptionPane.showMessageDialog(null, "A média de valores é de: " + String.format("%.2f", m));
    }
}   