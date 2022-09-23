public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(1,10));

    }

    public static int solution(int left, int right){
        int answer = 0;
        for(int i = left; i<right+1; i++){
            int cnt = 0;
            for(int j = 1; j<=i/2; j++){
                if(i%j == 0){
                    cnt += 1;
                }
            }
            cnt += 1;
            if(cnt%2 == 0){
                answer += i;
            }
            else{
                answer -= i;
            }
        }
        return answer;
    }
}
