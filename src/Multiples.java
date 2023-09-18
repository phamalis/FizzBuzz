public class Multiples {
    public static void main(String[] args) {

        int j = 0;
        for (int i = 1; i < 1000; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 || divisibleBy5) {

                j = j + 1;

            }

        }

        System.out.println(j);
    }
}
// Prints how many multiples of 3 and 5 under 1000
