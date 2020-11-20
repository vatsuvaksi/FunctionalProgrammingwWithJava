package predicate;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //normal function
        System.out.println(isPhoneNumberValid("0090897451"));
        //with predicate
        System.out.println(validNum.test("00940897451"));
    }
    //Using predicate
    static Predicate<String> validNum= phoneNumber -> (phoneNumber.startsWith("0") && phoneNumber.length() == 11 ? true : false);

    //normal java function
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("0") && phoneNumber.length() == 11;

    }
}
