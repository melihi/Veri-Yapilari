class Dugum {
    int icerik;
    Dugum ileri;
    Dugum geri;

    public Dugum(int x) {
        icerik = x;
        ileri = null;
        geri = null;

    }
}

class Kuyruk {
    Dugum bas;
    Dugum son;

    public Kuyruk() {
        bas = null;
        son = null;
    }

    public void kuyrukEkle(Dugum yeni) {
        if (son == null) {
            bas = yeni;
            son = yeni;
        } else {
            son.geri = yeni;
            yeni.ileri = son;
            son = yeni;
        }
    }

    public void kuyrukCikar() {
        bas.geri.ileri = null;
        bas = bas.geri;
    }

    public void kuyruguGez() {
        Dugum tmp = bas;
        while (tmp != null) {
            System.out.print(tmp.icerik + "->");
            tmp = tmp.geri;
        }
        System.out.println();
    }
    

}

public class queue {
    public static void main(String[] args) {
        Kuyruk kuy = new Kuyruk();
        kuy.kuyrukEkle(new Dugum(10));
        kuy.kuyrukEkle(new Dugum(20));
        kuy.kuyrukEkle(new Dugum(30));
        kuy.kuyrukEkle(new Dugum(40));
        kuy.kuyruguGez();
        kuy.kuyrukCikar();
        kuy.kuyruguGez();
        kuy.kuyrukCikar();
        kuy.kuyruguGez();
        kuy.kuyrukCikar();
        kuy.kuyruguGez();


        Kuyruk kuy2 = new Kuyruk();
        kuy2.kuyrukEkle(new Dugum(11));
        kuy2.kuyrukEkle(new Dugum(24));
        kuy2.kuyrukEkle(new Dugum(35));
        kuy2.kuyrukEkle(new Dugum(46));


        
    }
}
