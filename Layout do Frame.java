package Projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;

public class Layouts  extends JFrame{
    public Layouts() {
        super("Meu layout");

        Container c = getContentPane();

        c.add(BorderLayout.NORTH, new JButton("Botão Norte"));
        c.add(BorderLayout.SOUTH, new JButton("Botão Sul"));
        getContentPane().add(new JButton ("botão centralizado"));
        c.add(BorderLayout.WEST,new JButton("Botão Leste"));
        c.add(BorderLayout.EAST,new JButton("Botão Oeste"));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,300);
    setVisible(true);
    }


    public static void main (String[] args){
        new Layouts();
    }
}
