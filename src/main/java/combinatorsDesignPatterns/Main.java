package combinatorsDesignPatterns;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("vatsuvaksi","vatsuvaksi@gmail.com","9699", LocalDate.of(1998,02,27));

        System.out.println(new customerValidationService().isValid(cust));
    }
}
