package BuilderPattern;

public class ExtraLargeNonVegPizza extends NonVegPizza{

    @Override
    public String name() {
        return "Extra-Large Size";
    }

    @Override
    public String size() {
        return "Extra-Large Size";
    }

    @Override
    public float price() {
        return 250.0f;
    }
}
