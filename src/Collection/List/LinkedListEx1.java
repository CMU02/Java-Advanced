package Collection.List;

import java.util.LinkedList;

/**
 * ✅ LinkedList 기본 - 앞뒤 삽입, 삭제
 */
public class LinkedListEx1 {
    public static void main(String[] args) {
        LinkedList<String> todoList = new LinkedList<>();

        // 맨뒤에 추가
        todoList.add("아침 운동");
        todoList.add("공부하기");

        // 맨 앞에 추가
        todoList.addFirst("기상");
        todoList.addLast("잠자기");

        // 출력
        System.out.println("오늘의 할 일 목록: " + todoList);

        // 맨 앞/뒤 삭제
        todoList.removeFirst();
        todoList.removeLast();

        System.out.println("수정된 목록: " + todoList);
    }
}
