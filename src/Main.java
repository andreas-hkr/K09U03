import java.util.Scanner;

public class Main {
    static void printYearByYear(double b, double r, int n, double ut) {
        if (ut > b*0.01*r) {
            System.out.println("För stort uttag");
        } else {
            for (int i=1; i <= n; i++) {
                b = b + b*0.01*r - ut;
                System.out.format("%3d --> %.2f%n", i, b);
            }
        }
    }

    public static void main(String[] args) {
        // Ändra metoden beloppVidUttag så att den skriver ut beloppet på kontot
        // vid slutet av varje år.
        //
        // Testa metoden genom att först läsa in belopp, räntan, år, och uttag
        // och sen kalla på metoden med dessa som argument

        Scanner input = new Scanner(System.in);
        System.out.print("Ange beloppet: ");
        double amount = input.nextDouble();
        System.out.print("Ange räntan: ");
        double rate = input.nextDouble();
        System.out.print("Ange antal år: ");
        int years = input.nextInt();
        System.out.print("Ange uttag: ");
        double withdraw = input.nextDouble();

        printYearByYear(amount,rate,years,withdraw);
    }
}