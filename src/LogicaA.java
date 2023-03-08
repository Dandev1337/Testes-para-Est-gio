import java.util.ArrayList;

public class LogicaA {
    public static void main(String[] args) {
        ArrayList<Integer> impares = new ArrayList<>();
        for (int i = 1; i < 10; i += 2) {
            impares.add(i);
        }
        System.out.println(impares);
    }
}
