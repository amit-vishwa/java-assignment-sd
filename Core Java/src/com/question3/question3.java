// Create a thread named  fetch Data using thread extend method
//        Fetch data should  implement sleep method  with 5000ms time
//        Create a thread named  processData  using  runnable  interface
//        Make sure processData  starts its execution only after fetchData
//        thread has  completed its execution with the timeout of 10000ms

package com.question3;

class FetchData extends Thread{
    @Override
    public void run() {
        System.out.println("\nMyThread - START "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
            System.out.println("FetchData thread is running......" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread - END "+Thread.currentThread().getName());
    }
}

class ProcessData implements Runnable{
    @Override
    public void run() {
        System.out.println("\nDoing heavy processing - START " + Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
                System.out.println("ProcessData thread is running...... " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Doing heavy processing - END " + Thread.currentThread().getName());
    }
}

public class question3 {
    public static void main(String[] args)throws InterruptedException{
        FetchData fd = new FetchData();
        Thread t1 = new Thread(new ProcessData(), "Thread-1");
        fd.start();
        fd.join();
        t1.start();
        t1.join();
    }
}
