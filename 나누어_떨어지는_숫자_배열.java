import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {

    public static void main(String[] args) {
        int[] qqq = {5,2,1,10};
        int[] ppp = solution(qqq,5);

        for(int k = 0; k<ppp.length; k++){
            System.out.println(ppp[k]);
        }
    }

    public static int[] solution(int[] arr, int divisor){

        int cnt = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                cnt++;
            }
        }

        if(cnt==0){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[cnt];
        int j = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answer[j] = arr[i];
                j++;
            }
        }
        Arrays.sort(answer);

        return answer;
    }
}
