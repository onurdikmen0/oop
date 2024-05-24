public class App {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        Person person = new Person("onur", 22);
        Student student = new Student("Ahmet", 21, 100);
        Teacher teacher = new Teacher("Kemal", 24, "Matematik");
        System.out.println(teacher.toString());
    }
}
