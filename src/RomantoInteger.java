import java.util.HashMap;
import java.util.Map;
//Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000


public class RomantoInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))) {

            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
