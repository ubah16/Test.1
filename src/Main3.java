public class Main3 {
    public static void main (String [] args) {
        String[] studentNames = {"Anna", "Leo", "Sara", "Noah"};
        printNames(studentNames);


    }

public static void printNames (String [] names) {
    for (int index = 0; index < names.length; index++) {
        System.out.println(names[index]);
    }
}
}