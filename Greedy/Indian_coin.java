import java.util.*;

public class Indian_coin {

    public static void main(String[] args) {
        Integer coin[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int money = 593;
        int count = 0;
        Queue<Integer> q = new LinkedList<>();

        Arrays.sort(coin, Comparator.reverseOrder());

        for (int i = 0; i < coin.length; i++) {

            if (coin[i] <= money) {
                while (coin[i] <= money) {
                    q.add(coin[i]);
                    count++;
                    money = money - coin[i];
                }
            }
        }
        System.out.println(count + " " + q);

    }

}
