package student;

import javax.annotation.ManagedBean;

@ManagedBean
public class StudentService {
	private String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

}
