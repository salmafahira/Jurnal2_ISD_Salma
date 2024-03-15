import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        doublyLinkedList list = new doublyLinkedList();
        
        while (true) {
            System.out.println("1. Input Tugas");
            System.out.println("2. Delete Tugas");
            System.out.println("3. Lihat List Tugas");
            System.out.println("4. Keluar");

            int pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Mata kuliah : ");
                    String inputMatkul = input.nextLine();
                    System.out.print("Tugas : ");
                    String inputTugas = input.nextLine();
                    System.out.print("Deadline : ");
                    String inputDeadline = input.nextLine();
                    tugas tugasBaru = new tugas(inputMatkul, inputTugas, inputDeadline);
                    list.inputData(tugasBaru);
                    break;

                case 2:
                    System.out.println("Pilih hapus : ");
                    System.out.println("1. Hapus Depan");
                    System.out.println("2. Hapus Belakang");

                    int pilihHapus = input.nextInt();
                    if (pilihHapus == 1) {
                        list.hapusDataDepan();
                    } else if (pilihHapus == 2) {
                        list.hapusDataBelakang();
                    }
                    break;
                case 3:
                    list.tampilan();
                    break;
                
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("tidak ada menu");
            }
        }
    }
}
