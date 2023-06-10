import java.util.*;
class Demo{
    public static void main(String args[]){
        for (int i = 0; i < 10; i++){
            System.out.println("Program A : "+i);
            try{Thread.sleep(500);}catch(InterruptedException ex){}
        }
        System.out.println("---------------");
        for (int i = 0; i < 10; i++){
            System.out.println("Program B : "+i);
            try{Thread.sleep(500);}catch(InterruptedException ex){}
        }

    }
}
