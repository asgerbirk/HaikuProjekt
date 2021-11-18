package data;

import haikuanalysis.HaikuPoem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class HaikuWriter {
    public void saveHaikuToFile(HaikuPoem poem) {
        try {
            BufferedWriter haikuFile = new BufferedWriter(new FileWriter("/Users/asgerbirk/Desktop/Haiku/src/data/haiku.txt"));
            haikuFile.write(String.valueOf(poem));
            haikuFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
