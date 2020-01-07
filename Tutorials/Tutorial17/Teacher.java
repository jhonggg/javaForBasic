package Tutorial17;

public class Teacher extends Person{

    private String teacherID;
    private int monthSalary;
    private int workedYear; 

    public String getTeacherID(){
        return teacherID;
    }
    public int getMonthSalary(){
        return monthSalary;
    }
    public int getWorkedYear(){
        return workedYear;
    }

    public void setID(String teacherID) {
        this.teacherID = teacherID;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public void setWorkedYear(int workedYear){
        this.workedYear = workedYear;
    }

    public Teacher(String name, int age, int height, int weight, String teacherID, int monthSalary, int workedYear) {
        super(name, age, height, weight);
        this.teacherID = teacherID;
        this.monthSalary = monthSalary;
        this.workedYear = workedYear;
    }

    public void show(){
        System.out.println("----------------------------------");
        System.out.println("Teacher Name : " + getName());
        System.out.println("Teacher Age : " + getAge());
        System.out.println("Teacher Height : " + getHeight());
        System.out.println("Teacher Weight : " + getWeight());
        System.out.println("Teacher ID : " + getTeacherID());
        System.out.println("Teacher MonthSalary : " + getMonthSalary());
        System.out.println("Teacher WorkedYear : " + getWorkedYear());
    }
}