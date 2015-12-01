package ch.hearc.ig.odi.customeraccount.business;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bank {
    
    private int number;
    private String name;
    private Map<Integer, Customer> customers = new HashMap();
    private List<Account> accounts = new ArrayList();

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
    }

    
    public Account getAccountByNumber(String number) {
        Account r = null;
        for (Account a : getAccounts()) {
            if (a.getNumber().equals(number)) {
                r = a;
            }
        }
        return r;
    }
    
    public Customer getCustomerByNumber(int number) {
        Customer r = null;
            for (Customer c : getCustomers().values()) {
                if (c.getNumber() == number) {
                    r = c;
                }
            }
        return r;
    }
    
    public Customer addCustomer(int number, String fn, String ln) {
        getCustomers().put(number, new Customer(number, fn, ln));
        return customers.get(number);
    }
    
    public void addAccount(String number, String name, double rate, Customer customer) {
        getAccounts().add(new Account(number, name, rate, customer));
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
}
