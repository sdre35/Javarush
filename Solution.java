
public class Solution {

    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";

    public static void main(String[] args) {

        for (int n = 0; n < 10; n++)
        {
                for (int i = 0; i < 10; i++) {
                    if (n < 9 & i == 3) {
                        System.out.print(hole);
                    } else if (n == 9) {
                        System.out.print(death);
                    } else {
                        System.out.print(land);
                    }
                }
            System.out.println();
        }
    }
}

