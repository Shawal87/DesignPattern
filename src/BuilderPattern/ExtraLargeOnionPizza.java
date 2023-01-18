package BuilderPattern;

public class ExtraLargeOnionPizza extends VegaPizza{
    @Override
    public float price() {
        return 200.0f;
    }

    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Extra-Large Size";
    }
}