package java_masterclass;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");                // 必须用if...else...因为这里只是打印，没有return
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if ((i == 1 || i == number) || (j == 1 || j == number) || i == j || i == (number - j + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(8);
        System.out.println("Printing another diagonal star");
        printSquareStar(5);
        System.out.println("Printing another diagonal star");
        printSquareStar(2);

    }
}
