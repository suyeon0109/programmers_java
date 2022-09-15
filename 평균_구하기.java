public class 평균_구하기 {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(solution(arr));
    }

    public static double solution(int[] arr){
        double summ = 0;
        double answer = 0;
        for(int i=0; i<arr.length; i++){
            summ += arr[i];
        }
        answer = summ / arr.length;
        return answer;
    }
}
