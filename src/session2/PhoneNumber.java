package session2;

public class PhoneNumber<K extends String,V extends String> {
    K name;
    V phone;

    public PhoneNumber(){

    }

    public PhoneNumber(K name, V phone) {
        this.name = name;
        this.phone = phone;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getPhone() {
        return phone;
    }

    public void setPhone(V phone) {
        this.phone = phone;
    }
}
