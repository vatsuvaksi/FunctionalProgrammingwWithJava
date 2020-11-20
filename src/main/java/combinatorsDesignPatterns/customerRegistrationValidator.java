package combinatorsDesignPatterns;
//using combinator design pattern 
import java.util.function.Function;

public interface customerRegistrationValidator extends Function<Customer, customerRegistrationValidator.ValidationResult> {

    static customerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ? ValidationResult.Success : ValidationResult.Email_not_Valid ;
    }

    enum ValidationResult{
        Success,
        Phone_Number_Invalid,
        Email_not_Valid,
        Is_Not_An_Adult
    }
}
