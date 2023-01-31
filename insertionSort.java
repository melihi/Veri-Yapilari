public class insertionSort {
    public static void main(String[] args) {
        int dizi[]={6,5,4,3,2,1,0};
        sort(dizi);
    }
    public static void sort(int dizi[]){
        for (int i=0;i<dizi.length;i++){
            for(int x=i;x>=1;x--){// >=1 dememizin sebebi her seferinde bi oncekiyle kiyaslamamiz . 0 dersen 0. indiste -1. indisle kiyaslamaya calisir .
                if (dizi[x]<dizi[x-1]){
                    int tmp =dizi[x];
                    dizi[x]=dizi[x-1];
                    dizi[x-1]=tmp;
                }
            }
            for (int x = 0; x < dizi.length; x++) {
                System.out.print(dizi[x] + "-");
            }
            System.out.println();
        }

    }
}
