import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// import java.util.TreeMap;

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

   }


