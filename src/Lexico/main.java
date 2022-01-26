package Lexico;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        String path = "";
        JFileChooser fc = new JFileChooser();
        int retorno = fc.showOpenDialog(null);
        if(retorno == JFileChooser.APPROVE_OPTION){
            path = fc.getSelectedFile().getAbsolutePath();
        }
        Analisador entrada = new Analisador(path);
        Token token = null;
        while((token = entrada.nextToken()) != null){
            System.out.println(token);
        }
    }
}
