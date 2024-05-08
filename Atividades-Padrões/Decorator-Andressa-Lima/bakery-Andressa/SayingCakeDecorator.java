public class SayingCakeDecorator extends Cake {
    private Cake cake;
    private String saying;

    public SayingCakeDecorator(Cake cake, String saying) {
        this.cake = cake;
        this.saying = saying;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying '" + saying + "'";
    }

    @Override
    public int getCost() {
        return cake.getCost();
    }
}