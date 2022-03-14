
package shimkin.lab1;

/**
 *
 * @author Roman Shimkin
 */
public class Container {
    public int arr[];
    public int size;
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
    
    public void Add(int[] ar) {
        int len = ar.length;
        while (size + len > capacity) {
            Resize(capacity*2);
        }
        for (int i = 0; i < ar.length; i++) {
            arr[size+i] = ar[i];
        }
        size += ar.length;
    }
    
    public void Insert(int pos, int elem) {
        if (size >= capacity) {
            Resize(capacity*2);
        }
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = elem;
        size++;
    }
    
    public Integer Get(int pos) {
        if (pos > 0 && pos < size) {
            return arr[pos];
        };
        return null;
    }
    
    public boolean Delete(int elem) {
        int pos = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == elem) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            return false;
        } 
        for (int i = pos; i < size; i++) {
            arr[i] = arr[i+1];
            size--;
        }
        return true;
    }
    
    public boolean DeleteAll(int elem) {
        int pos = -1;
        for (int i = 0; i < size;) {
            if (arr[i] == elem) {
                pos = i;
                for (int k = i; k < size - 1; k++) {
                    arr[k] = arr[k+1];
                }
                size--;
            } else {
                i++;
            }
        }
        return pos == -1 ? false : true;
    }
    
    public String ToString(char delim) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(((Integer)arr[i]).toString());
            sb.append(delim);
        }
        return sb.toString();
    }
    
    public void Print() {
        System.out.println(ToString(' '));
    }
}
