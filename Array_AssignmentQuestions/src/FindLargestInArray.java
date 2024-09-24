public class FindLargestInArray {

        public static void main(String[] args) {
            // Example 2D array initialization
            int data[][] = {
                    {5, 2, 9, 1, 7},
                    {3, 8, 4, 6, 0},
                    {12, 15, 7, 11, 10},
                    {1, 2, 3, 4, 5},
                    {14, 22, 19, 13, 17}
            };

            // Call the method to find the largest number
            int largest = findLargest(data);

            // Print the largest number
            System.out.println("The largest number in the array is: " + largest);
        }

        // Method to find the largest integer in a 2D array
        public static int findLargest(int[][] array) {
            int max = Integer.MIN_VALUE; // Initialize with the smallest possible integer value

            // Loop through each element of the 2D array
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }

            return max; // Return the largest value found
        }
    }

