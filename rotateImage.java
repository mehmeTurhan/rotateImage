int[][] solution(int[][] a) {
    int[][] rotate=new int[a.length][a[0].length];
    for(int row=0;row<a.length;row++){
        for(int col=0;col<a[0].length;col++){
            rotate[row][col]=a[(a.length-1)-col][row];
        }
    }
    return rotate;

}
