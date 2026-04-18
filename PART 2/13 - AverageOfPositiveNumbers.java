
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveNumbers = 0;
        int sum = 0;

        while(true){
            int number = scanner.nextInt();

            if(number == 0){
                break;
            }

            if(number > 0 && number != 0){
                positiveNumbers++;
                sum += number;
            }

        }
        
        if(positiveNumbers == 0){
            System.out.println("Cannot calculate the average");
        } else {
            double avg = (double) sum / positiveNumbers;
            System.out.println(avg);
        }
    }
}
