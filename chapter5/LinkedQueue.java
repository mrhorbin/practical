package com.mycompany.chapter5;

import java.util.Iterator;
public class LinkedQueue<T> implements QueueInterface<T> {
     private Node firstNode;
     private Node lastNode;
     
     public LinkedQueue(){
         firstNode = null;
         lastNode = null;
     }
     
     public void enqueue(T newEntry){
         Node newNode = new Node(newEntry, null);
         
        if(isEmpty()){
            firstNode = newNode;
        }else{
            lastNode = newNode;
        }
        lastNode = newNode;
     }
     
     public T getFront(){
         T front = null;
         if(!isEmpty()){
             front = firstNode.data;
         }
         return front;
     }
     
     public T dequeue(){
         T front = null;
         
         if(!isEmpty()){
             front = firstNode.data;
             firstNode = firstNode.next;
             
             if(firstNode == null){
                 lastNode = null;
             }
         }
         return front;
     }
     
     
     public boolean isEmpty(){
         return((firstNode == null) && (lastNode == null));
     }
     
     public void clear(){
         firstNode = null;
         lastNode = null;
     }
     
     public Iterator<T> getIterator(){
         return new LinkedQueueIterator();
     }
     
     private class LinkedQueueIterator implements Iterator<T>{
         private Node currentNode;
         
         public LinkedQueueIterator(){
             currentNode = firstNode;
         }
         
         public boolean hasNext(){
             return currentNode != null;
         }
         
         public T next(){
             if(hasNext()){
                 T returnData = currentNode.data;
                 currentNode = currentNode.next;
                 return returnData;
             }else{
                 return null;
             }
         }
     }
     
     private class Node{
         private T data;
         private Node next;
         
         private Node(T data){
             this.data = data;
             this.next = next;
         }
         
         private Node(T data, Node next){
             this.data = data;
             this.next = next;
         }
     }
}
