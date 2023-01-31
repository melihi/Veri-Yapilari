import java.util.Stack;

class Dugum {
    int icerik;
    Dugum sol, sag;

    public Dugum(int x) {
        icerik = x;
        sag = null;
        sol = null;
    }

}

class Agac {
    Dugum kok;

    public Agac() {
        kok = null;
    }

    public void ekle(Dugum yeni) {
        if (kok == null) {
            kok = yeni;
        } else {
            Dugum once = null;
            Dugum tmp = kok;
            while (tmp != null) {
                once = tmp;
                if (tmp.icerik > yeni.icerik) {
                    tmp = tmp.sol;
                } else {
                    tmp = tmp.sag;
                }
            }
            if (once.icerik > yeni.icerik) {
                once.sol = yeni;
            } else {
                once.sag = yeni;
            }
        }
    }

    public void inOrder() {
        Dugum d = kok;
        Stack<Dugum> s = new Stack<>();
        if (d == null) {
            return;
        }
        while (d != null || !s.isEmpty()) {
            while (d != null) {
                s.push(d);
                d = d.sol;
            }
            d = s.pop();
            System.out.print(d.icerik + " - ");
            d = d.sag;
        }
        System.out.println("inOrder \n==========");
    }
    public void preOrder(){
        Dugum d = kok;
        Stack<Dugum> s = new Stack<>();
        if(d==null){
            return;
        }
        s.push(d);
        while(!s.isEmpty()){
            d= s.pop();
            System.out.print(d.icerik + " - ");
            if(d.sag!=null){
                s.push(d.sag);
            }
            if(d.sol!=null){
                s.push(d.sol);
            }
        }
        System.out.print(" preOrder \n========\n");
    }
    public void postOrder(){
        Dugum d =kok;
        Stack<Dugum> s1 = new Stack<>();
        Stack<Dugum> s2 = new Stack<>();
        if(d==null){
            return;
        }
        s1.push(d);
        while(!s1.isEmpty()){
            d =s1.pop();
            s2.push(d);
            if(d.sol!=null){
                s1.push(d.sol);
            }
            if(d.sag!=null){
                s1.push(d.sag);
            }
        }
        while(!s2.isEmpty()){
            System.out.print(s2.pop().icerik + " - ");
        }
        System.out.println("postOrder");
    }
}

public class binaryTree {
    public static void main(String[] args) {
        Agac tree = new Agac();
        tree.ekle(new Dugum(20));
        tree.ekle(new Dugum(9));
        tree.ekle(new Dugum(10));
        tree.ekle(new Dugum(25));
        tree.ekle(new Dugum(22));
        tree.ekle(new Dugum(8));
        tree.ekle(new Dugum(27));
        System.out.println("    " + tree.kok.icerik);
        System.out.print("  " + tree.kok.sol.icerik);
        System.out.print("    " + tree.kok.sag.icerik + "\n");
        System.out.print(tree.kok.sol.sol.icerik);
        System.out.print(" " + tree.kok.sol.sag.icerik);
        System.out.print(" " + tree.kok.sag.sol.icerik);
        System.out.print("  " + tree.kok.sag.sag.icerik);
        System.out.println("\n=========");
        tree.inOrder();
        tree.preOrder();
        tree.postOrder();

    }
}
