import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // N 입력
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        // 배열 입력
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A); // 정렬 (O(N log N))

        // M 입력
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // 이진 탐색 실행
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            int count = upperBound(A, num) - lowerBound(A, num);
            bw.write(count + " ");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    // lowerBound: num 이상의 첫 위치
    private static int lowerBound(int[] A, int key) {
        int left = 0, right = A.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (A[mid] >= key) right = mid;
            else left = mid + 1;
        }
        return left;
    }

    // upperBound: num 초과의 첫 위치
    private static int upperBound(int[] A, int key) {
        int left = 0, right = A.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (A[mid] > key) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
