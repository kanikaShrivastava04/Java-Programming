public class Ex10 {
    public static void main(String[] args) {
        int n=4;

        for (int i = n; i >= 1; i--) {        // rows
            for (int j = 1; j <= i; j++) {    // stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
