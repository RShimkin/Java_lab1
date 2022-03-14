
package shimkin.lab1;

/**
 *
 * @author Roman Shimkin
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
        System.out.println(cont.Get(11));
        cont.Print();
        cont.DeleteAll(5);
        cont.Print();
        cont.Insert(3, 6666);
        cont.Print();
        System.out.println(cont.size);
    }
}
