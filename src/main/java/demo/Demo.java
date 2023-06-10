package demo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {
    class Customer {
        private int code;
        private String name;

        public Customer(int code, String name) {
            this.code = code;
            this.name = name;
        }
    }


        public static void main(String[] args) {
            LinkedList<Customer> custQue = new LinkedList<>();
            custQue.addLast(new Customer(1001,"Danapala"));
    }
}
