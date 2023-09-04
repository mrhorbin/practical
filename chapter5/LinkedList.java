/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chapter5;

public class LinkedList<T> implements ListInterface<T> {
    
    private Node firstNode;
    private int numberOfEntries;
    
    public LinkedList(){
        clear();
    }
    
    public final void clear(){
        firstNode = null;
        numberOfEntries = 0;
    }
    
    public boolean add(T newEntry){
        Node newNode = new Node(newEntry);
        
        if(isEmpty()){
            firstNode = newNode;
        }else{
            Node currentNode = firstNode;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        numberOfEntries++;
        return true;
    }
    
    public boolean add(int newPosition, T newEntry){
        boolean isSuccessful = true;
        
        if((newPosition >= 1) && (newPosition <= numberOfEntries + 1)){
            Node newNode = new Node(newEntry);
            
            if(isEmpty() || (newPosition == 1)){
                newNode.next = firstNode;
                firstNode = newNode;
            }else{
                Node nodeBefore = firstNode;
                for(int i = 1; i < newPosition - 1 ; i++){
                    
                    nodeBefore = nodeBefore.next;
                }
                newNode.next = nodeBefore.next;
                nodeBefore.next = newNode;
            }
            numberOfEntries++;
        }else{
            isSuccessful = false;
        }
        return isSuccessful;
    }
    
    public T remove(int givenPosition){
        T result = null;
        
        if((givenPosition >= 1) && (givenPosition <= numberOfEntries)){
            if(givenPosition == 1){
                result = firstNode.data;
                firstNode = firstNode.next;
            }else{
                Node nodeBefore = firstNode;
                for(int i = 1; i < givenPosition - 1; ++i){
                    nodeBefore = nodeBefore.next;
                }
                result = nodeBefore.next.data;
                nodeBefore.next = nodeBefore.next.next;
            }
            numberOfEntries--;
        }return result;
    }
    
    public boolean replace(int givenPosition, T newEntry){
        boolean isSuccessful = true;
        if((givenPosition >= 1) && (givenPosition<= numberOfEntries)){
            Node currentNode = firstNode;
            for(int i = 0; i < givenPosition - 1; ++i){
                currentNode = currentNode.next;
            }
            currentNode.data = newEntry;
        }else{
            isSuccessful = false;
        }
        return isSuccessful;
    }
    
    
    public T getEntry(int givenPosition){
        T result = null;
        
        if((givenPosition >= 1) && (givenPosition <= numberOfEntries)){
            Node currentNode = firstNode;
            for(int i = 0; i < givenPosition - 1; ++i){
                currentNode = currentNode.next;
            }
            result = currentNode.data;
        }
        return result;
    }
    
    public boolean contains(T anEntry){
        boolean found = false;
        Node currentNode = firstNode;
        
        while(!found && (currentNode != null)){
            if(anEntry.equals(currentNode.data)){
            found = true;
                
            }else{
                currentNode = currentNode.next;
            }
        }
        return found;
    }
    
    public int getNumberOfEntries(){
        return numberOfEntries;
    }
    
    public boolean isEmpty(){
        boolean result;
        result = numberOfEntries == 0;
        return result;
    }
    
    public boolean isFull(){
        return false;
    }
    
    public String toString(){
        String outputStr = "";
        Node currentNode = firstNode;
        while(currentNode != null){
            outputStr += currentNode.data + "\n";
            currentNode = currentNode.next;
        }
        return outputStr;
    }
    
    private class Node{
        private T data;
        private Node next;
        
        private Node(T data){
            this.data = data;
            this.next = null;
        }
        
        private Node(T data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
