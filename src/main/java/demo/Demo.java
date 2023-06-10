import java.util.*;
class Demo{
    public static void main(String args[]){
        Thread t1=new MyThreadA();
        Thread t2=new MyThreadB();

        t1.start();
        t2.start();
    }
}
class MyThreadA extends Thread{
    public void run(){
        for (int i = 0; i < 200; i++){
            System.out.println("Program A : "+i);
            //try{Thread.sleep(500);}catch(InterruptedException ex){}
        }
    }
}
class MyThreadB extends Thread{
    public void run(){
        for (int i = 0; i < 200; i++){
            System.out.println("Program B : "+i);
            //try{Thread.sleep(500);}catch(InterruptedException ex){}
        }
    }
}
