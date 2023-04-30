package ModelViewController;

public class StudentController {
    private StudentModel model;
    private StudentView view;
    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public void setStudentRoll(String roll){
        model.setRollNo(roll);
    }
    public void setStudentCourse(String course){
        model.setCourse(course);
    }
    public String getStudentName(){
        return model.getName();
    }
    public String getStudentRoll(){
        return model.getRollNo();
    }
    public String getStudentCourse(){
        return model.getRollNo();
    }
    public void updateView(){
        view.printStudentDetails(model.getName(), model.getRollNo(), model.getCourse());
    }
}
