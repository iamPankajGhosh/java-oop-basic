public class FunctionExample {
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        int result = addNumbers(5, 7);

        System.out.println("The sum is: " + result);
    }
}
