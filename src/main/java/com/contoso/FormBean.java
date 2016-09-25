package com.contoso;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat.Style;
//import org.springframework.samples.mvc.convert.MaskFormat;

public class FormBean {
	
	private String description;
	private String street;
	private String city;
	private String state;
	private String zip;
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;

//	@MaskFormat("(###) ###-####")
	private String phone;

	private boolean emergency;
	

    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
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
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public boolean getEmergency() {
		return emergency;
	}
	
	public void setEmergency(boolean emergency) {
		this.emergency = emergency;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("properties name=");
		return sb.toString();        
	}
	
/*

	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("properties name=");
        if (name != null) {
        	sb.append("'").append(name).append("', ");
        } else {
        	sb.append(name).append(", ");
        }
        sb.append("age=").append(age).append(", ");
        sb.append("birthDate=").append(birthDate).append(", ");
        sb.append("phone=");
        if (phone != null) {
        	sb.append("'").append(phone).append("', ");
        } else {
        	sb.append(phone).append(", ");
        }
        sb.append("currency=").append(currency).append(", ");
        sb.append("percent=").append(percent).append(", ");
        sb.append("inquiry=").append(inquiry).append(", ");
        sb.append("inquiryDetails=");
        if (inquiryDetails != null) {
        	sb.append("'").append(inquiryDetails).append("', ");
        } else {
        	sb.append(inquiryDetails).append(", ");
        }
        sb.append("subscribeNewsletter=").append(subscribeNewsletter).append(", ");
        sb.append("additionalInfo=").append(additionalInfo);
        return sb.toString();
    }
    */
}
