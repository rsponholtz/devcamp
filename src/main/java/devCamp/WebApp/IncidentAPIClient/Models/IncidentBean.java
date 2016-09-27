package devCamp.WebApp.IncidentAPIClient.Models;

import org.hibernate.validator.constraints.NotEmpty;

//import org.springframework.samples.mvc.convert.MaskFormat;

public class IncidentBean {
	private String id;
	private String Description;
	private String Street;
	private String City;
	private String State;
	private String ZipCode;
	
	@NotEmpty
	private String FirstName;
	
	@NotEmpty
	private String LastName;

//	@MaskFormat("(###) ###-####")
	private String PhoneNumber;

	private String OutageType;

	private boolean IsEmergency;
	private boolean Resolved;
	private String ImageUri;
	private String ThumbnailUri;
	private String Created;
	private String LastModified;
	private String SortKey;
    


	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("properties name=");
		return sb.toString();        
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public String getStreet() {
		return Street;
	}



	public void setStreet(String street) {
		Street = street;
	}



	public String getCity() {
		return City;
	}



	public void setCity(String city) {
		City = city;
	}



	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public String getZipCode() {
		return ZipCode;
	}



	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}



	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public String getPhoneNumber() {
		return PhoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}



	public String getOutageType() {
		return OutageType;
	}



	public void setOutageType(String outageType) {
		OutageType = outageType;
	}



	public boolean isIsEmergency() {
		return IsEmergency;
	}

	public boolean getIsEmergency() {
		return IsEmergency;
	}

	public void setIsEmergency(boolean isEmergency) {
		IsEmergency = isEmergency;
	}



	public boolean isResolved() {
		return Resolved;
	}



	public void setResolved(boolean resolved) {
		Resolved = resolved;
	}



	public String getImageUri() {
		return ImageUri;
	}



	public void setImageUri(String imageUri) {
		ImageUri = imageUri;
	}



	public String getThumbnailUri() {
		return ThumbnailUri;
	}



	public void setThumbnailUri(String thumbnailUri) {
		ThumbnailUri = thumbnailUri;
	}



	public String getCreated() {
		return Created;
	}



	public void setCreated(String created) {
		Created = created;
	}



	public String getLastModified() {
		return LastModified;
	}



	public void setLastModified(String lastModified) {
		LastModified = lastModified;
	}



	public String getSortKey() {
		return SortKey;
	}



	public void setSortKey(String sortKey) {
		SortKey = sortKey;
	}

	static public IncidentBean getDemoIncident() {
    	IncidentBean incident = new IncidentBean();
    	
    	incident.setDescription("description");
    	incident.setStreet("the Street");
    	incident.setCity("the City");
    	incident.setState("CO");
    	incident.setZipCode("00000");
    	incident.setFirstName("firstname");
    	incident.setLastName("lastname");
    	incident.setPhoneNumber("303-555-1212");
    	incident.setOutageType("outageType");
    	incident.setIsEmergency(false);
    	incident.setResolved(true);
    	return incident;
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
