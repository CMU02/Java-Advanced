package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Comparable 사용 - 기본 정렬 기준 정의
 * 특징: 클래스 내부에 정렬 기준 내장 (기존 정렬 가능)
 */
public class Student implements Comparable<Student> {
    String name;
    int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    /**
     * 객체 자체에 정렬 기준을 정의할 수 있게 해주는 메서드이며,
     * 주로 Collections.sort(), Arrays.sort() 같은 정렬 메서드에서 사용됨
     */
    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }

    @Override
    public String toString() {
        return name + "(" + score + ")";
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("철수", 80));
        list.add(new Student("영희", 90));
        list.add(new Student("민희", 70));

        Collections.sort(list);
        System.out.println("list = " + list);
    }
}
