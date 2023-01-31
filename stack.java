class veri {
    int top = -1;
    int stack[];

    public veri(int boyut) {
        stack = new int[boyut];

    }

    public void push(int sayi) {
        stack[++top] = sayi;

    }

    public int pop() {
        return stack[top--];
    }
}

public class stack {
    public static void main(String[] args) {
        veri da = new veri(10);
        da.push(0);
        da.push(1);
        da.push(20);
        da.push(30);
        da.push(40);
        da.push(50);
        System.out.println(da.pop());

    }
}
