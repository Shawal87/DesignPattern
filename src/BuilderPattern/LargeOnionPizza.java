package BuilderPattern;

public class LargeOnionPizza extends VegaPizza{
    @Override
    public float price() {
        return 180.0f;
    }

    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Large Pizza";
    }
}
