class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> zeroRowIndex = new HashSet<>();
        Set<Integer> zeroColumnIndex = new HashSet<>();

        // Step 1: Identify zero elements and record their row and column indices
        for(int rowIndex = 0 ; rowIndex < matrix.length; rowIndex++){
            for(int colIndex = 0 ; colIndex < matrix[rowIndex].length; colIndex++){
                if(matrix[rowIndex][colIndex] == 0){
                    zeroRowIndex.add(rowIndex); 
                    zeroColumnIndex.add(colIndex); 
                }
            }
        }

      // Step 2: Update the matrix by setting all elements in rows with zero indices to zero
        for(int r : zeroRowIndex){
            for(int i=0; i< matrix[0].length; i++){
                matrix[r][i] = 0;
            }
        }
     // Step 3: Update the matrix by setting all elements in columns with zero indices to zero 
        for(int c : zeroColumnIndex){
            for(int i=0; i<matrix.length; i++){
                matrix[i][c] = 0;
            }
        }
    }
}
