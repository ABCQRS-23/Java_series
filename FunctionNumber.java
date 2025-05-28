public class FunctionNumber {
    public static void main(String[] args) {
        int first = 10;
        int second = 21;

        isOddEven(first);
        isOddEven(second);

    }
    // public static void isOddEven(int number) {
    // if (number % 2 == 0) {
    // System.out.println(number + " is even");
    // }
    // else {
    // System.out.println(number + " is odd");
    // }

    // }
    public static void isOddEven(int number) {
        switch (number % 2) {
            case 0:
                System.out.println("even");
                break;

            default:
                System.out.println("odd");
                break;

        }

    }
}