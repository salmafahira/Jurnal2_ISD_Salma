import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;

public class doublyLinkedList {
    LinkedList<tugas> listTugas;

    public doublyLinkedList() {
        listTugas = new LinkedList<>();
    }

    public void inputData(tugas inputBaru) {
        listTugas.add(inputBaru);
        System.out.println("Tugas telah ditambahkan");
    }

    public void hapusDataDepan() {
        listTugas.removeFirst();
        System.out.println("Tugas telah dihapus");
    }

    public void hapusDataBelakang() {
        listTugas.removeLast();
        System.out.println("Tugas telah dihapus");
    }

    public void tampilan() {
        for (tugas Tugas : listTugas) {
            System.out.println("Mata Kuliah = " + Tugas.matkul + ", Tugas = " + Tugas.tugas + ", Deadline = " + Tugas.deadline);
        }

    }

    public void tampilanTerurut(Comparator<tugas> comparator) {
        LinkedList<tugas> sortedList = new LinkedList<>(listTugas);
        Collections.sort(sortedList, comparator);
        for (tugas tugas : sortedList) {
            System.out.println(tugas);
        }
    }
}