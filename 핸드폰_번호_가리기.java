public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number){
        String four = phone_number.substring(phone_number.length()-4);
        String answer = "*".repeat(phone_number.length()-4) + four;

        return answer;
    }

}
