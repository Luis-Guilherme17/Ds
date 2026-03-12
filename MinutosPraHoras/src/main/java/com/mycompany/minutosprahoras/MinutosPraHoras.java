
package com.mycompany.minutosprahoras;

import javax.swing.JOptionPane;

public class MinutosPraHoras {

    public static void main(String[] args) 
            
    {
        System.out.println("Vamos converter minutos para horas!");
        double tempo;
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo em minutos: "));
        conversao(tempo);
    }

    static void conversao (double n)
    {
        double H = n/60;
        JOptionPane.showMessageDialog(null, "O tempo em horas é: "+ H + "Horas.");
    }
}