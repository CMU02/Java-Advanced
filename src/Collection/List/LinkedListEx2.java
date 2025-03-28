package Collection.List;

import java.util.LinkedList;

/**
 * ✅ LinkedList - Queue 사용하기
 */
public class LinkedListEx2 {
    public static void main(String[] args) {
        LinkedList<String> customerQueue = new LinkedList<>();

        // 대기열 추가
        customerQueue.add("손님 1");
        customerQueue.add("손님 2");
        customerQueue.add("손님 3");

        while (!customerQueue.isEmpty()) {
            String customer = customerQueue.poll();// 맨 앞 꺼냄
            System.out.println(customer + " 상담 중....");
        }
    }
}
