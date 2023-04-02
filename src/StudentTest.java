public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ola", "Dziabczyk", 3.5,5.0, 4.5);
        Student student2 = new Student("Eva", "Gmina", 5.0, 4.5, 4.0);
        Student student3 = new Student("Jana", "Novak", 4.0, 4.5, 4.0);

        student1.showAverageMark();
        student2.showAverageMark();
        student3.showAverageMark();
    }
}