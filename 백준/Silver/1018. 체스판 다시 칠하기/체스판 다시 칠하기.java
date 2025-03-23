import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int getMinCost(int startrow, int startcol, String[] chessboard) {
        String[] board = {"WBWBWBWB", "BWBWBWBW"};
        
        int whiteVerCount = 0;
        
        for(int i = 0; i < 8; i++){
            int row = startrow + i;
            for(int j = 0; j < 8; j++){
                int col = startcol + j;

                if(chessboard[row].charAt(col) != board[row%2].charAt(j)){
                    whiteVerCount++;
                }
            }
        }
        
        // 8x8(=다 바꾸는 경우) - 하얀 버전에서 다시 칠해야 하는 횟수 = 블랙 버전일 경우의 바꿔야 하는 횟수 (둘 중 최소 버전 반환)
        return Math.min(whiteVerCount, 64-whiteVerCount);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] chessboard = new String[N];

        for(int i = 0; i < N; i++){
            chessboard[i] = br.readLine();
        }

        br.close();

        int count = Integer.MAX_VALUE;
        
        // 8X8 크기 단위로 지정하기 위해 N-8만큼 반복
        for(int i = 0; i <= N-8; i++){
            for(int j = 0; j <= M-8; j++){
                int resultCount = getMinCost(i, j, chessboard);

                // 8X8 크기 단위로 자른 체스판들 중 가장 다시 칠해야 하는 횟수가 적은 경우로 갱신
                if (count > resultCount){
                    count = resultCount;
                }
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}