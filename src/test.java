import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> scores = new HashMap<>();
        Map<String, Integer> gradeCount = new HashMap<>();

        System.out.println("학생 입력 (종료: exit)");
        while (true) {
            System.out.print("이름: ");
            String name = scanner.nextLine();
            if (name.equals("exit")) break;

            System.out.print("점수: ");
            int score = Integer.parseInt(scanner.nextLine());
            scores.put(name, score);
        }

        for (int score : scores.values()) {
            String grade;
            if (score >= 90) grade = "A";
            else if (score >= 80) grade = "B";
            else if (score >= 70) grade = "C";
            else grade = "F";

            gradeCount.put(grade, gradeCount.getOrDefault(grade, 0) + 1);
        }

        System.out.println("학점별 인원 수:");
        for (String grade : List.of("A", "B", "C", "F")) {
            System.out.println(grade + ": " + gradeCount.getOrDefault(grade, 0));
        }
    }
}
