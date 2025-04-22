package CoreJava.StringProblems;

public class CapitalizeFirstWord {
    public static void main(String[] args) {
        String inputString = "This is my input string";
        String [] words = inputString.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for(String word:words)
        {
            stringBuilder.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        System.out.println(stringBuilder.toString());

    }
}
