package Collection.Comparator;

import Collection.Comparable.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Comparator - 이름순 정렬
 * 특징: 외부에서 비교 기준 주입 가능 -> 유연성 높음
 */
public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("영희", 90));
        list.add(new Student("철수", 80));
        list.add(new Student("민희", 70));

//        list.sort(new NameComparator());
        list.sort((a, b) -> b.getScore() - a.getScore()); // 점수 내림차순 (람다 사용)
        System.out.println("list = " + list);
    }
}
