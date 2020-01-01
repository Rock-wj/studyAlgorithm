package com.isaide.thread;

/**
 * 设计四个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1.
 */
public class Thread4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Factory factory = new Factory();

        T1 t1 = new T1(factory);
        T2 t2 = new T2(factory);

        Thread thread1 = new Thread(t1, "加线程1");
        Thread thread2 = new Thread(t1, "加线程2");
        Thread thread3 = new Thread(t2, "减线程1");
        Thread thread4 = new Thread(t2, "减线程2");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

class T1 implements Runnable{
    Factory factory = null;
    T1(Factory factory){
        this.factory = factory;
    }

    public void run() {
        // TODO Auto-generated method stub
        while(true){
            factory.add();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class T2 implements Runnable{
    Factory factory = null;
    T2(Factory factory){
        this.factory = factory;
    }

    public void run() {
        // TODO Auto-generated method stub
        while(true){
            factory.min();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Factory{
    int j;
    Factory(){
        j = 0;
    }
    synchronized void add(){
        j++;
        System.out.println(Thread.currentThread().getName()+":"+j);
    }
    synchronized void min(){
        j--;
        System.out.println(Thread.currentThread().getName()+":"+j);
    }
}

