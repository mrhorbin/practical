/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicalweek4;

/**
 *
 * @author hp
 */
public class ArrayStack<T> implements stackInterface<T> {
    
    private T[] array;
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 50;
    
    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }    
    public ArrayStack(int initialCapacity){
        array = (T[]) new Object[initialCapacity];
        topIndex = - 1;
    }
    
    public void push(T newEntry){
        array[topIndex] = newEntry;
    }
    
    public T peek(){
        T top = null;
        
        if(!isEmpty()){
            top = array[topIndex];
        }
        return top;
    }
    
    public T pop(){
        T top = null;
        System.out.println(top);
        if(isEmpty()){
            top = array[topIndex];
            array[topIndex] = null;
            topIndex--;
        }
        return top;
    }
    
    public boolean isEmpty(){
        return topIndex < 0;
    }
    
    public void clear(){
        topIndex = - 1;
    }
    
    
    
    
}
