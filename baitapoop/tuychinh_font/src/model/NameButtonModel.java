package model;

public class NameButtonModel {
	private String value;

	public NameButtonModel() {
		this.value = "name";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	} 
	
	public void setValue_1() {
		this.setValue("Plain");
	}
	
	public void setValue_2() {
		this.setValue("Bold");
	}
	
	public void setValue_3() {
		this.setValue("Italic");
	}
}
