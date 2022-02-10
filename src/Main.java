import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean condition = true;
        do {

            //Indtager en String så den ikke breaker. (Hvis man indatager en integer og skriver bogstaver så crasher programmet.)
            System.out.println("Type in your binary number");
            String x = scanner.nextLine();
            if( x.equals("x")) break;

            //Tjekker alle karaktere igennem om der er andet end 0 og 1 taller.
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) != '0' && x.charAt(i) != '1'){
                    System.out.println("Only write 1 and 0");
                    condition = false;
                    break;
                }
            }

            //Hvis der kun er skrevet 0 og 1 taller bruger jeg formlen som du viste for at omregne fra binær til decimal.
            if (condition == true) {
                double total = 0;
                for (int i = 0; i < x.length(); i++) {
                    total = total + Math.pow(2, i) * Character.getNumericValue(x.charAt(i));
                }
                int numberToPrint = (int) total;
                System.out.println("In decimals this binary vallue is: " + numberToPrint);
            }
            condition = true;
        } while (condition == true);

    }



}
