package pattern;

public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int nsp = n-1;
        int row = 1;
        int nst = 1;

        while(row<=2*n-1) {

            if (row <= n) {

                int cst = 1;
                while (cst <= nst) {
                    System.out.print("* ");
                    cst++;
                }
                if(row<=n) {
                    System.out.println("");
                }
            }else{
                nst = 1;
                int csp = 1;
                while(csp<=nsp){
                    System.out.print("  ");
                    csp++;
                }
                int cst=1;
                while(cst<=nst){
                    System.out.print("* ");
                    cst++;
                }
                System.out.println("");
                nsp--;
            }
            row++;
            nst++;
        }
    }
}
