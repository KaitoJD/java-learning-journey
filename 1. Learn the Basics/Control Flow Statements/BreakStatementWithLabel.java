public class BreakStatementWithLabel {
    public static void main(String[] args) {

        int[][] arrayOfInts = {
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };
        int searchFor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        search: // This is a label
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length;
                 j++) {
                if (arrayOfInts[i][j] == searchFor) {
                    foundIt = true;
                    break search; // This causes the program to break at the target label, which for this program is the outer loop
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at " + i + ", " + j);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }
}
