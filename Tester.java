import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Tester {
    public static void main(String[] args) {
        try {
            //System.out.println(USACO.silver("testCases/ctravel.2.in"));
            System.out.println("Silver:");
            for (int i = 1; i < 6; i++) {
                File checkPlus = new File("ctravel." + i + ".out");
                Scanner A = new Scanner(checkPlus);
                int yourAnswer = USACO.silver("ctravel." + i + ".in");
                int correctAnswer = A.nextInt();
                System.out.println(i + " Yours: " + yourAnswer + " Key: " + correctAnswer + " " + (yourAnswer == correctAnswer));
                A.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
