package com.company;

public class Main {
    public static void main(String[] args) {
        Student student = new Student ("�������", "������", "���", 4.9);
        Student student1 = new Student("�������", "�������", "���", 5);
        Aspirant aspirant = new Aspirant ("ϸ��", "��������", "���", 5, "����� �� ��� � �����");
        Student[] students = {student, student1, aspirant};

        for (Student scholarship : students)
            System.out.println(scholarship.getScholarship());
    }
}
