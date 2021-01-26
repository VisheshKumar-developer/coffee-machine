package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;
        boolean machine = true;

        while (machine) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String choice = sc.next();

            switch (choice) {
            case "buy":
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                String option = sc.next();
                switch (option) {
                    case "1":
                        if (water >= 250 && coffee >= 16 && cups >= 1) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 250;
                            coffee = coffee - 16;
                            cups -= 1;
                            money = money + 4;
                        } else {
                            System.out.println("it can't make a cup of coffee.");
                        }
                        break;

                    case "2":
                        if (water >= 350 && coffee >= 20 && cups >= 1 && milk >= 75) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 350;
                            milk = milk - 75;
                            coffee = coffee - 20;
                            cups -= 1;
                            money = money + 7;
                        } else {
                            System.out.println("it can't make a cup of coffee.");
                        }
                        break;

                    case "3":
                        if (water >= 200 && coffee >= 12 && cups >= 1 && milk >= 100) {
                            System.out.println("I have enough resources, making you a coffee!");
                            water = water - 200;
                            milk = milk - 100;
                            coffee = coffee - 12;
                            cups -= 1;
                            money = money + 6;
                        } else {
                            System.out.println("it can't make a cup of coffee.");
                        }
                    case "back":
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add: ");
                int waterFill = sc.nextInt();
                System.out.println("Write how many ml of water do you want to add: ");
                int milkFill = sc.nextInt();
                System.out.println("Write how many ml of water do you want to add: ");
                int coffeeFill = sc.nextInt();
                System.out.println("Write how many ml of water do you want to add: ");
                int cupsFill = sc.nextInt();
                water = water + waterFill;
                milk = milk + milkFill;
                coffee = coffee + coffeeFill;
                cups = cups + cupsFill;
                break;

            case "take":
                System.out.println("I gave you $" + money);
                money = 0;
                break;
            case "remaining":
                    System.out.println("The coffee machine has:\n" + water +
                            " of water\n" + milk +
                            " of milk\n" + coffee +
                            " of coffee beans\n" + cups +
                            " of disposable cups\n" + "$" + money +
                            " of money");
                    break;
            case "exit":
                machine = false;
            }
        }
    }
}