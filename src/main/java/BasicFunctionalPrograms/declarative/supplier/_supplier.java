package BasicFunctionalPrograms.declarative.supplier;

import java.util.function.Supplier;

public class _supplier {
    //normal function
    public static void main(String[] args) {
        System.out.println(getConnectionUrl());
        //calling suppliers
        System.out.println(getDatabase.get());
    }

    static Supplier<String> getDatabase = () -> "jdbc://localhost:3600/users" ;
    //You can return anything here whether it's a string or a list or anything

    static String getConnectionUrl(){
        return "jdbc://localhost:3600/users";
    }
}
