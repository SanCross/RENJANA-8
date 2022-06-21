package dashboard;

public class Pengguna {

    String nama, email, password, namaWisata, jenisWisata, provinsi, kabupaten, alamat, noTelfon, jenisAkun;

    public Pengguna() {}
    
    public Pengguna(String nama, String email, String password) {
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    public Pengguna(String namaWisata, String jenisWisata, String provinsi, String kabupaten, String alamat, String noTelfon, String jenisAkun) {
        this.namaWisata = namaWisata;
        this.jenisWisata = jenisWisata;
        this.provinsi = provinsi;
        this.kabupaten = kabupaten;
        this.alamat = alamat;
        this.noTelfon = noTelfon;
        this.jenisAkun = jenisAkun;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamaWisata() {
        return namaWisata;
    }

    public void setNamaWisata(String namaWisata) {
        this.namaWisata = namaWisata;
    }

    public String getJenisWisata() {
        return jenisWisata;
    }

    public void setJenisWisata(String jenisWisata) {
        this.jenisWisata = jenisWisata;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(String kabupaten) {
        this.kabupaten = kabupaten;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelfon() {
        return noTelfon;
    }

    public void setNoTelfon(String noTelfon) {
        this.noTelfon = noTelfon;
    }

    public String getJenisAkun() {
        return jenisAkun;
    }

    public void setJenisAkun(String jenisAkun) {
        this.jenisAkun = jenisAkun;
    }

}
