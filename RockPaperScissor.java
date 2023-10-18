//Rock Paper Scissor Game using conditional statement
import java. util. Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.println("Player1:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        if (value == 1) {
            System.out.println("Rock");
        } else if (value == 2) {
            System.out.println("Paper");
        } else System.out.println("Scissor");
        Random r = new Random();
        int min = 1;
        int max = 3;
        System.out.println("Player2:");
        int value1=r.nextInt(max - min + 1) + min;
        System.out.println(value1);
        if (value1 == 1) {
            System.out.println("Rock");
        } else if (value1 == 2) {
            System.out.println("Paper");
        } else System.out.println("Scissor");

        if (value==1&&value1==2){
            System.out.println("Player2 is the winner");
        } else if (value==1&&value1==3) {
            System.out.println("Player1 is the winner");
        }
        else if (value==2&&value1==3) {
            System.out.println("Player2 is the winner");
        }
        else if (value==3&&value1==1) {
            System.out.println("Player2 is the winner");
        }
        else if (value==3&&value1==2) {
            System.out.println("Player1 is the winner");
        }
        else if (value==2&&value1==1) {
            System.out.println("Player1 is the winner");
        }
        else
            System.out.println("try again");
    }}