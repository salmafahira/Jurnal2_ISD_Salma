import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QueueLL<String> queue = new QueueLL<>();

        while(true){
        //tampilan pilihan menu
        System.out.println("1. Input Tugas");
        System.out.println("2. Tampilkan Tugas yang prioritas dikerjakan");
        System.out.println("3. Hapus Tugas");
        System.out.println("4. Tampilan selutuh To Do List");
        System.out.println("5. Keluar");

        //masukkan nomor yang akan dipilih
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            
            //tampilan input tugas
            case 1:
                System.out.print("Masukkan nama tugas : ");
                String inputTugas = input.nextLine();
                queue.inputData(inputTugas);
                break;

            //tampilan tugas yang harus diprioritaskan
            case 2:
                System.out.println("Tugas yang harus di prioritaskan : ");
                queue.TampilData();
                break;
              
            //tampilan tugas yang telah dihapus
            case 3:
                System.out.println("Data telah dihapus");
                queue.DeleteData();
                break;
            
            //tampilan to do list tugas
            case 4:
                System.out.println("Berikut To Do List Tugas : ");
                queue.TampilSemuaData();
                break;

            //tampilan keluar
            case 5:
                System.out.println("Menu telah selesai");
                System.exit(0);
                break;

            default:
                System.out.println("tidak ada menu");
        }
    }
}
}
