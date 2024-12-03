package Chap_10;

public class Pair<T,U> {
    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T GetFirst() {
        return this.first;
    }

    public U GetSecond() {
        return this.second;
    }

    public String toString() {
        String var10000 = String.valueOf(this.first);
        return "Pair{first=" + var10000 + ", second=" + String.valueOf(this.second) + "}";
    }

    public static void main(String[] args) {
        Pair<Integer, String> Pair = new Pair(1, "one");
        System.out.println(Pair.GetFirst());
        System.out.println((String)Pair.GetSecond());
        System.out.println(Pair);
    }
}
