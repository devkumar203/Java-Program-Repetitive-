import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the numbers: ");
//        int num = sc.nextInt();
//        int foundNumber = -1;
//
//        int arr[] = new int[num];
//        for (int i = 0; i < num; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter the finding number: ");
//        int findNum = sc.nextInt();
//
//        for (int i = 0; i < num; i++) {
//            if (arr[i] == findNum) {
//                foundNumber = i;
//            }
//        }
//        if(foundNumber >=0){
//            System.out.println("Number "+ findNum+" found at index "+foundNumber);
//        }else
//            System.out.println("Number "+findNum+" found at index "+ foundNumber);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The array's element is :");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the search number: ");
        int searchNum = sc.nextInt();
        int foundIndex = -1;

        for(int i = 0; i <= arr.length-1; i++){
            if(searchNum == arr[i]){
                foundIndex = i;
            }
        }

        if(foundIndex >= 0){
            System.out.println("Search number is "+searchNum+" and index is "+foundIndex);
        }else
            System.out.println("Number "+ searchNum+" is not found.");
















      }
}
