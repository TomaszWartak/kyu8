package pl.dev4lazy.credit_card_mask;

public class Maskify {

    public static String maskify(String str) {
        String result = get4LastChars(str);
        for (int charPosition=1; charPosition<=(str.length()-4); charPosition++) {
            result = "#"+result;
        }
        return result;
    }

    private static String get4LastChars(String str) {
        String result;
        result = str.substring(Math.max(0, str.length() - 4));
        return result;
    }
}

