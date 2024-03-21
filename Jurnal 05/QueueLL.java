import java.util.*;

public class QueueLL<E> {
    private Queue<E> toDoList;

    public QueueLL(){
        toDoList = new LinkedList<E>();
    }

    //untuk menambah nama tugas
    public void inputData(E inputBaru){
        toDoList.add(inputBaru);
        System.out.println("Tugas telah dimasukkan");
    }

    // untuk tampilan tugas prioritas
    public void TampilData() {
        System.out.println(toDoList.peek());

    }

    // untuk menghapus data
    public E DeleteData() throws NoSuchElementException {
        return toDoList.remove();
    }

    // untuk menampilkan semua data to do list
    public void TampilSemuaData() {
        Iterator<E> iterator = toDoList.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println(" - " + value + " ");
        }
    }
}
