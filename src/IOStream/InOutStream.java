package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InOutStream {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/IOStream/chicken.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Unable to load the file");
        }
        Scanner sc = new Scanner(inputStream);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
