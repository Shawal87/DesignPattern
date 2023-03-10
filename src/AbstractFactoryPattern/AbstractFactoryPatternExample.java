package AbstractFactoryPattern;
//Use the FactoryCreator to get AbstractFactory in order to get factories of concrete classes by passing an information such as type.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactoryPatternExample {
    public static void main(String args[]) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of Bank from where you want to take loan amount");
        String bankName = br.readLine();

        System.out.println("\n");
        System.out.println("Enter the type of loan e.g. home loan or business loan or education loan: ");

        String loanName  = br.readLine();
        AbstractFactory bankFactory  = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.println("\n");
        System.out.println("Enter the interest rate for" + b.getBankName()+ ":");

        double rate = Double.parseDouble(br.readLine());
        System.out.println("\n");
        System.out.println("Enter the loan amount you want to take: ");


        double loanAmount = Double.parseDouble(br.readLine());
        System.out.println("\n");
        System.out.println("Enter the number of years to pay your entire loan amount");
        int years = Integer.parseInt(br.readLine());

        System.out.println("\n");
        System.out.println("You are taking loan from" + b.getBankName());


        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
          Loan i = loanFactory.getLoan(loanName);
          i.getInterestrate(rate);
          i.calculateLoanPayment(loanAmount,years);



    }
}
