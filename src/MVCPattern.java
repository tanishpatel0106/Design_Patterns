import ModelViewController.*;
public class MVCPattern {
    public static void main(String [] args){
        StudentModel model = retrieveFromDB();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Tanish Patel");
        controller.updateView();
    }
    private static StudentModel retrieveFromDB(){
        StudentModel student = new StudentModel();
        student.setName("Tanish");
        student.setRollNo("21BCP050");
        student.setCourse("BTech - Computer Engineering");
        return student;
    }
}
