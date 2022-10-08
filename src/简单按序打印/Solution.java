package 简单按序打印;


import java.util.concurrent.BlockingDeque;

class Foo {

    public Foo() {

    }

    volatile int count = 1;
    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        count++;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (count != 2) ;
        printSecond.run();
        count++;
        // printSecond.run() outputs "second". Do not change or remove this line.

    }

    public void third(Runnable printThird) throws InterruptedException {
        while (count != 3) ;
            printThird.run();
        // printThird.run() outputs "third". Do not change or remove this line.

    }
}