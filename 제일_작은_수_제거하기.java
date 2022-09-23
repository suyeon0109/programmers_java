public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        int[] arr__ = {4,3,2,1};
        System.out.println(solution(arr__));
    }

//    public static int[] solution(int[] arr){
//
//        List<Integer> intList;
//        intList = Arrays.stream(arr).boxed().collect(Collectors.toList());
//
//        int minn = arr[0];
//        int minn_n = 0;
//
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i] < minn){
//                minn = arr[i];
//                minn_n = i;
//            }
//        }
//
//        intList.remove(minn_n);
//        int[] answer = intList.stream().mapToInt(i -> i).toArray();
//
//
//        return answer;
//    }

    public static int[] solution(int[] arr){

        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        int minn = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < minn){
                minn = arr[i];
            }
        }

        int[] answer = new int[arr.length-1];

        int j = 0;

        for(int i = 0; i< arr.length; i++){
            if (arr[i] != minn){
                answer[j] = arr[i];
                j++;
            }
        }

        return answer;
    }
}
