import java.util.ArrayList;
import java.util.List;

//Exercice 1

public class StorageGenerique<T> {
    private List<T> element;

    public StorageGenerique() {
        element = new ArrayList<>();
    }

    public void addElement(T e){
        element.add(e);
    }

    public T getElement(int index){
        return element.get(index);
    }

    public void removeElement(int index){
        element.remove(index);
    }

    public int size(){
        return element.size();
    }
}
