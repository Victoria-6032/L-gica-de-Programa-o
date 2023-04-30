package Projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Meuframe extends JFrame {
    public Meuframe() {
        super ("Meu Layout");
        JButton botao = new JButton("Clique");
        getContentPane().add(botao);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setVisible(true);

        /*JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);*/
    }

    public static void main(String[] args) {
        new Meuframe();
    }

}
