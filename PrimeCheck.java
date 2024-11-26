
public class PrimeCheck {
    public static void main(String[] args) {
        int number = 29; // Change this to test other numbers
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false; // 0 and 1 are not prime numbers
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself
            }
        }
        return true;
    }
}
