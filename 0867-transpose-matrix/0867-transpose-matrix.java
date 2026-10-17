class Solution {
    public int[][] transpose(int[][] shreya) {
        int row= shreya.length;
        int col=shreya[0].length;
        int arr[][]= new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[j][i]= shreya[i][j];
            }
        }
        return arr;
    }
}