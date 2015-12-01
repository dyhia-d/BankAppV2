package ch.hearc.ig.odi.customeraccount.bean;

import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

@Named (value="customerBean")
@SessionScoped
public class CustomersBean implements Serializable {
    
    @Inject Services services;
    
    @Inject
    public List<Customer> getCustomers() {
        return services.getCustomersList();
    }
}
