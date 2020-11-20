package combinatorsDesignPatterns;
import java.time.LocalDate;

public class Customer {
    private final String name;
    private final String email;
    private final String phoneNumbers;
    private final LocalDate dob;

    public Customer(String name, String email, String phoneNumbers, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.phoneNumbers = phoneNumbers;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public LocalDate getDob() {
        return dob;
    }
}
