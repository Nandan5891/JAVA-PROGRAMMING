package INTERVIEW_PROGRAM;

public class ReplaceVowelByStar {
    public static void main(String[]args)
    {
        String str="Historicalmonument";

        System.out.println("Input String is: "+ str);

        System.out.println(str.replaceAll("[aAeEIiOoUu]","*"));

    }
}
