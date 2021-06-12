package pattern;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 7;
        int nst1 = n / 2;
        int nst2 = n / 2;
        int nsp = 1;

        int row = 1;
        while (row <= n) {

            if (row == 1 || row == n) {
                for (int i = 0; i < n; i++) {
                    System.out.print("* ");
                }
                System.out.println("");
                if (row == n) {
                    break;
                }
                row++;
            }

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
            if (row <= n - 4) {
                nsp += 2;
                nst1--;
                nst2--;
            } else {
                nsp -= 2;
                nst2++;
                nst1++;
            }
            row++;
        }
    }
}
