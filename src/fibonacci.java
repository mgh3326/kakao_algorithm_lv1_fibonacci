
class Fibonacci {
    long[] memo = new long[100];//static 해줘야되나?
    public long fibonacci(int n) {
        //long answer = 0;
        if (n <= 1) {
            return n;
        }
        else if (memo[n] != 0) {
            return memo[n];
        }
        else {
            return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        //return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Fibonacci c = new Fibonacci();
        int testCase = 3;
        System.out.println(c.fibonacci(testCase));
    }
}
