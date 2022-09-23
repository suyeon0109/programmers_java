import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("AukldBOdG"));

    }
    public static String solution(String s){
        String answer = "";
        int[] a = new int[26];
        int[] b = new int[26];

        for(int i = 0; i<s.length(); i++){
            int c = (int) s.charAt(i);
            if(97<=c){
                a[c - 97] += 1;
            }
            else{
                b[c - 65] += 1;
            }
        }

        for(int j = 25; j>=0; j--){
            if(a[j] != 0){
                char ch = (char) (j+97);
                for(int k = 0; k<a[j]; k++){
                    answer += ch;
                }
            }
        }
        for(int j = 25; j>=0; j--){
            if(b[j] != 0){
                char ch = (char) (j+65);
                for(int k = 0; k<b[j]; k++){
                    answer += ch;
                }
            }
        }
        return answer;
    }
}