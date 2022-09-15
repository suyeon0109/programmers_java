public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static long solution(long n){
        String m = Long.toString(n);
        int[] arr = {0,0,0,0,0,0,0,0,0,0};

        for(int i=0; i<m.length(); i++){
            int p = (int) m.charAt(i) - 48;
            arr[p] += 1;
        }

        String answer = "";

        for (int j = 9; j >= 0; j--){
            for(int k = 0; k < arr[j]; k++){
                answer += Integer.toString(j);
            }
        }

        long answer_2 = Long.parseLong(answer);
        return answer_2;
    }
}
