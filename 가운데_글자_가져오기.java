public class 가운데_글자_가져오기 {
    public static void main(String[] args) {

    }

    public static String solution(String s){
        int a = s.length();
        String ss = "";
        if (a%2 == 0){
            int b = a/2-1;
            ss = s.substring(b,b+2);
        }
        else{
            int b = a/2;
            ss = s.substring(b,b+1);
        }
        return ss;
    }
}
