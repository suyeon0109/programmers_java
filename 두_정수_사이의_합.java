public class 두_정수_사이의_합 {
    public static void main(String[] args) {
//        for(int j = 0; j<10; j++){
//            System.out.println(solution(0,5)[j]);
//        }

        System.out.println(solution(5,3));
    }

    public static long solution(int x, int y){

        long answer = 0;

        if(x<y){
            for(int i = x; i<=y; i++){
                answer += i;
            }
        }
        else{
            for(int i = y; i<=x; i++){
                answer += i;
            }
        }

        return answer;

    }
}
