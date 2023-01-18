package AbstractFactoryPattern;

// Create concrete classes that extend the Loan abstract class..
public class HomeLoan extends Loan{
    @Override
   public  void getInterestrate(double r) {
        rate  = r;
    }
}
