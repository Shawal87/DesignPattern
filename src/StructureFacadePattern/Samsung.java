package StructureFacadePattern;

public class Samsung implements MobileShop{
    @Override
    public void modelNo() {
        System.out.println(" galaxy tab 3");
    }

    @Override
    public void price() {
        System.out.println("RM 2000");
    }
}
