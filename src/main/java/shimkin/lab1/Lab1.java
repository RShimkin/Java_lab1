/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package shimkin.lab1;

/**
 *
 * @author User
 */
public class Lab1 {

    public static void main(String[] args) {
        
        Container cont = new Container(5);
        cont.Add(5);
        cont.Add(10);
        cont.Add(100);
        cont.Add(5);
        cont.Add(555);
        cont.Add(5);
        int[] arr = new int[]{3,7,19,734,5}; 
        cont.Add(arr);
        System.out.println(cont.Get(1));
        System.out.println(cont.Get(10));
        cont.Print();
        cont.DeleteAll(5);
        cont.Print();
        cont.Insert(3, 6666);
        cont.Print();
        
        /*
        Container cont = new Container(2);
        int[] arr = new int[] {5,2,7,3,11,100,-9,5};
        int[] arr2 = new int[] {1, 14, 5555, 0};
        cont.Add(arr);
        cont.Print();
        cont.DeleteAll(5);
        cont.Print();
        cont.Add(arr2);
        cont.Print();
        */
    }
}
