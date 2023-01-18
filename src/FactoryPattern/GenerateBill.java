package FactoryPattern;


import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Generate Bill by using the GetPlanFactory to get the object of concrete classes
by passing an information such as type of plan DOMESTICPLAN or COMMERCIALPLAN or ENTERPRISE PLAN.

 */
public class GenerateBill {

    public static void main(String args []) throws IOException {

        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan for which the bill will be generated:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();
        System.out.println("Enter the number of units for bill will b calculated");
        int units = Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planName);
        // call getRate() method and calculateBill() method of domestic plan

        System.out.println("Bill amount for" + planName + "of" +units + "units is:");
        p.getRate();
        p.calculateBill(units);
    }
}
