import java.util.Arrays;

class ArrayStack<T> {

  T[] a;
  int n;

  public ArrayStack() {
    a = (T[]) new Object[] {0};
    n = 0;
  }

  int size() {
    return n;
  }

  T get(int i) {
    if (i<)
    return a[i];
  }

  T set(int i, T x) {
    T y = a[i];
    a[i] = x;
    return y;
  }

  void add(int i, T x) {
    if (n + 1 > a.length) {
      resize();
    }
    for (int j = n; j > i; j--) {
      a[j] = a[j - 1];
    }
    a[i] = x;
    n++;
  }

  T remove(int i) {
    T x = a[i];
    for (int j = i; j < n - 1; j++) {
      a[j] = a[j + 1];
    }
    if (a.length >= 3 * n) {
      resize();
    }
    return x;
  }

  protected void resize() {
    T[] b = (T[]) new Object[] {Math.max(n * 2, 1)};
    for (int i = 0; i < n; i++) {
      b[i] = a[i];
    }
    a = b;
  }

  /** Resize the internal array */
  protected void resize(int nn) {
    T[] b = (T[]) new Object[] {nn};
    for (int i = 0; i < n; i++) {
      b[i] = a[i];
    }
    a = b;
  }

  void clear() {
    n = 0;
    resize();
  }

  public String toString() {
    return "a = " + Arrays.toString(a) + " n: " + n;
  }
}
