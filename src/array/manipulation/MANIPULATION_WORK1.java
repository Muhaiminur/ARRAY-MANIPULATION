/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.manipulation;

/**
 *
 * @author ITCLANBD
 */
public class MANIPULATION_WORK1 {

    public static void shiftLeft(Object[] a, int size, int k) {
        if (k < 0 || k > size) {
            System.out.println("throw new IllegalShiftException()");
        }
        int count = 0;
        for (int c = k; c < size; c++) {
            a[count] = a[c];
            count++;

        }
        for (int c1 = size - k; c1 < a.length; c1++) {
            a[c1] = null;
        }
    }

    // k-position left rotate (linear array)
    public void Leftrotate(Object[] c, int k) {
        Object[] count = new Object[k];
        for (int d = 0; d < k; d++) {
            count[d] = c[d];
        }
        int main = 0;
        int i1 = 0;
        for (int i = k; i < c.length; i++) {
            c[i1] = c[k];
            i1++;
            k++;
            main++;
        }
        int d2 = 0;
        for (int d1 = main; d1 < c.length; d1++) {
            c[d1] = count[d2];
            d2++;
        }
    }
    // k-position right rotate (linear array)

    public void Rightrotate(Object[] c, int k) {
        Object[] count = new Object[k];
        int m = 0;
        for (int d = c.length - k; d < c.length; d++) {
            count[m] = c[d];
            m++;
        }
        int main = 0;
        int i1 = 0;
        for (int i = c.length - 1; i > k; i--) {
            c[i] = c[i - k];
//      i1++;
//      k++;
            main++;
        }
        int d2 = 0;
        for (int d1 = d2; d1 < count.length; d1++) {
            c[d1] = count[d1];
        }
    }
    //public static int search(Object[] c, int size, Object elem)

    public static int search(Object[] c, int size, Object elem) {
        int main = 0;
        int start = 3;
        for (int c1 = 0; c1 < c.length; c1++) {
            if (c[start] == elem) {
                return (int) elem;
            }
            start = (start + 1) % c.length;
        }
        return -1;
    }
    //public static void insertUnique(Object[] a, int size, Object elem, int idx)

    public static void insertUnique(Object[] a, int size, Object elem, int idx) {
        if (size == a.length) {
            System.out.println("noSpaceLeftException");
        } else {
            boolean b = true;
            for (int c = 0; c < a.length; c++) {
                if (a[c] == elem) {
                    b = false;
                    break;
                }
            }
            if (b = true) {
                for (int d = size; d > idx; d--) {
                    a[d] = a[d - 1];
                }
                a[idx] = elem;
            }
        }
    }

    public void print(Object[] p) {
        for (int p1 = 0; p1 < p.length; p1++) {
            System.out.print(p[p1] + " , ");
        }
    }
    static int start = 4;

    public static void printReverse(Object[] c, int n) {
        int count = (start + n - 1) % c.length;
        for (int d = 0; d < c.length; d++) {
            System.out.print(c[count] + " , ");
            count--;
            if (count == -1) {
                count = c.length - 1;
            }
        }
    }
}
