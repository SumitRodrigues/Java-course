public class PracticeSet2_Q2 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println("Grade before decrypting is " +grade);

        //Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println("Grade after decrypting is " + grade);
    }
}
