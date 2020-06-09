public class TestOverriding {
    public static void main(String[] args) {
        Hello h1=new Hello();
        h1.show();

        Hai hai=new Hai();
        hai.show();

        Hello h2=new Hai();
        h2.show();

        Hai hai2=new Hai();
        hai2.display();

    }
}

class Hello{
    void show(){
        System.out.println("inside Hello");

    }
    void display(){
        System.out.println("Hello display");

    }
}

class Hai extends  Hello{

    void show() {
        System.out.println("inside Hai");
    }

    @Override
    void display() {
        System.out.println("Hai display");
    }
}
