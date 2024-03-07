public class buku{
    String judulBuku;
    String penulis;
    int tahunTerbit;

    public buku(String judulBuku, String penulis, int tahunTerbit) {
        this.judulBuku = judulBuku;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "buku [judulBuku = " + judulBuku + ", penulis = " + penulis + ", tahunTerbit = " + tahunTerbit + "]";
    }
    
}