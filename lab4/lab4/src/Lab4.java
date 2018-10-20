import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Lab4 {

    private static boolean countParanteses(String text) {
        int counter = 0;
        for (char ch : text.toCharArray()) {
            if (ch == '(') counter++;
            else if (ch == ')') counter--;

            if (counter < 0) break;
        }
        if (counter != 0) return false;
        return true;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Gicu\\IdeaProjects\\OOP\\lab4\\expresie_matem.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null) {
            System.out.println("Expression: " + st);
            System.out.println("Parentheses are put correct in this expression: " + countParanteses(st));
        }
    }

}