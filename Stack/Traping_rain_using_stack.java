import java.util.*;

public class Traping_rain_using_stack {
    public static void push_bt(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int x = s.pop();
        push_bt(s, data);

        s.push(x);
    }

    public static void print_stack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        System.out.println(top);
        print_stack(s);
        s.push(top);

    }

    public static void reverse_stack(Stack<Integer> s) {

        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse_stack(s);
        push_bt(s, top);
    }

    public static int max_water(int h[]) {
        Stack<Integer> l = new Stack<>();
        Stack<Integer> r = new Stack<>();
        int n = h.length;

        // Left max boundary
        l.push(h[0]);
        for (int i = 1; i < n; i++) {
            l.push(Math.max(h[i], l.peek()));
        }

        // right max boundary
        r.push(h[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            r.push(Math.max(h[i], r.peek()));
        }
        reverse_stack(r);

        // print_stack(l);
        // System.out.println();
        // print_stack(r);

        int trapped_water = 0;
        // water level
        for (int i = n - 1; i >= 0; i--) {

            int water_level = Math.min(l.pop(), r.pop());

            trapped_water = trapped_water + water_level - h[i];
        }
        return trapped_water;
    }

    public static void main(String[] args) {

        int h[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };

        System.out.println(" \n Trapped water = " + max_water(h));

    }

}
