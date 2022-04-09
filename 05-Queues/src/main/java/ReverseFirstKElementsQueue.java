import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseFirstKElementsQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i < 6; i++) {
            queue.add(i);
        }
        System.out.println(ReverseFirstK(queue, 3));
    }

    public static Deque<Integer> ReverseFirstK(Deque<Integer> queue, int k) {
        //TODO
        //remove k items from queue
        //0, 1, 2, 3, 4 stack[0,1,2]=> [3,4,2,1,0]
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }
        //pop items in stack and add them to queue again
        while (!stack.isEmpty()) {
            queue.add(stack.pop());// 1,2,3,4,5  k=3=> 5-3 size -k operations
        }
// put remaining items in order
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.remove());
        }
        return queue;
    }
}
