public class HealthProfessional {
    private String id;
    private String name;
    private String bio;
    private String title;
    private String department;
    private String specialty;
    private String scheduleInfo;

    public HealthProfessional() {
        this.id = "";
        this.name = "";
        this.bio = "";
        this.title = "";
        this.department = "";
        this.specialty = "";
        this.scheduleInfo = "";
    }

    public HealthProfessional(String id, String name, String bio, String title, String department, String specialty, String scheduleInfo) {
        this.id = id;
        this.name = name;
        this.bio = bio;
        this.title = title;
        this.department = department;
        this.specialty = specialty;
        this.scheduleInfo = scheduleInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getScheduleInfo() {
        return scheduleInfo;
    }

    public void setScheduleInfo(String scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }
}
