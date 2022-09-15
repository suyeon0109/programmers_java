public class 콜라츠_추측 {
    public static void main(String[] args) {
//        for(int j = 0; j<10; j++){
//            System.out.println(solution(0,5)[j]);
//        }

        System.out.println(solution(626331));
    }

    public static int solution(long x){

        int cnt = 0;

        while(x != 1){
            if(x%2 == 0){
                x /= 2;
            }
            else{
                x = 3*x + 1;
            }
            cnt += 1;

            if(cnt == 500){
                cnt = -1;
                break;
            }

        }
        return cnt;
    }
}
