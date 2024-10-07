package Generic;

// <T extends Material> Material 클래스로 부터 상속 받은 타입만 올 수 있다
public class GenericPrinter<T extends Material>{
    private T material; // <T> 타입변수 재료의 형태가 결정

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }
    public String toString() {
        return material.toString();
    }
    public void printing() {
        material.doPrinting();
    }
}
