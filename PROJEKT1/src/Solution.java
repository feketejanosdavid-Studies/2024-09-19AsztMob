import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public void doit() {
        ArrayList<Integer> szamok = new ArrayList<>();
        szamok.add(23);
        szamok.add(45);
        szamok.add(67);
        szamok.add(89); 

        Integer osszeg = 0;
        for(int i = 0; i < szamok.size(); i++) {
            osszeg = osszeg + szamok.get(i);
        }

        System.out.printf("Összeg: %d\n", osszeg);
    }

    public void verem() {
        Stack<Integer> szamVerem = new Stack<>();
        szamVerem.push(23);
        szamVerem.push(45);
        szamVerem.push(67);
        System.out.println("Méret: "+ szamVerem.size());
        System.out.println(szamVerem.pop());
        System.out.println("Méret: "+ szamVerem.size());
    }

    public void modosito() {
        Integer szam = 35;
    }
}
