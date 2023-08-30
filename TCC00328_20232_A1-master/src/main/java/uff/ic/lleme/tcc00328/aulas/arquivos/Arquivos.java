package uff.ic.lleme.tcc00328.aulas.arquivos;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Arquivos {

    public static void main(String[] args) {

        try (OutputStream output = new FileOutputStream("src/main/java/uff/ic/lleme/tcc00328/aulas/arquivos/saida.txt", true);
                InputStream input = new FileInputStream("src/main/java/uff/ic/lleme/tcc00328/aulas/arquivos/entrada.txt");) {
            int n;
            OutputStreamWriter writer = new OutputStreamWriter(output);
            BufferedWriter bw = new BufferedWriter(writer);

            Scanner in = new Scanner(input);
            while (in.hasNext()) {
                n = in.nextInt();
                bw.write("" + n);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }

    public static void main2(String[] args) throws FileNotFoundException, IOException {
        int n;
        OutputStream output = new FileOutputStream("saida.txt", true);
        OutputStreamWriter writer = new OutputStreamWriter(output);
        BufferedWriter bw = new BufferedWriter(writer);

        InputStream input = new FileInputStream("entrada.txt");
        Scanner in = new Scanner(input);
        while (in.hasNext()) {
            n = in.nextInt();
            bw.write("" + n);
        }
    }
}
