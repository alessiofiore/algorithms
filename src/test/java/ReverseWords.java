import java.util.Arrays;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverse("i.like.this.program.very.much"));
    }

    private static String reverse(String s) {
        char[] rev = new char[s.length()];
        int i = s.length() - 1;
        int idx = 0;
        while(i >= 0) {
            String word = "";
            while(s.charAt(i) != '.' && i > 0) {
                word = s.charAt(i) + word;
                i--;
            }

            for(int j = 0; j < word.length(); j++) {
                rev[idx++] = word.charAt(j);
            }

            rev[idx++] = '.';
            i--;
        }
        return Arrays.toString(rev);
    }
}
