package person;

public class Person {
    private String firstName;
    private String lastName;
    private String[] phoneNo;
    private String emailId;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("-------- * -------- * -------- * --------\n");
        sb.append("First Name: ").append(firstName).append('\n');
        sb.append("Last Name: ").append(lastName).append('\n');
        sb.append("Contact No: ");
        for (int i = 0; i < phoneNo.length; i++) {
            sb.append((phoneNo[0] != null && i == 0 ? phoneNo[0] : "") + (phoneNo[1] != null && i == 1 ? ", " + phoneNo[1] : "") +
                    (phoneNo[2] != null && i == 2 ? ", " + phoneNo[i] : ""));
        }
        sb.append("\nEmail: ").append((emailId != null ? emailId : "")).append('\n');
        sb.append("-------- * -------- * -------- * --------\n");
        return sb.toString();
    }

    public Person(String firstName, String lastName, String[] phoneNo, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.emailId = emailId;
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

    public String[] getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String[] phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
