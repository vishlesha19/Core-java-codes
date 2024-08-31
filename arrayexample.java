public class arrayexample {
    public static void main(String[] args) {

        int obj[][] = new int[3][4];
        obj[0][0] = 1;
        obj[0][1] = 1;
        obj[0][2] = 1;
        obj[0][3] = 1;
        obj[1][0] = 1;
        obj[2][0] = 1;

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.println(obj[i][j]);
        // }
        // }

        // enhanced for loop
        for (int[] n : obj) {
            for (int m : n) {
                System.out.println(m + " ");
            }
            System.out.println();
        }

    }

}
