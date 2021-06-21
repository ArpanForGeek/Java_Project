package conversion;

public class BinaryToDecimal {

    public static void main(String[] args) {
        System.out.println("MMMM"+(2%10));

        int n = 100110;
        int res = 0;
        int mul = 1;

        /**
         * Division with destination base and Multiplication with source base
         * Here we are doing Binary to Decimal conversion
         * So , destination base -> 10 & source base -> 2
         */
        while (n != 0) {
            // Division with destination base -> 10
            int rem = n % 10;
            res = res + mul * rem;

            //Multiplication with source base ->2
            mul = mul * 2;
            // Division with destination base -> 10
            n = n / 10;
        }

        System.out.println(res);
    }
}
