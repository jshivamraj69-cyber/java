package Collection_and_generics;
import java.util.Comparator;
import java.util.PriorityQueue;
public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Character.compare(student2.getGrade(), student1.getGrade());
            }
        });
        pq.offer(new Student("Shivam", 'a'));
        pq.offer(new Student("raj", 'A'));
        pq.offer(new Student("rohit", 'C'));
        pq.offer(new Student("ankit", 'B'));
        System.out.printf("Queue is %s%n", pq);
    }
    private static class Student {
        private final String name;
        private final char grade;
        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }
        public String getName() {
            return name;
        }
        public char getGrade() {
            return grade;
        }
        @Override
        public String toString() {
            return name + " (" + grade + ")";
        }
    }
}