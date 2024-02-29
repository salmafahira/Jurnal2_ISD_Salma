import java.util.ArrayList;

public class ATK {
    private String kodeBarang;
    private String jenisBarang;
    private String namaBarang;
    private int StokBarang;
    
    public ATK(String kodeBarang, String jenisBarang, String namaBarang, int stokBarang) {
        this.kodeBarang = kodeBarang;
        this.jenisBarang = jenisBarang;
        this.namaBarang = namaBarang;
        StokBarang = stokBarang;
    }
    public String getKodeBarang() {
        return kodeBarang;
    }
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    public String getJenisBarang() {
        return jenisBarang;
    }
    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }
    public String getNamaBarang() {
        return namaBarang;
    }
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }
    public int getStokBarang() {
        return StokBarang;
    }
    public void setStokBarang(int stokBarang) {
        StokBarang = stokBarang;
    }
    @Override
    public String toString() {
        return "ATK [kodeBarang=" + kodeBarang + ", jenisBarang=" + jenisBarang + ", namaBarang=" + namaBarang
                + ", StokBarang=" + StokBarang + "]";
    }

    
}
