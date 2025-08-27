package String;

public class splitMethod {

    public static String[] mySplit(String str, char delimiter) {
        String temp = "";
        String[] result = new String[str.length()];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == delimiter) {
                if (!temp.isEmpty()) {
                    result[count++] = temp;
                    temp = "";
                }
            } else {
                temp += ch;
            }
        }

        if (!temp.isEmpty()) {
            result[count++] = temp;
        }

        String[] finalResult = new String[count];
        for (int i = 0; i < count; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        String text = "A-B-C-D";
        String[] parts = mySplit(text, '-');

        for (String s : parts) {
            System.out.println(s);
        }
    }
}
