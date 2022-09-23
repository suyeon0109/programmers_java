public class programmers_1 {

    public static void main(String[] args) {
        System.out.println(solution("100011"));
    }

    public static String solution(String src){

        String answer = "";
        char key = 1;
        int cnt = 1;

        for(int i = 0; i<src.length(); i++){
            if(i == 0){
                answer += src.charAt(0);
            }
            else if(key == src.charAt(i)){
                cnt++;
                if(i == src.length()-1){
                    cnt += 64;
                    char ch = (char)cnt;
                    answer += ch;
                }
            }
            else{
                cnt += 64;
                char ch = (char)cnt;
                answer += ch;
                cnt = 1;
            }
            key = src.charAt(i);
        }
//        int a =66;
//        char ch = (char) a;
//        String answer = Character.toString(ch);
        return answer;

    }
}
