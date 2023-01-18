package AbstractFactoryPattern;

public class ICICI implements Bank{

    private final String BNAME;
    ICICI(){
        BNAME ="ICIC BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
