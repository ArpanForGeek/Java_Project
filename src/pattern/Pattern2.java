package pattern;

//n = 5
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
public class Pattern2 {

    public static void main(String[] args) {
        int n = 5;
        int nst = 1;
        int row = 1;

        while (row <= n) {
            int cst = 1;
            while (cst <= nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println(" ");
            row++;
            nst++;
        }
    }
}
