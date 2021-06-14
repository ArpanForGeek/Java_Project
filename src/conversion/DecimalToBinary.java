package conversion;

public class DecimalToBinary {

    public static void main(String[] args) {
        int res = 0;
        int n = 38;
        int mul = 1;

        /**
         * Division with destination base and Multiplication with source base
         * Here we are doing Decimal to Binary conversion
         * So , destination base -> 2 & source base -> 10
         */
        while (n != 0) {
            // Division with destination base -> 2
            int rem = n % 2;
            res = res + mul * rem;
            //Multiplication with source base ->10
            mul = mul * 10;
            // Division with destination base -> 10
            n = n / 2;
        }

        System.out.println(res);
    }
}
