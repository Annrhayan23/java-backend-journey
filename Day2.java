// Day 2: Core Java Deep Dive + DSA Basics
import java.util.Scanner;

class Student {
    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter (Encapsulation)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Day2 {
    // Method to find oldest student
    static Student oldestStudent(Student[] students) {
        Student oldest = students[0];
        for (Student s : students) {
            if (s.getAge() > oldest.getAge()) {
                oldest = s;
            }
        }
        return oldest;
    }

    // Method to reverse a string
    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Method to check palindrome
    static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }

    // Array max/min
    static void maxMinArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Array of Students
        Student[] students = {
            new Student("Ann", 21),
            new Student("Rayan", 22),
            new Student("John", 20)
        };

        System.out.println("All students:");
        for (Student s : students) {
            s.showDetails();
        }

        Student oldest = oldestStudent(students);
        System.out.println("Oldest student: " + oldest.getName() + ", Age: " + oldest.getAge());

        // 2. String exercises
        System.out.print("Enter a string to reverse and check palindrome: ");
        String input = sc.nextLine();
        System.out.println("Reversed: " + reverseString(input));
        System.out.println("Palindrome? " + isPalindrome(input));

        // 3. Array exercises
        int[] nums = {4, 7, 2, 9, 5};
        maxMinArray(nums);

        sc.close();
    }
}
