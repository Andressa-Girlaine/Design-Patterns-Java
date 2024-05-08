public class SprinklesCakeDecorator extends Cake {
    private Cake cake;

    public SprinklesCakeDecorator(Cake cake, String saying ) {
        this.cake = cake;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";
    }

    @Override
    public int getCost() {
        return cake.getCost() + 2;
    }
}