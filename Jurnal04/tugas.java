import java.util.Scanner;
import java.util.LinkedList;

public class tugas {
    String matkul;
    String tugas;
    String deadline;

    public tugas(String matkul, String namaTugas, String deadline) {
        this.matkul = matkul;
        this.tugas = namaTugas;
        this.deadline = deadline;
    }
    
    @Override
    public String toString() {
        return "Tugas [matkul=" + matkul + ", tugas=" + tugas + ", deadline=" + deadline + "]";
    }
}