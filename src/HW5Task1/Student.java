package HW5Task1;

public class Student {
    private String name = "Unknown";
    private int course = 0;
    private double grade = 0.0;

    public void showInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Grade: " + getGrade());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("ERROR: Name must be not less than 3 symbols");
        }
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (1 <= course && course <= 4) {
            this.course = course;
        } else {
            this.course = 0;
            System.out.println("ERROR: Course must be a number from 1 to 4 inclusive");
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (1.0 <= grade && grade <= 10.0) {
            this.grade = grade;
        } else {
            this.grade = 0.0;
            System.out.println("ERROR: Grade must be numbers in the interval from 1 to 10");
        }
    }
}