public class 음양_더하기 {
    public static void main(String[] args) {
////        int[] qqq = {5,2,1,10};
////        int[] ppp = solution(qqq,5);
//
//        for(int k = 0; k<ppp.length; k++){
//            System.out.println(ppp[k]);
//        }
    }

    public static int solution(int[] absolutes, boolean[] signs){
        int ssum = 0;
        for(int i = 0; i<absolutes.length; i++){
            if(signs[i] == false){
                ssum += -absolutes[i];
            }
            else{
                ssum += absolutes[i];
            }
        }

        return ssum;
    }
}
