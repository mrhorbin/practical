package carParkSystem;

public class Counter implements CounterInterface{
    
    
    private int count;
    
    public Counter(){
        count = 0;
    }
    
    public void increment(){
        count++;
    }
    
    public void decrement(){
        if(count > 0){
        count--;
        }
    }
    
    public int read(){
        return count;
    }
    
    public void reset(){
        count = 0;
    }
}