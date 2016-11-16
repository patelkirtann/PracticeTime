import java.util.Scanner;

/**
 * Created by kt_ki on 9/27/2016.
 */
public class InheritancePractice {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    InheritancePractice(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}

class Student extends InheritancePractice{
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
        super.firstName = firstName;
        super.lastName = lastName;
        super.idNumber = id;
    }

    public char calculate(){
        int result = 0;
        char grad = ' ';

        for (int i = 0; i < testScores.length ; i++) {
            result += testScores[i] ;
        }
        result /= testScores.length;
        if( 90 <= result && result <= 100){
            grad = 'O';
        }
        if( 80 <= result && result <= 90){
            grad = 'E';
        }
        if( 70 <= result && result <= 80){
            grad = 'A';
        }
        if( 55 <= result && result <= 70){
            grad = 'P';
        }
        if( 40 <= result && result <= 55){
            grad = 'D';
        }
        if( 40 > result){
            grad = 'T';
        }

        return grad;
    }
}

class Solution1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
