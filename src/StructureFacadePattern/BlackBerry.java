package StructureFacadePattern;

public class BlackBerry implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Z10");
    }

    @Override
    public void price() {
        System.out.println("RM 2500");
    }
}
