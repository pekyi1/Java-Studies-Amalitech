public class RegularStudent extends Student {
    private final double passingGrade = 50.0;

    public RegularStudent(String name, int age, String email, String phone){
        super(name, age,email,phone);
    }

    @Override
    public displayStudentDetails(double currentAverage){
        System.out.println("-----The Students details are below-----\n");
        System.out.println("Student ID" + getStudentId());
        System.out.println("Name: " + getName());
        System.out.println("Sudent type: " + getStudentType());
        System.out.println("Average grade: " + currentAverage);
        System.out.println("Passing student: " + (isPassing(currentAverage) ? "Yes" : "No"));
        System.out.println("Student Status: " + getStatus());
    }

    @Override
    public getStudentType(){
        return "Regular";
    }

    @Override
    public getPassingGrade(){
        return passingGrade;
    }



}
