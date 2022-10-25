//Creating a thread by Implementing Runnable.

class multithread implements Runnable {
    String thrdName;
    
    multithread(String name){
        thrdName = name;
    }
    //Entry point of thread
    public void run(){
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
    }
    
} //asdasd
