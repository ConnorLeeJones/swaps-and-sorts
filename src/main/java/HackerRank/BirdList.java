package HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirdList {
    static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer bird : arr){
            map.merge(bird, 1, Integer::sum);
        }

        int mostKey = 0;
        int mostValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > mostValue){
                mostKey = entry.getKey();
                mostValue = entry.getValue();
            } else if (entry.getValue() == mostValue){
                if (entry.getKey() < mostKey){
                    mostKey = entry.getKey();
                    mostValue = entry.getValue();
                }
            }
        }
        System.out.println(map);
        return mostKey;
    }

    public static void main(String[] args) {
        String birds = "3 1 1 2 4 1 1 2 1 4 1 2 4 2 2 2 5 1 3 1 2 2 1 1 2 4 2 2 2 2 1 1 2 5 2 1 1 1 2 1 2 1 3 1 1 2 1 5 1 4 1 1 1 3 5 2 1 1 4 2 4 2 2 2 1 1 3 2 2 1 3 5 4 2 2 4 4 5 2 2 2 3 1 2 1 2 3 2 2 1 1 2 5 2 2 1 1 1 2 1 1 1 1 2 1 2 1 2 2 5 1 4 1 2 2 2 2 1 1 2 2 2 3 2 2 2 2 2 2 2 3 1 1 5 2 1 2 1 2 4 2 2 1 2 1 2 1 2 2 1 2 1 2 4 2 5 2 4 4 2 4 1 1 2 2 2 2 4 1 5 2 2 1 1 1 2 1 1 2 2 1 4 1 2 1 4 1 4 2 1 4 2 1 1 1 4 3 2 2 2 2 2 2 1 2 2 2 2 4 1 2 2 1 2 1 4 3 4 2 4 1 2 1 3 2 2 5 2 1 1 1 2 2 1 4 1 1 2 1 5 4 2 1 2 1 1 2 1 2 2 1 5 2 4 1 2 2 1 2 2 1 2 1 2 2 3 2 1 2 1 2 1 1 4 1 2 2 4 2 2 1 1 1 1 2 4 1 2 1 3 1 2 2 1 2 5 1 1 2 2 2 1 1 1 1 1 4 2 1 2 2 1 2 1 4 1 2 2 1 2 2 2 2 2 2 4 2 1 5 1 2 3 2 4 2 1 1 2 1 1 2 1 3 1 2 2 2 2 2 4 3 1 2 1 3 2 4 2 4 4 1 2 5 3 1 4 1 2 2 1 2 2 4 1 2 3 1 1 1 3 1 5 1 2 2 1 2 2 1 1 1 1 1 4 2 3 3 2 2 1 2 1 2 1 1 4 5 2 2 2 2 2 1 2 1 1 5 2 4 1 1 1 1 2 2 2 2 3 2 2 1 5 5 2 5 2 2 2 1 1 2 1 4 2 4 2 1 1 2 2 1 4 2 4 2 1 2 1 1 1 2 4 2 2 3 1 1 2 2 1 2 2 1 1 2 2 1 1 1 2 4 1 1 1 1 1 5 2 1 5 1 2 4 2 2 1 2 1 1 4 1 2 1 1 1 1 2 1 1 1";
        String[] birdArr = birds.split(" ");
        ArrayList<Integer> birdList = new ArrayList<>();
        for (String str : birdArr){
            birdList.add(Integer.valueOf(str));
        }
        System.out.println(migratoryBirds(birdList));
    }

}
