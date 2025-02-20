public class Mahasiswa11 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipkBaru < 0.0 || ipkBaru > 4.0) {
            System.out.println("Nilai IPK tidak valid");
        } else {
            this.ipk = ipkBaru;
        }
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk > 3.0) {
            return "Kinerja baik";
        } else if (ipk > 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    public static void main(String[] args) {
        Mahasiswa11 mhs1 = new Mahasiswa11();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);

        mhs1.tampilkanInformasi();
        
        Mahasiswa11 mhs2 = new Mahasiswa11("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa11 mhsKrisnahadi = new Mahasiswa11("Krisnahadi Jayawardana", "244107060001", 3.66, "SIB 1C");
        mhsKrisnahadi.tampilkanInformasi();
    }

    public Mahasiswa11() {
        
    }
    public Mahasiswa11(String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}