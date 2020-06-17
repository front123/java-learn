package model;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Mike", Gender.MAN, 101);
        System.out.println(student.getName());
        System.out.println(student.getGender());
        System.out.println(student.getId());
    }

}
