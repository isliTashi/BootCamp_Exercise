package carpetCostCalculator;

public class Main {
    public static void main(String[] args) {
        Floor floor = new Floor(12, 10);

        Carpet carpet = new Carpet(8);

        Calculator calculator = new Calculator(floor, carpet);

        double totalCost = calculator.getTotalCost();

        System.out.println("Total cost for carpeting: $" + totalCost);
    }
}
