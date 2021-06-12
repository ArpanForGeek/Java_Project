package pattern;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int row = 1;

        while (row <= 2 * n - 1) {

            int cst = 1;
            while (cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println("");
            if (row < 5) {
                nst++;
            } else {
                nst--;
            }
            row++;
        }
    }
}
