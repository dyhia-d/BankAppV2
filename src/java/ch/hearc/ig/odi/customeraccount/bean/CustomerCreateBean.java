package ch.hearc.ig.odi.customeraccount.bean;


import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named (value="customer")
@RequestScoped
public class CustomerCreateBean implements Serializable {
    private int number;
    private String lastName;
    private String firstName;
    
    
    @Inject
    Services services;
    public CustomerCreateBean() {
    }
    
    public String newCustomer(){
        services.saveCustomer(this.number, this.firstName, this.lastName);
        return "success";
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
    
    
}
