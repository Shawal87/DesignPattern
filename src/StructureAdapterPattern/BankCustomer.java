package StructureAdapterPattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard{


    @Override
    public void giveBankDetails() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the account holder name:");
            String customername = br.readLine();
            System.out.println("\n");

            System.out.println("Enter the account number:");
            long accno = Long.parseLong(br.readLine());    // what a function Long.parseLong
            System.out.println("\n");

            System.out.println("Enter the bank name:");
            String bankname = br.readLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);

        } catch (Exception e){
            e.printStackTrace();   // what the different exception vs printStackTrace()
        }
    }

    @Override
    public String getCreditCard() {
        long accno = getAccNumber();
        String accholdername  = getAccHolderName();
        String bname = getBankName();


        return ("The Account number" + accno  + "of" + accholdername + "in" + bname +"bank is valid abd authenticated for issuing the credit card.");
    }
}
