import javax.swing.*;
public class Guessing_Number {
    public static void main(String[] args) {
        int Number = (int) (Math.random() * 100 + 1);
        int User_Guess = 0;
        int chances = 1;
        try {
            while (User_Guess != Number) {
                String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
                User_Guess=Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + Guess_count(User_Guess, Number, chances));
                chances++;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static String Guess_count(int User_Guess , int Number , int chances)
    {
        if (User_Guess <= 0 ||User_Guess > 100) {
            return "You made an invalid Guess";
        } else if (User_Guess == Number) {
            return "Awesome!You made a right Guess! \n Total Guesses : " + chances;
        } else if (User_Guess > Number) {
            return "You have Guessed too high,Make another Try, \n Try Chances : " + chances;
        } else if (User_Guess < Number) {
            return "You have Guessed too low,Make another Try, \n Try Chances :  " + chances;
        } else {
            return "You made an incorrect Guess \n Try Chances : " + chances;
        }
    }
}