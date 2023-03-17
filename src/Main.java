public class Main {
    static double beloppVidUttag(double b, double r, int n, double ut) {
        if (ut > b*0.01*r) {
            System.out.println("För stort uttag");
            return 0;
        } else {
            for (int i=1; i <= n; i++) {
                b = b + b*0.01*r - ut;
            }
            return b;
        }
    }

    public static void main(String[] args) {
        // Ändra metoden beloppVidUttag så att den skriver ut beloppet på kontot
        // vid slutet av varje år.
        //
        // Testa metoden genom att först läsa in belopp, räntan, år, och uttag
        // och sen kalla på metoden med dessa som argument


    }
}