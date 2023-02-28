package day5.assignment.branch;

import day5.assignment.customer.Customer;
import day5.assignment.rules.HeadOffice;

public class Chennai extends HeadOffice {

    public boolean verifyDocuments(Customer customerDetails) {
        switch (customerDetails.getDocumentList().get(0)) {
            case "ValidAdhar":
                System.out.println(customerDetails.getName() + " submitted valid documents.");
                return true;
            case "InvalidAdhar":
                System.out.println(customerDetails.getName() + " submitted invalid documents.");
                return false;
            default:
                System.out.println(customerDetails.getName() + " required documents are missing or invalid.");
                return false;
        }
    }

    public void approveLoan(Customer customer) {
        if(verifyDocuments(customer)==true){
            System.out.println("For the customer "+customer.getName()+" loan has been approved");
        }else{
            System.out.println("For the customer "+customer.getName()+" loan has been rejected.");
        }

    }
}
