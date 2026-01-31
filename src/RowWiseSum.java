public class RowWiseSum {
    public static void main(String[] args) {
        int[][] arr = {{10,11,12},{13,14,15},{16,17,18}};
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("row wise sum for row "+i+":"+sum);
        }
//column wise multiplication

        int i=0;
        while(i<3) {
            int multiplication = 1;
            for (int j = 0; j < arr.length; j++) {
                multiplication *= arr[j][i];
            }
            System.out.println("columnwise multiplication is "+multiplication);
            i++;
        }

    }
}
