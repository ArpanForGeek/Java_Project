package pattern;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int row = 1;

        while (row <= n) {
            System.out.print("* ");
            int cst = 1;
            while (cst < nst - 1) {
                if (row == 1 || row == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                cst++;
            }
            System.out.print("* ");
            System.out.println("");
            row++;
        }
    }
}
