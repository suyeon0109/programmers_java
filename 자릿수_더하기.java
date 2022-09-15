public class 자릿수_더하기 {
    public static void main(String[] args) {

        System.out.println(solution(123));

    }
    public static int solution(int n) {
        int answer = 0;
        int i = 10;
        while(n != 0){
            answer += n%i;
            n /= 10;
        }

        return answer;
    }
}
