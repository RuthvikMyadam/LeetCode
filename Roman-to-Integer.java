import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        
        Map<String, Integer> map = new HashMap<>();
    
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
    
        String str = s;
        int temp = 0;

        for (int i = 0; i < str.length(); i++) {
            String currentChar = String.valueOf(str.charAt(i));
            if(i>0){
                String prevChar = String.valueOf(str.charAt(i-1));
                    if(map.get(currentChar) > map.get(prevChar)){
                        temp = temp - map.get(prevChar)*2;
                    }
                temp = temp + map.get(currentChar);
            }
            else
                temp = temp + map.get(currentChar);
        }
        return temp;
    }
}