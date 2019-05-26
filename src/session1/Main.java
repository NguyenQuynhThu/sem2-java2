package session1;

import java.util.*;

public class Main {
    public static void main(String args[]){

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(4);


        HashSet<String> strings = new HashSet<>();
        strings.add("Nguyen Van Quyen");
        strings.add("Nguyen Khanh Long");
        strings.add("Tran Thi Lan");
        strings.add("Le Tuan Dat");
        strings.add("Trinh Thi Hoa");
        strings.add("Ta Khanh Hoa");
        strings.add("Tran Thi Lan");

        for (String s: strings){
            System.out.println(s);
        }

        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>();
        stringPriorityQueue.add("c");
        stringPriorityQueue.add("b");
        stringPriorityQueue.add("a");

        for (String s : stringPriorityQueue){
            System.out.println(s);
        }

        PriorityQueue<Human> humanPriorityQueue = new PriorityQueue<>();
        humanPriorityQueue.add(new Human(4, "Nam"));
        humanPriorityQueue.add(new Human(2, "Vinh"));
        humanPriorityQueue.add(new Human(8, "Dung"));

        for (Human h : humanPriorityQueue){
            System.out.println(h.name);
        }

        HashMap<String, String> hm = new HashMap<>();
        hm.put("a1", "Le Van Nam");
        hm.put("a2", "Le Van Dung");

        System.out.println((hm.get("a1")));

        hm.forEach((keyStr,valStr) -> {
            System.out.println("Phan tu co key " +keyStr + " co gia tri " + valStr);
        });




    }
}
