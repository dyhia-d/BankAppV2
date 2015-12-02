/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Dyhia.Dib
 */
@Named(value = "customeredit")
@RequestScoped
public class CustomerEditBean {

    private int number;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accList = new ArrayList();
    
    @Inject
    Services services;

    public CustomerEditBean() {

    }

    public void setCustomer(Customer customer) {
        accList = new ArrayList();
        this.number = customer.getNumber();
        this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
        this.accList = (ArrayList<Account>) customer.getAccounts();
        int var = accList.size();
    }

    public ArrayList<Account> getAccounts() {
        return accList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Account> getAccList() {
        return accList;
    }
    
}
