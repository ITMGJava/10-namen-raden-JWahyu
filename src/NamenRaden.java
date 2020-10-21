import java.util.Arrays;
import java.util.List;

public class NamenRaden extends HemelLichaamZonnestelsel {
    public static void main(String[] args) {
        while (!alKlaar) {
            HemelLichaamZonnestelsel hemelLichaamZonnestelsel = new HemelLichaamZonnestelsel();

            System.out.printf("%nNoem een planeet en/of hemellichaam in onze zonnestelsel:%n");
            invoerNaam = invoer.nextLine();

            List hemelLichamenList = Arrays.asList(hemelLichamen);


            if (hemelLichamenList.contains(invoerNaam)) {
                System.out.printf(invoerNaam + " staat in het lijstje op indexnummer: " + hemelLichamenList.indexOf(invoerNaam) + "%n");
                alKlaar = false;
            } else {
                System.out.printf(invoerNaam + " was niet gevonden in lijstje!%n");
                alKlaar = false;
            }
        }



    }

}
