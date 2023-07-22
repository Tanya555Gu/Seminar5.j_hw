import java.util.ArrayList;
// import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNums {
    private Map<String, List<String>> map = new HashMap<>();

    public void add(String name, String phoneNum) {
        if (map.containsKey(name)) {
            List<String> list = map.get(name);
            list.add(phoneNum);
        } else {
            List<String> list = new ArrayList<>();
            list.add(phoneNum);
            map.put(name, list);
        }
    }

    public String getAll() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            
            stringBuilder.append(entry.getKey());
            stringBuilder.append(" : ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    // public void getAll() {
    //     Map<Integer, List<String>> sortedPhones = new HashMap<>();
    //     for (String name : map.keySet()) {
    //         int numOfPhones = map.get(name).size();
    //         if (sortedPhones.containsKey(numOfPhones)) {
    //             sortedPhones.get(numOfPhones).add(name);
    //         } else {
    //             List<String> names = new ArrayList<>();
    //             names.add(name);
    //             sortedPhones.put(numOfPhones, names);
    //         }
    //     }
    //     List<Integer> sortedKeys = new ArrayList<>(sortedPhones.keySet());
    //     Collections.sort(sortedKeys, Collections.reverseOrder());
    //     for (int key : sortedKeys) {
    //         String key1 = sortedPhones.get(key).toString();
    //         key1 = key1.replace("[", "");
    //         key1 = key1.replace("]", "");
    //         System.out.println(sortedPhones.get(key).toString() + " : " + map.get(key1).toString());
    //     }
    // }
}


