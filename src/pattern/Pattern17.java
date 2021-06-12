package pattern;

public class Pattern17 {

    public static void main(String[] args) {
        int n = 7;
        int nst1 = n / 2;
        int nst2 = n / 2;

        int nsp = 1;


        int row = 1;

        while (row <= 7) {

            int cst1 = 1;
            while (cst1 <= nst1) {
                System.out.print("* ");
                cst1++;
            }

            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }

            int cst2 = 1;
            while (cst2 <= nst2) {
                System.out.print("* ");
                cst2++;
            }

            System.out.println("");
            if (row <= n/2) {
                nst1--;
                nst2--;
                nsp += 2;

            }
            else {
                nst1++;
                nst2++;
                nsp -= 2;
            }
            row++;

        }

    }
}
