public class ReverseNumber {
    public static void main(String[] args) {
        int number = 12345; // Number to reverse
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
