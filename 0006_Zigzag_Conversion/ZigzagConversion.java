import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        @SuppressWarnings("unchecked")
        List<Character>[] twoDStructure = new ArrayList[numRows];

        for (int i = 0; i < numRows; i++) {
            twoDStructure[i] = new ArrayList<>();
        }

        int index = 0;
        int direction = 1;

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            twoDStructure[index].add(temp);

            if (index == 0) {
                direction = 1;
            } else if (index == numRows - 1) {
                direction = -1;
            }

            index += direction;
        }

        StringBuilder sb = new StringBuilder();

        for (List<Character> row : twoDStructure) {
            for (Character ch : row) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}

