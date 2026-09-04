public class Main4 {
    public static void main(String[] args) {
        int[] favouriteNumbers2 = {1, 3, 6, 8, 9};


        for (int index = 0; index < favouriteNumbers2.length; index++) {
            System.out.println(favouriteNumbers2[index]);
        }

        int summa = 0;
        for (int index = 0; index < favouriteNumbers2.length; index++) {
            summa += favouriteNumbers2[index];
        }

        System.out.println("Summan är: " + summa);
    }
}