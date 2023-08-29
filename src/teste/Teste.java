package teste;

import javax.swing.JFrame;
import View.Cadastro;

public class Teste extends JFrame {

    
    public static void main(String[] args) {
        Cadastro in = new Cadastro();
        in.setVisible(true);
        in.setSize(640,830);
        in.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   
}
