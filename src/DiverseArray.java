public class DiverseArray {
    static int arraySum(int[] arr) {
        int sum = 0;
        for (int i: arr)
            sum += i;
        return sum;
    }

    static int[] rowSums(int[][] arr) {
        int[] rowSums = new int[arr.length];
        int i = 0;
        for (int[] row : arr)
        {
            rowSums[i++] = arraySum(row);
        }
        return rowSums;
    }

    static boolean isDiverse(int[][] arr)
    {
        int[] rowSum = rowSums(arr);
        for (int i = 0; i < rowSum.length; i++)
        {
            for (int j = i+1; j < rowSum.length; j++)
            {
                if (rowSum[i] == rowSum[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}