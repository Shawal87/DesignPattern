package BuilderPattern;

public class LargeCheezePizza extends VegaPizza{
    @Override
    public float price() {
        return 260.0f;
    }

    @Override
    public String name() {
        return "Cheeze Pizza";
    }

    @Override
    public String size() {
        return "Large Pizza";
    }
}
