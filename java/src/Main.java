public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution(9));

    }
}


class Solution {
    public int solution(int N) {

        Boolean start = false;
        Boolean beforeOne = false;

        int length = 0;
        int other = 0;

        String entire = "";

        int tempLength = 0;

        while (N > 1) {
            other = N % 2;
            N = N / 2;
            entire = String.valueOf(other) + entire;

            // 1이면 카운트 한다
            // 0이면 카운트 한다.
            // 1이면 카운트를 종료한다.

            if (other == 1 && tempLength == 0){
                tempLength++;
            }else if (other == 0 && tempLength > 0){
                tempLength++;
            }else if (other == 1 && tempLength > 1){
                if (tempLength > length){
                    length = tempLength++;
                }
                tempLength = 1;
            }
        }

        if (tempLength > 1){
            if (tempLength > length){
                length = tempLength++;
            }
        }

        if (length < 2){
            length = 0;
        }

        entire = String.valueOf(N) + entire;
        System.out.println(entire);
        return length;
    }
}