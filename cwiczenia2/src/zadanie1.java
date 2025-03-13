import java.util.Scanner;
public class zadanie1 {

    public static void main(String[] args) {


        System.out.println("How old are you?");
        Scanner ageScanner = new Scanner(System.in);
        int age = ageScanner.nextInt();
        System.out.println("Which city do you live in?");
        Scanner cityScanner = new Scanner(System.in);
        String city = cityScanner.next();
        System.out.println("What day is it today?");
        Scanner dayScanner = new Scanner(System.in);
        String day = dayScanner.nextLine();

        int price = 40;
        int discount = 0;

        if (age < 10) {
            discount = discount + 100;
        } else if (age <= 18) {
            discount = discount + 50;
        };

        if (day.equals("Thursday")) {
            discount = discount + 100;
        }

        if (city.equals("Warsaw")) {
            discount = discount + 10;
        };

        if (discount > 100) {
            discount = 100;
        }

        System.out.println("Data: " + city + ", " + age + " years old, " + day);
        System.out.println("Ticket price: " + (price - ((price * discount)/100)) + " PLN");
        System.out.println("Discount: " + discount + "%");
    }

}

