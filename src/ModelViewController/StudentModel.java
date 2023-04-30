package ModelViewController;

public class StudentModel {
    private String RollNo;
    private String name;
    private String course;
    public String getRollNo(){
        return RollNo;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(String RollNo) {
        this.RollNo = RollNo;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}
