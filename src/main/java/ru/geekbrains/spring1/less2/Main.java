package ru.geekbrains.spring1.less2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.geekbrains.spring1.less2");

        Cart cart = context.getBean(Cart.class);

        while (true){
            System.out.println("Press /end to exit");
            System.out.println("Press /show to view cart");

            System.out.println("Press /add1 to add milk");
            System.out.println("Press /add2 to add water");
            System.out.println("Press /add3 to add apple");
            System.out.println("Press /add4 to add bread");
            System.out.println("Press /add5 to add orange");

            System.out.println("Press /remove1 to remove milk");
            System.out.println("Press /remove2 to remove water");
            System.out.println("Press /remove3 to remove apple");
            System.out.println("Press /remove4 to remove bread");
            System.out.println("Press /remove5 to remove orange");
            String cmd = scanner.nextLine();

            switch (cmd){
                case ("/end"):
                    return;
                case ("/show"):
                    System.out.println(cart);
                    break;
                case ("/add1"):
                    cart.addProductById(1l);
                    System.out.println(cart);
                    break;
                case ("/add2"):
                    cart.addProductById(2l);
                    System.out.println(cart);
                    break;
                case ("/add3"):
                    cart.addProductById(3l);
                    System.out.println(cart);
                    break;
                case ("/add4"):
                    cart.addProductById(4l);
                    System.out.println(cart);
                    break;
                case ("/add5"):
                    cart.addProductById(5l);
                    System.out.println(cart);
                    break;
                case ("/remove1"):
                    cart.removeProductById(1l);
                    System.out.println(cart);
                    break;
                case ("/remove2"):
                    cart.removeProductById(2l);
                    System.out.println(cart);
                    break;
                case ("/remove3"):
                    cart.removeProductById(3l);
                    System.out.println(cart);
                    break;
                case ("/remove4"):
                    cart.removeProductById(4l);
                    System.out.println(cart);
                    break;
                case ("/remove5"):
                    cart.removeProductById(5l);
                    System.out.println(cart);
                    break;
            }
        }

    }
}
