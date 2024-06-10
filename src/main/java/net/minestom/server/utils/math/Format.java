package net.minestom.server.utils.math;

public class Format {

    public static String toFormatedNumber(int number) {
        String str = String.valueOf(number);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        str = sb.toString();
        StringBuilder newString = new StringBuilder();
        int digitRunner = 0;
        for (int i = 0; i < str.toCharArray().length; i++) {
            newString.append(str.toCharArray()[i]);
            digitRunner++;
            if (digitRunner == 3 && (i + 1) != str.toCharArray().length) {
                digitRunner = 0;
                newString.append(",");
            }
        }
        return newString.reverse().toString();
    }
}
