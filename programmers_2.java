import java.util.HashMap;

public class programmers_2 {
    public static void main(String[] args) {

        String[] answer_2 = {"desktop1 request", "desktop2 request", "desktop3 request", "desktop3 request","desktop1 release",
                "desktop3 request"};
        String[] answer_3 = solution(2, answer_2);

        for(int r=0; r<100; r++){
            System.out.println(answer_3[r]);
        }
    }
    public static String[] solution(int n, String[] queries){

        HashMap<String, Integer> computer = new HashMap<String, Integer>();

        // 최종 답 배열 선언
        int[] ip = new int[n+1];
        int cnt = 0;

        for(int i = 0; i<queries.length; i++){
            String qq = "e";
            String e = Character.toString(queries[i].charAt(queries[i].length()-1));
            if(e.equals(qq)){ // request 경우
                String[] array = queries[i].split(" ");
                computer.put(array[0],0);
                cnt++;
            }
        }
        String[] answer = new String[cnt];

        int p = 0;
        for(int j = 0; j<queries.length; j++){

            String[] array = queries[j].split(" ");
            int flag = 0;
            int q = 0;
            String request = "request";


            if(array[1].equals(request)){ // request 경우

                int allocated = computer.get(array[0]);
                if(allocated!=0 && ip[allocated] == 0){ // 해당 컴퓨터 할당된적 O
                    ip[allocated] = 1;
                    answer[p] = array[0] + " 192.168.0."+ allocated;
                    flag = 1;
                }
                else{ // 해당 컴퓨터 할당된적 X
                    for(int k = 1; k<ip.length; k++){
                        if(ip[k] == 0){
                            ip[k] = 1;
                            flag = 1;
                            q = k;
                            computer.replace(array[0], q);
                            answer[p] = array[0] + " 192.168.0."+ q;
                            break;
                        }
                    }
                }

            }
            else{ // release 경우
                ip[computer.get(array[0])] = 0;
                continue;
            }

            if(flag == 0){
                answer[p] = array[0] + " reject";
            }
            p++;
        }
        return answer;
    }

}
