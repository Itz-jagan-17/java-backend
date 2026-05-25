import java.util.*;
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>>map =new HashMap<>();
       for (String word :strs) {
        int [] count =new int [26];
            for (char c :word.toCharArray()){
                count[c-'a']++;
            
            }
            StringBuilder key =new StringBuilder();
            for(int c : count){
                key.append(c).append("#");
            }
            String keyStr=key.toString();
            if(!map.containsKey(keyStr)){
                map.put(keyStr,new ArrayList<>());
            }
            map.get(keyStr).add(word);
       }
       return new ArrayList<>(map.values());
    }
}
