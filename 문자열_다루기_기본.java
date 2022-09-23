public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        System.out.println(solution("AB123"));

    }
    public static boolean solution(String s){
        boolean chk = true;
        if(s.length() > 6 || s.length()<4 || s.length() == 5){
            chk = false;
        }
        for(int i = 0; i<s.length(); i++){
            int a = (int) s.charAt(i) - 48;
            if(a>9){
                chk = false;
            }
        }
        return chk;
    }
}
