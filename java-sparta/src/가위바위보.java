public class 가위바위보 {
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++){
            answer += (rsp.charAt(i) == '2') ? '0' : (rsp.charAt(i) == '0')  ? '5' : '2';
        }
        return answer;
    }

    public static void main(String[] args) {
        가위바위보 sol = new 가위바위보();
        System.out.println(sol.solution("205"));
    }
}
