import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie ticket price: \n");
        int price = sc.nextInt();
        System.out.println("Enter the movie rating: ");
        int rating = sc.nextInt();

        if (price >= 12 && rating == 5) {
            System.out.println("I'm interested in watching the movie");
        }
        else {
            System.out.println("I'm not interested in watching the movie");
        }


    }
}
