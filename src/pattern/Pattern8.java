package pattern;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nst = n;

        while (row <= n) {


            int cst = 1;
            while (cst <= nst) {
                if(cst == row || cst+row == n+1) {
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
                cst++;
            }
            row++;
            System.out.println(" ");
        }
    }
}

