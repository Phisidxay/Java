public class Pizzaclient{

    public void run(){

        Pizza circle = new Pizza (7.00, new Circle (5.5));
        Pizza rectangle = new Pizza (8.99, new Rectangle (6,4));
        PizzaDeal pizzadeal = new PizzaDeal();
        System.out.println(circle);
        System.out.println("Berter deal than ");
        System.out.println(rectangle + ": " + pizzadeal.betterDeal(circle,rectangle));
    }
    
    public static void main(String[] nu){
        new Pizzaclient().run();
    }
}