class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] sqrs = new int[9];

        for(int row = 0;row<9;row++)
        {
            for(int col=0;col<9;col++)
            {
                if(board[row][col]=='.') continue;
                int sq = (row/3)*3+(col/3);
                int bitVal = board[row][col] - '1';
                if(((rows[row]&(1<<bitVal))>0) || ((cols[col]&(1<<bitVal))>0) || ((sqrs[sq]&(1<<bitVal))>0)  )
                {
                    return false;
                }
                rows[row] = rows[row] | (1<<bitVal);
                cols[col] = cols[col] | (1<<bitVal);
                sqrs[sq] = sqrs[sq] | (1<<bitVal);
            }
        }
        return true;
    }
}
