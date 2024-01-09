package exercise1;

public class Test6 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][3];
        // a[0][0] = 10;
        int count = 0;
        for(int i=0; i<3; i++){
            for (int k=0; k<3; k++){
                numbers[i][k] = count;
                System.out.print(numbers[i][k] + " ");
                count++;
            }
            System.out.println();
        }
    }
}
