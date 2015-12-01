package ch.hearc.ig.odi.customeraccount.bean;

import java.io.Serializable;

/**
 *
 * @author Dyhia.Dib
 */
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name="ertzui";

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
