public class Main {
    public static void main(String[] args) {
        int summerCost = 0;
        int springCost = 0;
        int winterCost = 0;
        int fallCost = 0;
        System.out.println("Please enter the costs of each season's expenses. ");
        summerCost = 45;
        System.out.println("You said the summer cost is " + summerCost);
        springCost = 50;
        System.out.println("You said the spring cost is " + springCost);
        winterCost = 52;
        System.out.println("You said the winter cost is " + winterCost);
        fallCost = 65;
        System.out.println("You said the fall cost is " + fallCost);
        System.out.println("This years total cost is: " + (summerCost + springCost + winterCost + fallCost));

    }
}