public class 하샤드_수 {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }

    public static boolean solution(int x){
        boolean answer = false;
        int ssum = 0;
        String number = Integer.toString(x);

        for(int i = 0; i<number.length(); i++){
            int a = (int)number.charAt(i) - 48;
            ssum += a;
        }

        if(x % ssum == 0){
            answer = true;
        }

        return answer;

    }
}
