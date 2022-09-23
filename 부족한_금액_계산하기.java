public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
//        System.out.println(solution());
    }
    public long solution(int price, int money, int count) {
        long answer = 0;
        long ssum = 0;
        for(int i = 1; i<=count; i++){
            ssum += price * i;
        }
        long chk = money - ssum;
        if(chk<0){
            answer = -chk;
        }
        return answer;
    }
}
