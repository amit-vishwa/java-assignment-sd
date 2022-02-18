//Create a resource called message
// ○Message will have text as the field and isEmpty as the condition
// ○It has two synchronized functions read and write
// ●Create a writer thread that writes resource
// ●Create a reader thread that reads resource

package com.question4;

class Message {
    private String data;
    synchronized void writeData(String str) {//synchronized method
        this.data = str;
    }
    synchronized void readData() {//synchronized method
        System.out.println(data);
    }
}

class Writer extends Thread{
    Message t;
    Writer(Message t){
        this.t=t;
    }
    public void run(){
        t.writeData("\nHello World");
    }
}

class Reader extends Thread{
    Message t;
    Reader(Message t){
        this.t=t;
    }
    public void run(){
        t.readData();
    }
}

public class question4 {
    public static void main(String[] args){
        Message obj = new Message();
        Writer t1=new Writer(obj);
        Reader t2=new Reader(obj);
        t1.start();
        t2.start();
    }
}
