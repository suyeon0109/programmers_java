public class 문자열_내_p와_y의_개수 {

    public static void main(String[] args) {
        System.out.println(solution("PpyY"));
    }

    public static boolean solution(String s){

        boolean answer = false;

        int p_cnt = 0, y_cnt = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                p_cnt += 1;
            }
            else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                y_cnt += 1;
            }
        }

        if(p_cnt == y_cnt){
            answer = true;
        }

        return answer;
    }
}
