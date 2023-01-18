package FactoryPattern;


//use getPlan to get object of type of plan

public class GetPlanFactory {

    public Plan getPlan(String planType){
        if (planType == null){
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTIC PLAN")){
            return new DomesticPlan();
        }
        if (planType.equalsIgnoreCase("COMMERCIAL PLAN")){
            return new CommercialPlan();
        }
        if (planType.equalsIgnoreCase("ENTERPRISE PLAN")){
            return new EnterprisePlan();
        }
        return null;
    }
}
