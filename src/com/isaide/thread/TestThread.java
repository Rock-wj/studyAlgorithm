package com.isaide.thread;

/**
 * 设计四个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1.
 */
public class TestThread {

    private int j;
    public synchronized void inc(){
        j++;
        System.out.println(Thread.currentThread().getName() + "-inc" + j);
    }
    public synchronized void dec(){
        j--;
        System.out.println(Thread.currentThread().getName() + "-dec" + j);
    }

    public static void main(String[] args) {
        TestThread t = new TestThread();
        for (int i = 0; i < 2; i++) {
            Thread inc = new Thread(new Inc(t));
            Thread dec = new Thread(new Dec(t));
            inc.start();
            dec.start();
        }
    }

    private static class Inc implements Runnable {
        private TestThread obj;
        public Inc(TestThread obj) {
            this.obj = obj;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                this.obj.inc();
            }
        }
    }

    private static class Dec implements Runnable {
        private TestThread obj;
        public Dec(TestThread obj) {
            this.obj = obj;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                this.obj.dec();
            }
        }
    }
}
