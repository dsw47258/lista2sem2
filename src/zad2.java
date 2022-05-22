
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) throws IOException {

        Path fr = Path.of("./src/pliktekstowy.txt");
        String content = Files.readString(fr);
        System.out.println("Wprowadź ciąg znaków jaki chcesz wyszukać");
        Scanner input = new Scanner(System.in);
        int count = 0;
        int index = 0;
        String value = input.nextLine();
        while (true) {
            index = content.indexOf(value, index);
            if (index != -1){
                count++;
                index += value.length();
            }
            else{
                break;
            }
        }
        if (count > 0) {
            System.out.println("Ilość powtórzeń: " + count);
        } else {
            System.out.println("Brak dopasowań");
        }
    }

}