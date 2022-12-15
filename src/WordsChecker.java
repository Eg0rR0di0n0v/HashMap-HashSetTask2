import java.util.HashMap;
import java.util.Map;

public class WordsChecker {
    private final String text;
    private final Map<String, Integer> map = new HashMap<>();

    public WordsChecker(String text){
        this.text = text;
    }

    public void textToMap(){
        for (String word : text.split("\\P{IsAlphabetic}+")) {

            if (map.containsKey(word)) {
                Integer i = map.get(word) + 1;
                map.put(word, i);
            } else {
                Integer initMap = 1;
                map.put(word, initMap);
            }
        }
    }

    public void getShow(){
//        textToMap();
        System.out.println(map);
    }

    public boolean search(String txtSearch){
        //        textToMap()
        if (map.containsKey(txtSearch)){
            System.out.println("the word " + txtSearch + " occurs " + map.get(txtSearch) + " times");
            return true;
        }
        return false;
    }
}
