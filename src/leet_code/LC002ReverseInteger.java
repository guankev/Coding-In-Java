package leet_code;

public class LC002ReverseInteger {
    public static void main(String[] args) {
       int x = 1534236469;

        System.out.println(new LC002ReverseInteger().reverse(x));
    }

    public int reverse(int x) {
        if (Math.abs((long)x) > Integer.MAX_VALUE || x == 0)
            return 0;

        if (x == 1)
            return 1;

        boolean negativeInteger = false;

        if (x < 0) {
            negativeInteger = true;
            x = Math.abs(x);
        }

        long reversedNumber = 0;

        while (x  != 0) {
            reversedNumber += x % 10;
            x /= 10;

            if (x > 0) {
                reversedNumber *= 10;
            }
        }

        if (reversedNumber > Integer.MAX_VALUE)
            return 0;

        if (negativeInteger)
            return (int)(reversedNumber / -1);

        return (int)reversedNumber;
    }
}
