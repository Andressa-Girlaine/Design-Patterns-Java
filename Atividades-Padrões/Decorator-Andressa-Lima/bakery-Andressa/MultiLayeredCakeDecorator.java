public class MultiLayeredCakeDecorator extends Cake {
    private Cake cake;

    public MultiLayeredCakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + cake.getDescription();
    }

    @Override
    public int getCost() {
        return cake.getCost() + 5;
    }
}