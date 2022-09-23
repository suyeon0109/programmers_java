public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        System.out.println(solution(a));

    }

    public static int solution(int[] numbers){
        int[] chk = new int[10];
        int answer = 0;

        for(int i=0; i< numbers.length; i++){
            chk[numbers[i]] = 1;
        }

        for(int j = 0; j<10; j++){
            if(chk[j] == 0){
                answer += j;
            }
        }
        return answer;
    }
}
