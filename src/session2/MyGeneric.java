package session2;

public class MyGeneric<K,V> {

    K property1;
    V property2;

    public K getProperty1() {
        return property1;
    }

    public void setProperty1(K property1) {
        this.property1 = property1;
    }

    public V getProperty2() {
        return property2;
    }

    public void setProperty2(V property2) {
        this.property2 = property2;
    }
}
