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
    int capacity = 16;
    
    public Container() {
        arr = new int[capacity];
        size = 0;
    }
    
    public Container(int newcapacity) {
        capacity = newcapacity;
        arr = new int[capacity];
        size = 0;
    }
}
