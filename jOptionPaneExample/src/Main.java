import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        Random r = new Random();
        int number = r.nextInt(5); // bilinecek olan sayı
        while(true){
            String predict = JOptionPane.showInputDialog("Please enter your guess:");
            int t = Integer.parseInt(predict);
            if(t == number){
                String message = "Your guess is right! - " + i + ". You know on guess";
                JOptionPane.showMessageDialog(null, message);
                break;
            }
            else
                System.out.println("Guessing failed");
                i++;
        }
    }
}