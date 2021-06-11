package pattern;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int nst = n;
        int nsp = 0;

        int row = 1;
        while(row <= n){
            int csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            int cst =1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            row++;
            nsp++;
            nst--;
            System.out.println("");
        }
    }

}

