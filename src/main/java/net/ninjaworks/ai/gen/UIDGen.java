package net.ninjaworks.ai.gen;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UIDGen {

    private static Map<Integer, Character> alphabetMap = new HashMap<Integer, Character>();

    public static String generate(int id) {
        populateAMap();
        Random rnd = new Random();
        String builder = "";
        for (int i = 0; i < 27; i++) {
            if(rnd.nextDouble(0, 1) <= 0.5) {
                char part;
                if(id + 1 >= alphabetMap.size()) {
                    part = alphabetMap.get(rnd.nextInt(1, 26));
                } else {
                    part = alphabetMap.get(id + i);
                }
                builder = builder + part;
            } else {
                builder = builder + (id + i);
            }
        }
        return builder;
    }

    public static String generate(String id) {
        int id1 = Integer.parseInt(id);
        populateAMap();
        Random rnd = new Random();
        String builder = "";
        for (int i = 0; i < 27; i++) {
            if(rnd.nextDouble(0, 1) <= 0.5) {
                char part;
                if(id1 + 1 >= alphabetMap.size()) {
                    part = alphabetMap.get(rnd.nextInt(1, 26));
                } else {
                    part = alphabetMap.get(id1 + i);
                }
                builder = builder + part;
            } else {
                builder = builder + (id1 + i);
            }
        }
        return builder;
    }

    public static void populateAMap() {
        alphabetMap.put(1, 'a'); alphabetMap.put(2, 'b'); alphabetMap.put(3, 'c'); alphabetMap.put(4, 'd');
        alphabetMap.put(5, 'e'); alphabetMap.put(6, 'f'); alphabetMap.put(7, 'g'); alphabetMap.put(8, 'h');
        alphabetMap.put(9, 'i'); alphabetMap.put(10, 'j'); alphabetMap.put(11, 'k'); alphabetMap.put(12, 'l');
        alphabetMap.put(13, 'm'); alphabetMap.put(14, 'n'); alphabetMap.put(15, 'o'); alphabetMap.put(16, 'p');
        alphabetMap.put(17, 'q'); alphabetMap.put(18, 'r'); alphabetMap.put(19, 's'); alphabetMap.put(20, 't');
        alphabetMap.put(21, 'u'); alphabetMap.put(22, 'v'); alphabetMap.put(23, 'w'); alphabetMap.put(24, 'x');
        alphabetMap.put(25, 'y'); alphabetMap.put(26, 'z');
    }
}
