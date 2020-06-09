public class TestOverLoading {
    public static void main(String[] args) {
        TestA t = new TestA();
        t.show();
        t.show(1, 2);
        t.show(1, 2, 3);
        t.show("A", "B");


    }
}

class TestA {
    void show() {
        System.out.println("0 Args constructor");
    }

    public Integer show(int a, int b) {
        System.out.println("2 Args Integer constructor");
        return 1;
    }

    public Integer show(int a, int b, int c) {
        System.out.println("3 Args Integer constructor");
        return 1;
    }

    public String show(String a, String b) {
        System.out.println("2 Args String constructor");
        return "1";
    }
}
