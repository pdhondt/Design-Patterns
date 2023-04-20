package be.vdab.taak2singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var magic8BallGame = Magic8Ball.INSTANCE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Stel een willekeurige vraag (STOP om te eindigen): ");
        while (!scanner.nextLine().equalsIgnoreCase("STOP")) {
            System.out.println(magic8BallGame.generateAnswer());
            System.out.println("Stel een willekeurige vraag (STOP om te eindigen): ");
        }
    }
}
