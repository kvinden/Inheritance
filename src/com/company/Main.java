package com.company;

public class Main {
    public static void main(String[] args) {
        Student student = new Student ("Василий", "Петров", "ИСУ", 4.9);
        Student student1 = new Student("Алексей", "Сидоров", "ИСУ", 5);
        Aspirant aspirant = new Aspirant ("Пётр", "Васечкин", "ИТУ", 5, "Полёты во сне и наяву");
        Student[] students = {student, student1, aspirant};

        for (Student scholarship : students)
            System.out.println(scholarship.getScholarship());
    }
}
