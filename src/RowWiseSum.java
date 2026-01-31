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

        int ie=0;
        while(ie<3) {
            int multiplication = 1;
            for (int j = 0; j < arr.length; j++) {
                multiplication *= arr[j][ie];
            }
            System.out.println("columnwise multiplication is "+multiplication);
            ie++;
        }

        //rotate 90 degrees
        for(int i=0;i< arr.length;i++){
             for(int j=0;j<arr[i].length;j++){
                 if(i==0 && (j==1 || j==2)){
                     int temp = arr[i][j];
                     arr[i][j] = arr[j][i];
                     arr[j][i] = temp;
                 }
                 if(i==1 && j==2){
                     int temp = arr[i][j];
                     arr[i][j] = arr[j][i];
                     arr[j][i] = temp;
                 }
             }
        }

        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
