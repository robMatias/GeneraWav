
import java.io.RandomAccessFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smatiaso
 */
public class EjecutaWav {
 
    public static void main(String[] args) {
        GeneraWav generador;
        RandomAccessFile r;
        String nombreArch;
        String buff;
        int fm, f, duracion;
            
        try {
            r = new RandomAccessFile(args[0], "r");
            
            try {
                nombreArch = r.readLine();
                
                //frecuenca de muestreo
                buff = r.readLine();
                fm = Integer.valueOf(buff.trim());
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }
}
