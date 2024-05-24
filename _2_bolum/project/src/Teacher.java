public class Teacher extends Person{
    private String branch;

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Teacher(){}
    public Teacher(String name, int age, String branch) {
        super(name, age);
        this.branch = branch;
    }

    @Override
    public String toString() {
        return super.toString() + " Branş : " + getBranch();
    }
}
