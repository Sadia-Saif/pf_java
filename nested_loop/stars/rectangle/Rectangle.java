package stars.rectangle;

public class Rectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;

        // outer loop => rows
        for (int i = 1; i <= n; i++) {
            // inner loop => columns
            for (int j = 1; j <= m; j++) {

                System.out.print("*");
            }
            System.out.println();

        }
    }
}
