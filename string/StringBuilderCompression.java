// It have a better approach using stringBuilder instead of string operation decrease the time complexity and the memory uses and the better approach.

public class StringBuilderCompression {
    public static String compress(String str) {

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr.append(str.charAt(i));

            if (count > 1) {
                newStr.append(count);
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcdddee";
        System.out.println(compress(str));
    }
    
}
