import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return list;

        int left = 0, right = matrix[0].length - 1;
        int top = 0, down = matrix.length - 1;

        while (list.size() < matrix.length * matrix[0].length) {
            // Traverse from left to right
            for (int i = left; i <= right && list.size() < matrix.length * matrix[0].length; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= down && list.size() < matrix.length * matrix[0].length; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            // Traverse from right to left
            for (int i = right; i >= left && list.size() < matrix.length * matrix[0].length; i--) {
                list.add(matrix[down][i]);
            }
            down--;

            // Traverse from bottom to top
            for (int i = down; i >= top && list.size() < matrix.length * matrix[0].length; i--) {
                list.add(matrix[i][left]);
            }
            left++;
        }
        
        return list;
    }
}
