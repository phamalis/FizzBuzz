public class Reduce {
    public static void main(String[] args) {
        Reduce.reduce(100);

    }

    public static void reduce(int n){

        //number of steps
        int x = 0;

        while (n > 0) {

            boolean even = n % 2 == 0;

            if (even) {
                n = n / 2;

            } else {
                n = n - 1;
            }

            x = x + 1;
        }

        System.out.println(x);

    }

}

// n -> (if even: divide by 2), (if odd: subtract 1)
// print how many steps it takes to reach 0