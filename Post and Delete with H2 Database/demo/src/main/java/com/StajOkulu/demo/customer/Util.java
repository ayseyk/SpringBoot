package com.StajOkulu.demo.customer;

import java.util.ArrayList;
import java.util.List;

public class Util {
    private static final List<Customer> DEFAULT_CUSTOMER_LIST = new ArrayList<>();

    static {
        DEFAULT_CUSTOMER_LIST.add(new Customer(101, "Hüseyin", "Çakmak"));
        DEFAULT_CUSTOMER_LIST.add(new Customer(102, "Esma", "Çakmak"));
        DEFAULT_CUSTOMER_LIST.add(new Customer(103, "Bahar", "Çakmak"));
    }

    public static List<Customer> getDefaultCustomerList() {

        return DEFAULT_CUSTOMER_LIST;
    }
}
