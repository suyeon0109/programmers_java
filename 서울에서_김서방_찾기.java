public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
//        for(int j = 0; j<10; j++){
//            System.out.println(solution(0,5)[j]);
//        }
        String[] test = {"Jane", "aria","Kim"};
        System.out.println(solution(test));
    }

    public static String solution(String[] seoul){
        int answer = 0;
        for(int i = 0; i< seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = i;
                break;
            }
        }

        String answer_2 = "김서방은 " + answer + "에 있다";

        return answer_2;
    }
}
