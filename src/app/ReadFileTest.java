package app;

import java.io.*;

public class ReadFileTest {
    public static void main(String[] args) {
        File file = new File("inventory.csv");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;

            while ((st = br.readLine()) != null) {
                String[] input = st.split(",");

                for (int counter = 0; counter < input.length; counter++) {
                    System.out.printf("%s ", input[counter]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}