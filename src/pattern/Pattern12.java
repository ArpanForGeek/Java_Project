package pattern;

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int nes = 0;
        int nsp = n - 1;

        int row = 1;
        while (row <= n) {

            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                if (cst % 2 == 0) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
                cst++;

            }
            System.out.println(" ");
            row++;
            nsp--;
            nst+=2;
            nes++;
        }
    }
}
