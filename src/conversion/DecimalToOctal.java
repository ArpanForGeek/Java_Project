package conversion;

public class DecimalToOctal {
    public static void main(String[] args) {
        int n = 456;
        int res = 0;
        int mul = 1;

        while(n!=0){
            int rem = n%8;
            res = res + mul*rem;
            mul = mul*10;
            n = n/8;
        }
        System.out.println(res);
    }
}
