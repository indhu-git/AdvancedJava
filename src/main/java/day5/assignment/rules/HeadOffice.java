package day5.assignment.rules;

import day5.assignment.customer.Customer;

public abstract class HeadOffice implements Bank{

    public abstract boolean verifyDocuments(Customer customer);
    public abstract void approveLoan(Customer customer);

    @Override
    public void rbiRules() {
        System.out.println("RBI Rules");
    }
}
