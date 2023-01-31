
class liste {
    dugum bas;
    dugum son;

    public liste() {
        bas = null;
        son = null;
    }

    public void basaEkle(dugum yeni) {
        if (son == null) {
            bas = yeni;
            son = yeni;
        } else {
            yeni.ileri = bas;
            bas = yeni;
        }
    }

    public void sonaEkle(dugum yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            son.ileri = yeni;
            son = yeni;
        }
    }

    public void sonSil() {
        dugum tmp = bas;
        while (tmp.ileri != son) {
            tmp = tmp.ileri;
        }
        tmp.ileri = null;
        son = tmp;

    }

    public void basSil() {
        bas = bas.ileri;
    }

    public void listedeAra(int x) {
        dugum tmp = bas;
        while (tmp != null) {
            if (tmp.icerik == x) {
                System.out.println(x + " Bulundu !");
                return;
            }
            tmp = tmp.ileri;
        }

        System.out.println(x + " Bulunamadi !!!");

    }

    public void elemanI(int x) {
        int index = 1;
        dugum tmp = bas;
        while (tmp != null) {

            if (index == x) {
                System.out.println("Eleman " + x + " = " + tmp.icerik);
                return;
            }
            tmp = tmp.ileri;
            index++;
        }
    }

    public void listeyiYaz() {
        dugum tmp = bas;
        while (tmp != null) {
            System.out.print("->");
            System.out.print(tmp.icerik);
            tmp = tmp.ileri;
        }
    }
}

class dugum {
    int icerik;
    dugum ileri;

    public dugum(int x) {
        icerik = x;
        ileri = null;
    }

}

public class tekYonluBagliListe {
    public static void main(String[] args) {
        liste list = new liste();
        list.basaEkle(new dugum(6));
        list.basaEkle(new dugum(7));
        list.basaEkle(new dugum(3));// bas eleman
        list.basaEkle(new dugum(4));
        list.basSil(); // 4 sildi
        list.sonaEkle(new dugum(5));
        list.sonSil(); // 5 sildi

        list.listedeAra(5);
        list.listedeAra(11);
        list.elemanI(1);
        list.listeyiYaz();
    }
}
