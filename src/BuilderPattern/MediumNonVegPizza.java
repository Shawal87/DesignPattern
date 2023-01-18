package BuilderPattern;

import BuilderPattern.NonVegPizza;

public class MediumNonVegPizza extends NonVegPizza {

    @Override
    public String name() {
        return "Non-Veg Piza";
    }

    @Override
    public String size() {
        return "Medium Size";
    }

    @Override
    public float price() {
        return 200.0f;
    }
}
