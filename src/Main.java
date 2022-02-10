import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean condition = true;
        do {
            System.out.println("Type in your binary number");
            String x = scanner.nextLine();
            if( x.equals("x")) break;

            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) != '0' && x.charAt(i) != '1'){
                    System.out.println("Only write 1 and 0");
                    condition = false;
                    break;
                }
            }

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
