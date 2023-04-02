public class Month {

    public static void getWordMaxLength(String word1, String word2, String word3) {
        int l1 = word1.length();
        int l2 = word2.length();
        int l3 = word3.length();

        if (l1 > l2 && l1 > l3) {
            System.out.println("\"" + word1 + "\" has the max word length");
        } else if (l2 > l3 && l2 > l1) {
            System.out.println("\"" + word2 + "\" has the max word length");
        } else if (l3 > l2 && l3 > l1) {
            System.out.println("\"" + word3 + "\" has the max word length");
        } else if (l1 == l3 && l2 < l1) {
            System.out.println("\"" + word1 + "\" and \"" + word3 + "\" are equal and both have the max word length");
        } else if (l2 == l3 && l2 > l1) {
            System.out.println("\"" + word2 + "\" and \"" + word3 + "\" are equal and both have the max word length");
        } else if (/*l1 == l2 && */l2 > l3) {
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are equal and both have the max word length");
        } else /*if (l1 == l2 && l2 == l3)*/{
            System.out.println("\"" + word1 + "\" and \"" + word2 + "\" and \"" +  word3 + "\" are equal and have the same word length");
        }
    }

    public static void getMonthDays(int month) {
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month has " + 31 + " days");
                break;
            case 2:
                System.out.println("Month has " + 28 + " days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month has " + 30 + " days");
                break;
            default:
                System.out.println("Invalid month");
        }
    }

    public static void printTree(int length) {
        for (int count = 1; count <= length; count++) {
            for (int i = 0; i < count; i++) {
                System.out.print("x");
            }
            System.out.println();
        }
        for (int count = length - 1; count >= 1; count--) {
            for (int i = 0; i < count; i++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void printRightBottomTree(int length) {
        for (int count = 1; count <= length; count++) {
            for (int i = length - 1; i >= 0; i--) {
                if(i <= length - count) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printRightTopTree(int length) {
        for (int count = 1; count<=length; count++) {
            for (int i = 0; i < length; i++) {
                if(i < length - count) {
                    System.out.print(" ");
                } else {
                    System.out.print("x");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        getWordMaxLength("iyygkggugug", "jhgkhgkg", "iyygkggugug");
        getMonthDays(1);
        printTree(5);
        printRightBottomTree(5);
        printRightTopTree(5);
    }
}

