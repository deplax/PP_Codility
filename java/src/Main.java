public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.solution(1041));
        System.out.println(solution.solution(5));

    }
}


class Solution {
    public int solution(int N) {
        String entire = "";
        int length = 0;
        int tempLength = 0;

        while (N > 1) {
            int other = N % 2;
            N = N / 2;
            entire = String.valueOf(other) + entire;

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
                length = tempLength;
            }
        }

        length--;

        if (length < 0){
            length = 0;
        }

        entire = String.valueOf(N) + entire;
        System.out.println(entire);
        return length;
    }
}