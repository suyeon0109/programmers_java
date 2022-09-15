public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        for(int j = 0; j<10; j++){
            System.out.println(solution(0,5)[j]);
        }

//        System.out.println(solution(2,5));
    }

    public static long[] solution(long x, int n){
        long[] answer = new long[n];

        for(int i = 0; i<n; i++){
            answer[i] = x + x*i;
        }

        return answer;
    }
}
