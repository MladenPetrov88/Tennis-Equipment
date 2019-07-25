import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tennisRocketPrice = Double.parseDouble(scanner.nextLine());
        int countRockets = Integer.parseInt(scanner.nextLine());
        int sneakers = Integer.parseInt(scanner.nextLine());

        double rocketPrice = tennisRocketPrice * countRockets;
        double sneakersPrice = tennisRocketPrice / 6;
        double totalSneakersPrice = sneakersPrice * sneakers;
        double otherEquipment = (rocketPrice + totalSneakersPrice) * 0.2;

        double totalPrice = rocketPrice + totalSneakersPrice + otherEquipment;


        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(totalPrice / 8));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(totalPrice *7/8));
    }
}
