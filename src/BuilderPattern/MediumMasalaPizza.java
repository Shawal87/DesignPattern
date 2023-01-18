package BuilderPattern;

public class MediumMasalaPizza extends VegaPizza{

    @Override
    public float price() {
        return 120.0f;
    }

    @Override
    public String name() {
        return "Masala Pizza";
    }

    @Override
    public String size() {
        return "Medium Pizza";
    }
}
