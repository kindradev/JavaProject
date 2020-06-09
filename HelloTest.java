public class HelloTest {
    public static void main(String[] args) {
        HaiTest ht=new HaiTest();
        ht.m1();
        ht.m2();
        int c= ht.m3(5,4);
        System.out.println("----m3()--  :" +c);


    }
}

class HaiTest{

   void m1(){
       System.out.println("----m1()");


    }

    void m2(){
        System.out.println("----m2()");
    }

    static int m3(int a,int b){
       return a+b;

    }

}
