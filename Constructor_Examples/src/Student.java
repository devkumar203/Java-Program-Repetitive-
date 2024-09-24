import java.util.Scanner;
public class Student {
    /*
    Define a class Student described as below:
    Data Members/Instance Variables:
    name, age, m1, m2, m3(marks in 3 subjects), maximum, average

    Member methods:
      i. A parameterised constructor to initialise the data members
     ii. To accept the detail of a student
    iii. To compute the average and the maximum out of three marks
     iv. To display the name, age, and marks in three subjects, maximum marks and
         average marks
     Write a main method to create an object of a class an call the above member method
     */
    String name;
    int age, m1, m2, m3, maximum;
    double average;

    public Student(){

    }
    Student(String name, int age, int m1, int m2, int m3){
        this.name = name;
        this.age = age;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.average = average;
    }

    public void acceptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the student age: ");
        age = sc.nextInt();
        System.out.println("Enter the marks in three subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    public void average(){
        double avg = (m1+m2+m3)/3;
        System.out.println("Average marks: "+avg);

        if(m1 > m2 && m1 > m3){
            System.out.println("maximum marks: "+m1);
        }else if(m2 > m3){
            System.out.println("maximum marks: "+m2);
        }else
            System.out.println("maximum marks: "+m3);
    }



    void show(){
        System.out.println("name is: "+ name);
        System.out.println("age is: "+ age);
        System.out.println("m1 is: "+m1);
        System.out.println("m2 is: "+ m2);
        System.out.println("m3 is: "+m3);
        average();
    }

    public static void main(String[] args){
        Student st = new Student();
        st.acceptDetails();
        st.average();
        System.out.println("Student 1 details *** with default constructor");
        System.out.println("\n");
        st.show();

        Student st2 = new Student("Rekha Batra", 15, 94, 99, 92);
        System.out.println("Student2 details *** With parameterised constructor");
        System.out.println("\n");
        st2.average();
        st2.show();

    }

}
