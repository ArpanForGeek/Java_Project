package conversion;

public class DecimalToBaseSix {
    public static void main(String[] args) {
        int n =  456;
        int mul = 1;
        int res = 0;

        while(n!=0){
            int rem = n%6;
            res = res+rem*mul;
            mul=mul*10;
            n = n/6;
        }

        System.out.println(res);
    }
}
