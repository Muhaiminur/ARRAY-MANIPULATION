package array.manipulation;

public class MANIPULATION_FINAL {
    //Creating an array

    public Object[] CreatingArray() {
        Object[] a = new Object[10];
        return a;
    }
    //Iterating over the elements of an array

    public void IteratingArray(Object[] a) {
        for (int c = 0; c < a.length; c++) {
            System.out.print(a[c] + " , ");
        }
        System.out.println("");
    }
    //Copying an array

    public Object[] CopyArray(Object[] a) {
        Object[] copy = new Object[a.length];
        for (int c = 0; c < copy.length; c++) {
            copy[c] = a[c];
        }
        return copy;
    }
    //Resizing an array

    public Object[] ResizeArray(Object[] old, int size) {
        Object[] resize = new Object[size];
        for (int c = 0; c < old.length; c++) {
            resize[c] = old[c];
        }
        return resize;
    }
    //Reversing an array

    public Object[] ReversArray1(Object[] a) {
        System.out.println("Creating REVERSE Array by Out space way");
        Object[] temp = new Object[a.length];
        int count = a.length - 1;
        for (int c = 0; c < a.length; c++) {
            temp[count] = a[c];
            count--;
        }
        for (int c = 0; c < a.length; c++) {
            a[c] = temp[c];
        }
        return a;
    }

    public Object[] ReversArray2(Object[] a) {
        System.out.println("Creating REVERSE Array by IN space way!!! It is far more efficient!");
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            Object temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }
    //Shifing an array left

    public Object[] ShiftArrayLeft(Object[] a) {
        for (int start = 1; start < a.length; start++) {
            a[start - 1] = a[start];
        }
        a[a.length - 1] = null;//Helping Garbage collector
        return a;
    }
    //Shifing an array right

    public Object[] ShiftArrayRight(Object[] a) {
        for (int start = a.length - 1; start > 0; start--) {
            a[start] = a[start - 1];
        }
        a[0] = null;
        return a;
    }
    //Inserting an element into an array

    public Object[] InsertElement(Object[] a, int size, Object elem, int index) throws Exception {
        if (size ==a.length) {
            throw new RuntimeException("no space left");
        } else {
// make a hole by shifting elements to the right.
            for (int i = index; i < size; i++) {
                a[i + 1] = a[i];
            }
// now fill the hole/gap with the new element.
            a[index] = elem;
        }
        return a;
    }
    //Removing an element from an array

    public Object[] RemoveElement(Object[] a, int size, int index) {
        for (int c = index + 1; c < size; c++) {
            a[c - 1] = a[c];
        }
        a[size - 1] = null;
        return a;
    }
    //Rotating an array left

    public Object[] RotateArrayLeft(Object[] a) {
        Object first = a[0];
        for (int c = 1; c < a.length; c++) {
            a[c - 1] = a[c];
        }
        a[a.length - 1] = first;
        return a;
    }
    //Rotating an array right

    public Object[] RotateArrayRight(Object[] a) {
        Object last = a[a.length - 1];
        for (int c = a.length - 1; c > 0; c--) {
            a[c] = a[c - 1];
        }
        a[0] = last;
        return a;
    }
}
