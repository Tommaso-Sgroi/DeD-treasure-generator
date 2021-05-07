package it.tommy.ded.treasoures.generator.log;

import it.tommy.ded.treasoures.generator.cumulo_di_tesori.CumuloTesori;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Logger {

    public static ArrayList<String> log = new ArrayList<>();

    public static void add(String s){
        log.add(s);
    }

    public static void writeLog(){
        try(BufferedWriter bw = Files.newBufferedWriter(Path.of( "logger", "result.log")))
        {
            bw.write(String.join("\n", log));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for(int i =0; i<10000; i++)
            CumuloTesori.getCumuloTesori04().generaTesori();
        for(int i =0; i<10000; i++)
            CumuloTesori.getCumuloTesori510().generaTesori();
        for(int i =0; i<10000; i++)
            CumuloTesori.getCumuloTesori1116().generaTesori();
        for(int i =0; i<10000; i++)
            CumuloTesori.getCumuloTesori17().generaTesori();
    }


}
