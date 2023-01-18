package StructureCompositePattern;

public class CompositeDemo {

    public static void main(String[] args) {

        Employee emp1 = new Cashier(101, "terry", 20000);
        Employee emp2 = new Cashier(102, "Jeny",15000);
        Employee emp3=new Accountant(103,"lily", 30000.0);
        Employee manager1 =new BankManager(100,"john",1000.0);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();



    }

}
