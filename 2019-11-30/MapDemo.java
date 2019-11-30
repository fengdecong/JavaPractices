import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.put("姓名", "丰德聪");
        map.put("性别", "男");
        map.put("籍贯", "旬阳");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        System.out.println("-----------------");
        map.put("籍贯", "咸阳");
        map.put("爱好", "🏀");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        System.out.println("-----------------");
        System.out.println(map.getOrDefault("姓名", ""));
        System.out.println("-----------------");
        map.remove("爱好");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        System.out.println("-----------------");
        System.out.println(map.remove("姓名","丰德聪"));
        System.out.println(map.remove("姓名","刘佳鑫"));
    }
}