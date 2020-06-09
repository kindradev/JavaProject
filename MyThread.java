class MyThread extends Thread {
    @Override
    public void run() {
        Thread th=Thread.currentThread();
        for (int i=0;i<5;i++){
            System.out.println(th.getName()+"-value is :"+i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class MyThreadRunnable implements Runnable{

    public void run() {
        Thread th1=Thread.currentThread();
        for (int i=0;i<5;i++){
            System.out.println(th1.getName()+"-value is :"+i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class SampleThread{
    public static void main(String[] args) {
        MyThread myThread1=new MyThread();
        myThread1.start();
        MyThreadRunnable myThreadRunnable=new MyThreadRunnable();
       Thread t1 =new Thread(myThreadRunnable);
       t1.start();


        Thread t=Thread.currentThread();
        for (int i=0;i<5;i++){
            System.out.println(t.getName()+"-value is :"+i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
