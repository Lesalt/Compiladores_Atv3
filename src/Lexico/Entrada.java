package Lexico;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Entrada {
    InputStream is;
    public Entrada(String arq){
        try {
            is = new FileInputStream(new File(arq));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public int nextChar(){
        try {
            int posi = is.read();
            System.out.println((char)posi);
            return posi;
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }
}
