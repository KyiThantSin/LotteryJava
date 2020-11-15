import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        System.out.println("Please enter a three digit number :");
        Scanner input=new Scanner(System.in);
        int user_input=input.nextInt();

        // random number equation
        int max=999;
        int min=100;
        int lottery_num=(int)(Math.random()*(max-min+1)+min);

        //finding lottery number of digits
        int first_lottery_digit=lottery_num/100;
        int first_Of_rem=first_lottery_digit%100;
        int sec_lottery_digit=first_Of_rem/10;
        int third_lottery_digit=first_Of_rem%10;

        // if the user input is exceed 3 digits it doesn't work

if (user_input>=100 && user_input<=999) {
    //finding digits of  user input
    int first_input_digit = user_input / 100;
    int first_user_rem = user_input % 100;
    int sec_input_digit = first_user_rem / 10;
    int third_input_digit = first_user_rem % 10;

    if (first_input_digit == first_lottery_digit && sec_input_digit == sec_lottery_digit && third_input_digit == third_lottery_digit) {
        System.out.println("You win $10,000");
        System.out.println("The lottery number is " + lottery_num);
    }
    if (first_input_digit == first_lottery_digit || first_input_digit == sec_lottery_digit || first_input_digit == third_lottery_digit) {
        if (sec_input_digit == first_lottery_digit || sec_input_digit == sec_lottery_digit || sec_input_digit == third_lottery_digit) {
            if (third_input_digit == first_lottery_digit || third_input_digit == sec_lottery_digit || third_input_digit == third_lottery_digit) {
                System.out.println("You win $3000");
                System.out.println("The lottery number is " + lottery_num);
            }

        }
    }
    if (first_input_digit == first_lottery_digit || first_input_digit == sec_lottery_digit || first_input_digit == third_lottery_digit) {
        System.out.println("You win $1000");
        System.out.println("The lottery number is " + lottery_num);
    } else if (sec_input_digit == first_lottery_digit || sec_input_digit == sec_lottery_digit || sec_input_digit == third_lottery_digit) {
        System.out.println("You win $1000");
        System.out.println("The lottery number is " + lottery_num);
    } else if (third_input_digit == first_lottery_digit || third_input_digit == sec_lottery_digit || third_input_digit == third_lottery_digit) {
        System.out.println("You win $1000");
        System.out.println("The lottery number is " + lottery_num);
    } else {
        System.out.println("Sorry you didn't win the lottery.Try again Good luck! The lottery number is: " + lottery_num);
    }
}
else {
    System.out.println("Please enter 3 digits ");
}

    }
}
