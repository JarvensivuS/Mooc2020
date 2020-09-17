
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        
        int vanhin = 0;
        String nimi = "";
        
        while (true){
            String enteredText = lukija.nextLine();
            if (enteredText.equals("")){
                break;
            }
            String [] wordsArray = enteredText.split(",");

            if (vanhin < Integer.valueOf(wordsArray[1])){
                vanhin = Integer.valueOf(wordsArray[1]);
                nimi = String.valueOf(wordsArray[0]);
            }
        }

        System.out.println("Vanhimman nimi: " + nimi);

    }
}
