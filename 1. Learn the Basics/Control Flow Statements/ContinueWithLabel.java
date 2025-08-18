public class ContinueWithLabel {
    public static void main(String[] args) {

        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = searchMe.length() -
                  substring.length();

        test: // This is a label
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test; // uses the labeled test of continue to skip an iteration in the outer loop
                }
            }
            foundIt = true;
                break;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}
