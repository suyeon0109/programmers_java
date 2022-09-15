public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(12345));
    }

    public static long[] solution(long n){

        String m = Long.toString(n);
        int k = m.length();
        int i = 0;

        long[] arr = new long[k];

        while(n !=0){
            arr[i] = n%10;
            n /= 10;
            i++;
        }
        return arr;
    }
}
