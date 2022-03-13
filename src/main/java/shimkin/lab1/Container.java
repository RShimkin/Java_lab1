/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shimkin.lab1;

/**
 *
 * @author User
 */
public class Container {
    public int arr[];
    int size;
    int capacity;
    
    public Container() {
        capacity = 16;
        Create();
    }
    
    public Container(int newcapacity) {
        capacity = newcapacity;
        Create();
    }
    
    private void Create() {
        arr = new int[capacity];
        size = 0;
    }
    
    public void Resize(int newsize) {
        int[] newarr = new int[newsize];
        for (int i = 0; i < size; i++) {
            newarr[i] = arr[i];
        }
        arr = newarr;
        capacity = newsize;
    }
    
    public void Add(int elem) {
        if (size < capacity) {
            arr[size++] = elem;
        } else {
           Resize(capacity*2);
           arr[size++] = elem;
        }
    }
    
    public Integer Get(int pos) {
        if (pos > 0 && pos < size) {
            return arr[pos];
        };
        return null;
    }
}
