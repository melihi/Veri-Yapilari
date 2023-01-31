public class bubleSort {
    public static void main(String[] args) {
        int dizi[] = { 5, 4, 3, 2, 1 };
        sort(dizi);
    }

    public static void sort(int dizi[]) {
        boolean degisiklik=true;
        while(degisiklik){
            degisiklik=false;
            for(int i=0;i<dizi.length-1;i++){
                if(dizi[i]>dizi[i+1]){
                    int tmp = dizi[i];
                    dizi[i]=dizi[i+1];
                    dizi[i+1]=tmp;
                    degisiklik=true;   
                }
                 //degisiklik goruntule
                for (int x = 0; x < dizi.length; x++) {
                    System.out.print("Iterasyon "+i+" > ["+dizi[x] + "] -");
                }
                System.out.println();
            }
           
        }
    }

}
