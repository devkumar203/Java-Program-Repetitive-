public class ArrayExample {
    public static void main(String[] args) {
        // i) Create an array to hold 15 double values
        double[] numbers = new double[15];

        // ii) Assign the value 10.5 to the last element in the array
        numbers[14] = 10.5;

        // Display the sum of the first and the last element
        System.out.println("Sum of the first and the last element: " + (numbers[0] + numbers[14]));

        // iv) Compute the sum of all elements in the array
        double sum = 0; // Initialize sum to 0
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // Add each element to sum
        }

        // Display the sum of all elements in the array
        System.out.println("Sum of all elements in the array: " + sum);
        double sum1 = 0;
        for(int i = 0; i < numbers.length; i++){
            sum1 = sum1 + numbers[i];
        }
        System.out.println(sum1);
    }
}


