package session2;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){

        sum(3,5);

        MyGeneric<String,Integer> mg1 = new MyGeneric<>();
        //show(1); --> truyền trực tiếp tham số vào sẽ lỗi ngay
        show(new Human());
        show(new Asian());
        PhoneNumber<String, String> pN1 = new PhoneNumber<>("Thu", "097965");


    }

    public static <E extends Human> void show(E e){
        e.showInfo();
    }

    public static <N extends Number> void sum(N a, N b){
        System.out.println(a.doubleValue() + b.doubleValue());
    }

    public static void show2(ArrayList<? super Integer> a){

    }



//    public static <N> void sum(N a, N b){
//
//        if (a instanceof Integer){/*(neu a la 1 so nguyen)*/
//            int x = (Integer) a;
//            int y = (Integer) b;
//            System.out.println(x + y);
//        } else if (a instanceof Double || a instanceof Float){
//            double x = (Double) a;
//            double y = (Double) b;
//            System.out.println(x + y);
//        } else {
//            System.out.println("Khong the tinh tong");
//        }
//
//    }

//    public static void sum(int a, int b){
//        System.out.println(a+b);
//    }
//
//    public static void sum(double a, double b){
//        System.out.println(a+b);
//    }
}
