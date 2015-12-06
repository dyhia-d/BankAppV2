package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Dyhia.Dib
 */

@Named(value = "customerDetailsBean")
@SessionScoped
public class CustomerDetailsBean implements Serializable {

    @Inject
    Services services;
    private Customer customer;

    public CustomerDetailsBean() {

    }

    public String showCustomer(Customer cust) {
        customer = cust;
        return "show";
    }
    
    /*public List<Account> getAccounts(){
        if(customer == null){
            return new ArrayList();
        }
        
        return new ArrayList(customer.getAccounts().values());
    }*/

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}
