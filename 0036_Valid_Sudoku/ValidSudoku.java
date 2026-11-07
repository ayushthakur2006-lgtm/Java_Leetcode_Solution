import java.util.HashSet;

class Solution_36
{
    public boolean isValidSudoku(char[][] board)
    {
        HashSet<Character> set = new HashSet<>();

        for(int row = 0; row < 9; row++)
        {
            set.clear();

            for(int col = 0; col < 9; col++)
            {
                if(board[row][col] == '.')
                    continue;

                if(set.contains(board[row][col]))
                {
                    return false;
                }

                set.add(board[row][col]);
            }
        }

        for(int col = 0; col < 9; col++)
        {
            set.clear();

            for(int row = 0; row < 9; row++)
            {
                if(board[row][col] == '.')
                    continue;

                if(set.contains(board[row][col]))
                {
                    return false;
                }

                set.add(board[row][col]);
            }
        }

        for(int row = 0; row < 9; row += 3)
        {
            for(int col = 0; col < 9; col += 3)
            {
                if(this.check(board, row, col) == false)
                {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean check(char[][] board, int row, int col)
    {
        HashSet<Character> set = new HashSet<>();

        for(int i = row; i < row + 3; i++)
        {
            for(int j = col; j < col + 3; j++)
            {
                if(board[i][j] == '.')
                    continue;

                if(set.contains(board[i][j]))
                {
                    return false;
                }

                set.add(board[i][j]);
            }
        }

        return true;
    }
}
