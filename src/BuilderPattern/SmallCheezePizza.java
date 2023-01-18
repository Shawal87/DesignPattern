package BuilderPattern;

public class SmallCheezePizza extends VegaPizza{

    @Override
    public float price() {
        return 170.0f;
    }

    @Override
    public String name() {
        return "Cheeze Pizza";
    }

    @Override
    public String size() {
        return "Small size";
    }
}
