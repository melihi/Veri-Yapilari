class Dugum {
    int icerik;
    Dugum ileri;
    public Dugum(int x){
        icerik=x;
        ileri=null;
    }
}

class Liste {
    Dugum son;

    public Liste() {
        son = null;
    }

    public void dugumEklew(Dugum yeni) {
        if (son == null) {
            yeni.ileri = yeni;
            son = yeni;
        } else {
            yeni.ileri = son.ileri;
            son.ileri = yeni;
            son = yeni;

        }
    }

    public void listele() {
        Dugum tmp = son.ileri.ileri;
        System.out.println(son.ileri.icerik);
        while (tmp != son.ileri) {
            System.out.println(tmp.icerik);
            tmp = tmp.ileri;
        }
    }
}

public class tekYonluDaireselBagliListe {
    public static void main(String[] args) {
        Dugum a = new Dugum(0);
        Liste list = new Liste();
        list.dugumEklew(a);
    
        list.listele();
        System.out.println("sdasd");
         
    }
}
