public class FacultyMember extends User {
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public FacultyMember(String name, String department) {
        super(name);
        this.department = department;
    }


}
