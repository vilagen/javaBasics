public class Main {

    public static void main(String[] args) {

//        int num = 1200;
//        boolean isPrime = true;

        for (int num = 2; num < 10000; num++) {
            boolean isPrime = true;

//            for (int div = 2; div < num; div++) {

            // keep looping while the diviser is less than or equal to the square root of num,
            // Or we can say the square of div is less than or equal to num.
            for (int div = 2; div <= Math.sqrt(num); div++) {
//            for (int div = 2; div * div <= num; div++) {

                if (num % div == 0) {
                    isPrime = false;
                    break;
                };

            };

            if (isPrime) {
                System.out.format("%d is prime.\n", num);
            }
//            else {
//                System.out.println(num + " is not prime.");
//            }
        }
    }

    
}
