package Reverse;

public class BasicReverse {

    public static void main(String[] args) {


        String str = "Welcome to coding world!";

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
result += str.charAt(i);

        }
        System.out.println(result);
    }
}