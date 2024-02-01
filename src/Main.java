//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refilling = 1100;
        int bonus = 0;
        if (refilling > 1000) {
            bonus = refilling / 100;
            balance = balance + refilling + bonus;
        } else {
            balance = balance + refilling;
        }
        System.out.println("Your balance = " + balance + " rubles.");
        System.out.println("Your bonus " + bonus + " rubles.");
    }
}