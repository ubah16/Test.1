public class Main2 {
    static void main () {

        printCourseInfo();
        greetStudent("Ubah");
        int summa = calculateTotal (4, 9);

        System.out.println(summa);



    }

    public static void printCourseInfo() {
        System.out.println("Welcome to the course, today we are in the classroom 5");
    }

    public static void greetStudent(String name){
        System.out.println("Hello " + name);
    }
    public static int calculateTotal(int firstNumber, int secondNumber){
       return firstNumber + secondNumber;

    }
}
