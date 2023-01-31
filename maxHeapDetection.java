public class maxHeapDetection {
    public static void main(String[] args) {
        int heapArray[] = { 16, 14, 10, 8, 7, 9, 3, 20, 4, 1 };
        int heapArray2[] = { 16, 14, 10, 8, 7, 9, 3, 2, 4, 1 };
        int heapArray3[] = { 16, 14, 10, 8, 7, 9, 3, 2, 4, 1,0,-1,3,4,5,6,7 };
        int heapArray4[] = {20,18,13,15,11,12,16,10,9,11,13,2,9,10,1  };

        maxHeapDetection a = new maxHeapDetection();
        a.isMaxHeap(heapArray);
        a.isMaxHeap(heapArray2);
        a.isMaxHeap(heapArray3);
        a.isMaxHeap(heapArray4);
        /*
         * // 2n+1 2n
         * //0 dan baslandigi icin 2n 2n-1
         * int tmpArray[]=new int[heapArray.length+1];
         * for(int i =0;i<tmpArray.length-1;i++){
         * tmpArray[i+1]=heapArray[i];
         * }
         * for(int i =0;i<tmpArray.length;i++){
         * System.out.println(tmpArray[i]);
         * }
         * for(int i=1;i<tmpArray.length;i++){
         * 
         * if(tmpArray[i]>tmpArray[2*i]){
         * System.out.println(tmpArray[i] + " greater than "+tmpArray[2*i]);
         * }else{
         * System.out.println(tmpArray[i] + " smaller than "+tmpArray[2*i]);
         * System.out.println("Not MaxHeap");
         * return;
         * }
         * if(tmpArray[i] > tmpArray[2*i+1]){
         * System.out.println(tmpArray[i] + " greater than "+tmpArray[2*i+1]);
         * }else{
         * System.out.println(tmpArray[i] + " smaller than "+tmpArray[2*i+1]);
         * System.out.println("Not MaxHeap");
         * return;
         * }
         * 
         * }
         */
    }

    public void isMaxHeap(int dizi[]) {
        System.out.println("-------------------------------");
        // 2n+1 2n
        // 0 dan baslandigi icin 2n 2n-1
        int tmpArray[] = new int[dizi.length + 1];
        for (int i = 0; i < tmpArray.length - 1; i++) {
            tmpArray[i + 1] = dizi[i];
        }
        try {
            for (int i = 1; i < tmpArray.length; i++) {
                if (tmpArray[i] >= tmpArray[2 * i]) {

                    System.out.println(tmpArray[i] + " greater than " + tmpArray[2 * i]);
                } else {
                    System.out.println(tmpArray[i] + " smaller than " + tmpArray[2 * i]);
                    System.out.println("Not MaxHeap");
                    return;
                }

                if (tmpArray[i] >= tmpArray[2 * i + 1]) {
                    System.out.println(tmpArray[i] + " greater than " + tmpArray[2 * i + 1]);
                } else {
                    System.out.println(tmpArray[i] + " smaller than " + tmpArray[2 * i + 1]);
                    System.out.println("Not MaxHeap");
                    return;
                }
            }
        } catch (Exception ex) {
            return;
        }

    }

}
