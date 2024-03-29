//Creating a thread by Implementing Runnable.

class multithread implements Runnable {  //Objects of this class can be runn
    String thrdName;                    //in their own threads coz this class
                                        //implements "Runnable"
    
    multithread(String name){
        thrdName = name;
    }
    //Entry point of thread
    
    public void run(){     //threating start executing here
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thrdName +
                ", count is " + count);
            }
        
        } catch (InterruptedException exc) {
            System.out.println(thrdName + " interrupted");
        }
        System.out.println(thrdName + "terminating.");
    }
    
} 

class UseThreads {
    public static void main (String args[]){
        System.out.println("Main thread starting");
    
//First, construct a multithread object
    multithread mt = new multithread("Child1");

//next construct a thread from that object
    Thread newThread = new Thread(mt);
 
//Run the execution of the thread
    newThread.start();

    for (int i=0; i<50; i++){
        System.out.println(".");
        try {
            Thread.sleep(100);
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrupted");
        }
    }
    System.out.println("Main thread ending.");
} 
}