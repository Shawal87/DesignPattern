package StructureFlyweightPattern;

public class ProxyPatternClient {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("  terry");
        access.grantInternetAccess();
    }
}
