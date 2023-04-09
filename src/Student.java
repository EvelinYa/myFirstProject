public class Student {
    int ticketNumber;
    String name;
    String surname;
    int course;
    double averageMathMark;
    double averageEconomyMark;
    double averageEnglishMark;

    public Student(String name, String surname, double averageMathMark, double averageEconomyMark, double averageEnglishMark) {
        this.name = name;
        this.surname = surname;
        this.averageMathMark = averageMathMark;
        this.averageEconomyMark = averageEconomyMark;
        this.averageEnglishMark = averageEnglishMark;
    }

    public void showAverageMark() {
        System.out.format(name + " " + surname + " average mark is: %3.1f%n", (averageMathMark + averageEconomyMark + averageEnglishMark) / 3.0);
    }
}