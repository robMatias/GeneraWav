/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smatiaso
 */
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.*;


public class GeneraWav {
	    public String fileName;
	    /*size offset endian*/
	    // 4 0 big endian
	    public String Riff;
	    // 4 4 little endian
	    public int Tamanio;
	    // 4 8 big endian
	    public String Wave;
	    // 4 12 big endian
	    public int Formato;
	    // 2 20 little endian
	    public short Pcm;
	    // 2 22 little endian
	    public short Canales;
	    // 4 24 little endian
	    public int Frecuencia;
	    // 4 28 little endian
	    public int F_muestreo;
            public short Bytes_m;
            public short bits_m;
            public String Data;
            public int Bytes_archivo;

    public GeneraWav(String a) {
        this.fileName = a;
        this.Riff = "RIFF";
        this.Tamanio = 0000;
        this.Wave = "WAVEfmt";
        this.Formato = 16;
        this.Pcm = 1;
        this.Canales = 1;
        this.Frecuencia = 44100;
        this.F_muestreo = Frecuencia*2;
        this.Bytes_m = 2;
        this.bits_m = 16;
        this.Data = "data";
        this.Bytes_archivo = 00;
    }
    
    public void GeneraWav(String filename, int iTiempo, int iFrecuenciamuestreo, int iArmonico)
    {
       File f= new File(filename);
        
    }

            
}
