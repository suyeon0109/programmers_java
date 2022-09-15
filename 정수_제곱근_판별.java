import java.lang.Math;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        System.out.println(solution(16));
    }

    public static long solution(long n) {
        long answer = 0;
        double i = Math.sqrt(n);
        long j = (long)i;

        if(i == j){
            answer = (j+1) * (j+1);
        }
        else{
            answer = -1;
        }
        return answer;
    }
}
