public class SUMITpATTERN {
    public static void main(String[] args){

//       for(int i = 0; i < 5; i++){
//           for(int j = 5; j > i; j--){
//               System.out.print("  ");
//           }
//
//           for(int k = 0; k < i; k ++){
//               System.out.print("+ ");
//           }
//
//           for(int l = 1; l < i; l++){
//               System.out.print("+ ");
//           }
//           System.out.println();
//       }

//        for(int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//
//            for(int k = 5; k > i; k--){
//                System.out.print(" +");
//            }
//
//            for(int l = 4; l > i; l-- ){
//                System.out.print(" +");
//            }
//            System.out.println();
//        }

//        for(int i = 5; i > 0; i--){
//            for(int j = 0; j < 5 - i; j++){
//                System.out.print(" ");
//            }
//
//            for(int k = 0; k < (2*i -1); k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int rows = 5; // Number of rows for the inverted pyramid

        for (int i = rows; i >= 1; i--) { // Outer loop for the number of rows
            // Loop for printing leading spaces (equal left and right spaces)
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            // Loop for printing stars with spaces between them
            for (int k = 0; k < i; k++) {
                System.out.print("* "); // Star followed by a space
            }
            System.out.println(); // Move to the next line after each row
                }
            }
    }
