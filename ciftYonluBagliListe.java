class Liste {
    Dugum bas;
    Dugum son;

    public Liste() {
        bas = null;
        son = null;
    }

    public void basaEkle(Dugum yeni) {
        if (son == null) {
            bas = yeni;
            son = yeni;
        } else {
            yeni.ileri = bas;
            yeni.geri = null;
            bas.geri = yeni;
            bas = yeni;
        }
    }

    public void sonaEkle(Dugum yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            yeni.ileri = null;
            yeni.geri = son;
            son.ileri = yeni;
            son = yeni;
        }
    }

    public void listeBasYaz() {
        Dugum tmp = bas;
        while (tmp != null) {
            System.out.print(tmp.icerik + "->");
            tmp = tmp.ileri;
        }
        System.out.println();
    }

    public void listeSonYaz() {
        Dugum tmp = son;
        while (tmp != null) {
            System.out.print(tmp.icerik + "<-");
            tmp = tmp.geri;
        }
        System.out.println();
    }

    public void elemanI(int x) {
        int index = 1;
        Dugum tmp = bas;
        while (tmp != null) {
            if (index == x) {
                System.out.println("Eleman " + x + " == " + tmp.icerik);
                return;
            }
            index++;
            tmp = tmp.ileri;
        }

    }
}

class Dugum {
    int icerik;
    Dugum ileri;
    Dugum geri;

    public Dugum(int x) {
        icerik = x;
    }

}

public class ciftYonluBagliListe {
    public static void main(String[] args) {
        Liste list = new Liste();
        list.basaEkle(new Dugum(1));
        list.sonaEkle(new Dugum(2));
        list.sonaEkle(new Dugum(3));
        list.sonaEkle(new Dugum(4));
        list.basaEkle(new Dugum(6));
        list.listeBasYaz();
        list.listeSonYaz();
        list.elemanI(1);
    }

}
