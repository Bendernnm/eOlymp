package nnm.bender.LastIO;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        double s = 0;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            try {
                s += Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                s += 0;
            }
        }
        Writer writer = new OutputStreamWriter(System.out);
        writer.write(String.format("%.6f", s));
        writer.flush();
        writer.close();
        scanner.close();
    }
}
