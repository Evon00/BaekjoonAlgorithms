class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int boardLength = board.length;

        for(int i = 0; i < boardLength; i++){
            for(int j = 0; j < boardLength; j++){
                if(board[i][j] == 1){
                    markBoard(board,i,j);
                }
            }
        }
        
        for(int i = 0; i < boardLength; i++){
            for(int j = 0; j < boardLength; j++){
                if(board[i][j] == 0)
                    answer++;
            }
        }
        
        return answer;
    }
    
    private void markBoard(int[][] board, int x, int y){
        
        int boardLength = board.length;
        
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                int tempX = x + i;
                int tempY = y + j;
                if(tempX >= 0 && tempX < boardLength && tempY >= 0 && tempY < boardLength && board[tempX][tempY] == 0){
                    board[tempX][tempY] = 2;
                            }
                        }
                    }
        
    }
}