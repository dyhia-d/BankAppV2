package ch.hearc.ig.odi.customeraccount.business;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Hello {

    private String world = "Hello World!";

    public String getworld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }
    
    
}