public class Main {
    public static void main(String[] args) {

        double springCost = 250.00;
        double summerCost = 300.00;
        double fallCost = 200.00;
        double winterCost = 350.00;

        double yearlyTotal = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring maintenance: $" + springCost);
        System.out.println("Summer maintenance: $" + summerCost);
        System.out.println("Fall maintenance: $" + fallCost);
        System.out.println("Winter maintenance: $" + winterCost);
        System.out.println("Yearly maintenance cost: $" + yearlyTotal);
    }
}