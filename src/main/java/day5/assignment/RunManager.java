package day5.assignment;

import day5.assignment.branch.Bangalore;
import day5.assignment.branch.Chennai;
import day5.assignment.customer.Customer;

import java.util.Arrays;

public class RunManager {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Indhumathi", "123", Arrays.asList("ValidAdhar", "pan"));
        Customer customer2 = new Customer("Nigi", "124", Arrays.asList("InvalidAdhar", "pan"));
        Customer customer3 = new Customer("Chithra", "125", Arrays.asList("ValidAdhar", "pan"));
        Customer customer4 = new Customer("Thileeban", "126", Arrays.asList("InvalidAdhar", "pan"));
        Customer customer5 = new Customer("Sai", "127", Arrays.asList("ValidAdhar", "pan"));

        Chennai chennai = new Chennai();
        chennai.approveLoan(customer1);
        chennai.approveLoan(customer2);

        Bangalore bangalore = new Bangalore();

        bangalore.approveLoan(customer3);
        bangalore.approveLoan(customer4);
        bangalore.approveLoan(customer5);

    }
}
