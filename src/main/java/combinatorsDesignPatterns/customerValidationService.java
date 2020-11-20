package combinatorsDesignPatterns;

import java.time.LocalDate;
import java.time.Period;

public class customerValidationService {
    public boolean isEmailValid(String email) {
        return email.contains("@");
    }
    public boolean isPhoneNumberValid(String phoneNUmber) {
        return (phoneNUmber.length() == 10 ? true : false);
    }

    public boolean isAdult(LocalDate dob) {
        return (Period.between(dob, LocalDate.now()).getYears() > 18 ? true : false);
    }
    public boolean isValid(Customer cust){
        return isEmailValid(cust.getEmail()) && isAdult(cust.getDob()) && isPhoneNumberValid(cust.getPhoneNumbers());
    }
}