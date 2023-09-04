/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicalweek4;

public interface abt<T>{
    
    public boolean add(T newEntry);
    
    public boolean add(int newPosition, T newEntry);
    
    public T remove(int givenPosition);
    
    public void clear();
    
    public boolean replace(int givenPosition, T newEntry);
    
    public T getEntry(int givenPosition);
    
    public boolean contains(T anEntry);
    
    public boolean isEmpty();
    
    public boolean isFull();
    
    
}


    

