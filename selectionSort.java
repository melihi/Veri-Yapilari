public class selectionSort {
    public static void main(String[] args) {
        int dizi[] = { 5, 2, 3, 4, 6 };
        sort(dizi);
    }

    public static void sort(int dizi[]) {

        for (int i = 0; i < dizi.length - 1; i++) {
            int index = i; // aslinda j bu
            yazdir(dizi);
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[index]) {
                    index = j;
                }
            }
            int tmp = dizi[index]; // j yi tmp'e atadik
            dizi[index] = dizi[i];// j = i dedik
            dizi[i] = tmp; // i = j dedik

        }

    }

    public static void yazdir(int dizi[]) {
        for (int x = 0; x < dizi.length; x++) {
            System.out.print(dizi[x] + "-");
        }
        System.out.println();
    }
}