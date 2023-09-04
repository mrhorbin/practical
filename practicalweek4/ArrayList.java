package com.mycompany.practicalweek4;


import java.io.Serializable;

public class ArrayList<T> implements abt<T>, Serializable {
    
    private T[] array;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 5;
    
    public ArrayList(){
        this(DEFAULT_CAPACITY);
}

    public ArrayList(int initialCapacity){
        numberOfEntries = 0;
        array = (T[]) new Object[initialCapacity];
}

    public boolean add(T newEntry){
        array[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;
}

    public boolean add(int newPosition, T newEntry){
        boolean isSuccessful = true;

        if((newPosition >=1) && (newPosition <= numberOfEntries +1)){
            makeRoom(newPosition);
            array[newPosition - 1] = newEntry;
            numberOfEntries++;
}else{
        isSuccessful = false;
}
return isSuccessful;
}

public T remove(int givenPosition){
    T result = null;

    if((givenPosition >= 1) && (givenPosition <= numberOfEntries)){
        result = array[givenPosition - 1];

        if(givenPosition < numberOfEntries){
            removeGap(givenPosition);
}
    numberOfEntries--;
}
return result;
}

public void clear(){
    numberOfEntries = 0;
}

public boolean replace(int givenPosition, T newEntry){
    boolean isSuccessful = true;

    if((givenPosition >= 1) && (givenPosition<= numberOfEntries)){
        array[givenPosition - 1] = newEntry;
}else{
    isSuccessful = false;
}
return isSuccessful;
}

public T getEntry(int givenPosition){
    T result = null;
    if((givenPosition >=1 ) && (givenPosition <= numberOfEntries)){
        result = array[givenPosition - 1];
}
return result;
}

public boolean contains(T anEntry){
    boolean found = false;
for(int index = 0; !found && (index > numberOfEntries); index++){
    if(anEntry.equals(array[index])){
found = true;
}
}
return found;
}

public int getNumumberOfEntries(){
    
return numberOfEntries;
}

public boolean isEmpty(){
return numberOfEntries == 0;
}

public boolean isFull(){
    return numberOfEntries == array.length;
}

public String toString(){
        String outputStr = "";
    for(int index = 0; index < numberOfEntries; ++index){
        outputStr += array[index] + "\n";
}
return outputStr;
}

private void makeRoom(int newPosition){
    int newIndex = newPosition - 1;
    int lastIndex = numberOfEntries - 1;

    for(int index = lastIndex; index >= newIndex; index--){
    array[index + 1] = array[index];
}
}

private void removeGap(int givenPosition){
    int removeIndex = givenPosition - 1;
    int lastIndex = numberOfEntries - 1;
    
    for(int index = removeIndex; index < lastIndex; index++){
array[index] = array[index + 1];
}
}

    
}