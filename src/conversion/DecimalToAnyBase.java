package conversion;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        long result = convert(11, 456);
        System.out.println(result);

    }

    public static long convert(int base, int number) {
        int n = number;
        int res = 0;
        int mul = 1;

        while (n != 0) {
            int rem = n % base;
            res = res + rem * mul;
            mul = mul * 10;
            n = n / base;
        }
        return res;
    }
}
