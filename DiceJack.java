import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 =rollDice();
        int roll2 =rollDice();
        int roll3= rollDice();

        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(num1 < 1 || num2 < 1 || num3 < 1){
                System.out.println("Numbers cannot be less than 1. Shutting the game down");
                System.exit(0);
        }

        if(num1 >6 || num2 > 6 || num3 >6){
            System.out.println("Numbers cannot be bigger than 6. Shutting the game down");
            System.exit(0);
        }

        int sumOfNumbers = num1+num2+num3;

        System.out.println("\n"+roll1);
        System.out.println(roll2);
        System.out.println(roll3);

        int sumOfRollDice = roll1+roll2+roll3;
        System.out.println("Total player ="+ sumOfNumbers+ "\n"+"Total machine ="+sumOfRollDice);

        if(whoWon(sumOfRollDice,sumOfNumbers)){
            System.out.println("Congratulations YOU WON!");
        }else {
            System.out.println("Sorry you lost!");
        }

        scan.close();

    } 
     public static int rollDice(){
        double randomNumber= Math.random() * 6;
        randomNumber +=1;
        return (int)randomNumber;
     }


     public static boolean whoWon(int sumOfRollDice, int sumOfNumbers){
        return(sumOfRollDice < sumOfNumbers && sumOfNumbers - sumOfRollDice <= 3);
}}

