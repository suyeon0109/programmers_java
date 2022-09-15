public class 문자열을_정수로_바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("-12345"));
    }

    public static int solution(String s){
        String a = "";
        int answer = 0;
        if(s.charAt(0) == '-'){
            a = s.substring(1);
            answer = -Integer.parseInt(a);
        }
        else if(s.charAt(0) == '+'){
            a = s.substring(1);
            answer = Integer.parseInt(a);
        }
        else{
            answer = Integer.parseInt(s);
        }

        return answer;
    }
}
