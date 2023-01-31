public class binarySearch {
    public static void main(String[] args) {
        int dizi[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sayi = 1;
        int middle = (dizi.length) / 2;
        System.out.println("Dizi.length/2 : "+middle +"\nDizi.length : "+ dizi.length + "\nDeger : " + dizi[middle]);
        while (middle > 0 && middle < dizi.length-1){
            if (dizi[middle] > sayi) {
                middle = middle / 2;
                
            } else {
                middle = (dizi.length + middle) / 2;
            }
            System.out.println("Dongu ici middle degeri : "+middle);
            
        }
        if(sayi==dizi[middle]){
            System.out.print("Bulundu ! ");
            System.out.println("Position : "+middle);
            return;
        }else{
            System.out.println("Bulunamadi");
        }
       
    }

}