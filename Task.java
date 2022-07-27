package lesson_4_3.task_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task {

    public static void run() {
        System.out.println("Введите информацию о студенте: \"имя, номер группы, номер студенческого билета\":");
        Scanner scanner = new Scanner(System.in);
        Set<Student> students = new HashSet<>();
        String input = scanner.nextLine();
        String[] segments;
        segments = input.split(",\\s");
        students.add(new Student(segments[0], segments[1], segments[2]));
        while (true) {
            System.out.println("Введите информацию о студенте (для завершения работы программы введите \"end\"):");
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            segments = input.split(",\\s");
            students.add(new Student(segments[0], segments[1], segments[2]));
        }
        System.out.println("Список студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
