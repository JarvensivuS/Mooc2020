
import java.util.Scanner;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        
        int vanhin = 0;

        while (true){
            String enteredText = lukija.nextLine();
            if (enteredText.equals("")){
                break;
            }
            String [] wordsArray = enteredText.split(",");

            if (vanhin < Integer.valueOf(wordsArray[1])){
                vanhin = Integer.valueOf(wordsArray[1]);
            }
        }

        System.out.println("Vanhimman ikä: " + vanhin);

    }
}
