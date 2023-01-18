package AbstractFactoryPattern;


// Create concrete classes that extend the Loan abstract class..
public class BusinessLoan extends Loan{
    @Override
    void getInterestrate(double r) {
        rate = r;
    }
}
