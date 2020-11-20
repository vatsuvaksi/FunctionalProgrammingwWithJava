package BasicFunctionalPrograms.declarative._Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {
        //normal
        greetCustomer(new Customer("vatsuvaksi","3781"));
        //through consumer (consumer is like a void function )
        greetCustomerConsumer.accept((new Customer("vatsuvaksi","568")));
        //Biconsumer
        Customer cust = new Customer("vatsuvaksi","8278719");
        greetFromBiConsumer.accept(cust,false);


    }
    //through consumer interface
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hey " + customer.customerName + " your phone number is " + customer.customerPhoneNumber);

    //Biconsumer interface
    static BiConsumer<Customer,Boolean> greetFromBiConsumer = (customer,showPhoneNumber) ->System.out.println("Hey " + customer.customerName + " your phone number is " + (showPhoneNumber? customer.customerPhoneNumber : "*******")) ;


    //This is normal
    static void greetCustomer(Customer cust){
        System.out.println("Hey " + cust.customerName + " your phone number is " + cust.customerPhoneNumber);
    }


    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;


        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
