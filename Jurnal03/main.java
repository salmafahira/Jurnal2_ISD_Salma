import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SinglyLinkedList<buku> daftar = new SinglyLinkedList<>();
        while (true) {
            System.out.println("\nPilih menu :\n1. Tambah Buku\n2. Hapus Buku\n3. Cetak Daftar Buku\n4. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                System.out.print("Masukkan Judul Buku: ");
                String judulBuku = input.next();
                input.nextLine(); 
                System.out.print("Masukkan Penulis: ");
                String penulis = input.nextLine();
                System.out.print("Masukkan Tahun Terbit: ");
                int tahunTerbit = input.nextInt();
                
                    daftar.addNode(new buku(judulBuku, penulis, tahunTerbit));
                    break;
                case 2:
                    daftar.deleteNode();
                    break;
                case 3:
                    daftar.printList();
                    break;
                case 4:
                    input.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
