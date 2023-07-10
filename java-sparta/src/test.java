import java.util.HashMap;
import java.util.Map;

public class test {
    String[] input = new String[]{
            "1622025201 REQUEST 10001 192.168.0.1",
            "1622025202 REQUEST 10002 192.168.0.2",
            "1622025203 REQUEST 10003 192.168.0.1",
            "1622025211 RESPONSE 10003",
            "1622025212 RESPONSE 10002",
            "1622025213 RESPONSE 10001",
            "1622025221 REQUEST 10004 192.168.0.2",
            "1622025223 REQUEST 10005 192.168.0.2",
            "1622025230 RESPONSE 10004",
            "1622025231 REQUEST 10006 192.168.0.3",
            "1622025236 RESPONSE 10006"
    };

    public static void main(String[] args) {
        test sol = new test();
        sol.printNumOfRequest(sol.input);
        sol.printTimeToRequest(sol.input);
    }

    private void printNumOfRequest(String[] input) {
        Map<String, Integer> ipMap = new HashMap<>();
        for (String log : input) {
            String[] logArr = log.split(" ");
            if (logArr.length == 4){
                if (ipMap.containsKey(logArr[3])) ipMap.put(logArr[3], ipMap.get(logArr[3]) + 1);
                else ipMap.put(logArr[3], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : ipMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " (" + value + ")");
        }
    }

    private void printTimeToRequest(String[] input) {
        String[] logArr;
        String val;
        Map<String, String> idMap = new HashMap<>();
        for (String log : input) {
            logArr = log.split(" ");
            if (logArr.length == 4){
                idMap.put(logArr[2], logArr[0]);
            }
            else{
                val = idMap.get(logArr[2]);
                idMap.put(logArr[2], val + " " + (Integer.parseInt(logArr[0]) - Integer.parseInt(val)));
            }
        }
        for (Map.Entry<String, String> entry : idMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.contains(" ")) {
                System.out.println(key + " " + value + "sec");
            }
            else{
                System.out.println(key + " " + value + " FAIL");
            }
        }
    }
}
