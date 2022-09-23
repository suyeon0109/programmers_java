public class 최대공약수와_최소공배수 {
    public static void main(String[] args){
    }

    public static long[] solution(int n, int m){
        long[] answer = {0,0};
        int maxx = Math.max(n,m);

        for(int i = maxx/2; i>0; i--){
            if(n%i == 0 && m%i == 0){
                answer[0] = i;
                break;
            }
        }
        long be = maxx;
        while(be%n != 0 || be%m != 0){
            be += maxx;
        }
        answer[1] = be;

        return answer;
    }
}
