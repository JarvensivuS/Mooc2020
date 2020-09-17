
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int birthYear = 0;
        String name = "";
        int counter = 0;

        while (true){
            String enteredText = lukija.nextLine();
            if (enteredText.equals("")){
                break;
            }
            String [] wordsArray = enteredText.split(",");

            if (name.length() < wordsArray[0].length()){
                name = wordsArray[0];
            }
            birthYear += Integer.valueOf(wordsArray[1]);
            counter++;
        }

        System.out.println("Pisin nimi: " + name);
        System.out.println("Syntymävuosien keskiarvo: " + (double) birthYear/counter);
    }
}


