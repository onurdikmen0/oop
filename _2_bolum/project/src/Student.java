public class Student extends Person{
    private int studentNumber;

    public int getStudentNumber(){
        return this.studentNumber;
    }
    public void setStudentNumber(int studentNumber){
        this.studentNumber = studentNumber;
    }

    public Student(){}
    public Student(String name, int age, int studentNumber){
        super(name, age);
        this.studentNumber = studentNumber;
    }
    @Override
    public String toString() {
        return super.toString() + " Öğrenci numarası : " + getStudentNumber();
    }
}
