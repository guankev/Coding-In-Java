package leet_code;

public class LC004ReverseString {
    public static void main(String[] args) {
        String reverseMe = "Reverse this string!";

        System.out.println(reverseString(reverseMe));
    }

    public static String reverseString(String reverseMe) {
        if (reverseMe.length() <= 1)
            return reverseMe;

        char[] reversedStringArray = new char[reverseMe.length()];

        for (int index = 0; index < reverseMe.length()/2; index++) {
            reversedStringArray[index] = reverseMe.charAt(reverseMe.length() - 1 - index);
            reversedStringArray[reverseMe.length() - 1 - index] =  reverseMe.charAt(index);
        }

        System.out.println(reversedStringArray);

        return String.copyValueOf(reversedStringArray);
    }
}
