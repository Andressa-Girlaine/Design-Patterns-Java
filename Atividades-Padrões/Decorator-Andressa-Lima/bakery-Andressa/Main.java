public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new SayingCakeDecorator(new VanillaCake(), "PLAIN!"));
        order.addCake(new SprinklesCakeDecorator(new SayingCakeDecorator(new VanillaCake(), "FANCY"), null));
        order.addCake(new MultiLayeredCakeDecorator(new SprinklesCakeDecorator( new SprinklesCakeDecorator(new SayingCakeDecorator(new StrawberryCake(), "One of"), "EVERYTHING"), ""
)));
        order.printOrder();
    }
}