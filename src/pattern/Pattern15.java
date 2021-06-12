package pattern;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = 0;
        int nst = n;
        int row = 1;

        while (row <= 2 * n - 1) {

            int csp = 1;
            while (csp <= nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst = 1;
            while (cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println("");
            if (row < 5) {
                nsp += 2;
                nst--;
            } else {
                nsp -= 2;
                nst++;
            }
            row++;
        }
    }
}
