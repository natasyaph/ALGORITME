package GUI;

public class Mahasiswa {

    private String nama;
    private String nim;

    public Mahasiswa() {
    }

    public String getnama() {
        return nama;
    }
    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getnim() {
        return nim;
    }
    public void setnim(String nim) {
        this.nim = nim;
    }

    public String getJenjangPendidikan() {
        char kodeJP = nim.charAt(0);
        if (kodeJP == '1') {
            return " S1 (Sarjana)";
        }else if (kodeJP == '2') {
            return " S2 (Magister)";
        }else if (kodeJP == 3) {
            return " S3 (Doktor)";
        }
        return "Program Selesai";
    }

    public String getTahunMasuk() {
        char kodeTM = nim.charAt(1);
        char kodeTM2 = nim.charAt(2);
        return "20" + kodeTM+kodeTM2;
    }

    public String getFakultas() {
        char kodeFKT = nim.charAt(3);
        if (kodeFKT == '1') {
            return "Tarbiyah dan Keagamaan";
        }else if (kodeFKT == '2') {
            return "Syariat dan Keguruan";
        }else if (kodeFKT == '3') {
            return "Ushuluddin";
        }else if (kodeFKT == '4') {
            return "Dakwah dan Komunikasi";
        }else if (kodeFKT == '5') {
            return "Sains dan Teknologi";
        }else if (kodeFKT == '6') {
            return "Psikologi";
        }else if (kodeFKT == '7') {
            return "Ekonomi dan Ilmu Sosial";
        }else if (kodeFKT == '8') {
            return "Pertanian dan Perternakan";
        }
        return "Program Selesai";
    }

    public String getJurusan() {

        char kodeJUR = nim.charAt(5);
        if (kodeJUR == '1') {
            return "Teknik Informatika";
        }else if (kodeJUR == '2') {
            return "Teknik Industri";
        }else if (kodeJUR == '3') {
            return "Sisitem Informasi";
        }else if (kodeJUR == '4') {
            return "Matematika";
        }else if (kodeJUR == '5') {
            return "Teknik Elektro";
        }
        return "Program Selesai";
    }

    public String getJenisKelamin () {
        char kodeJK = nim.charAt(6);
        if (kodeJK == '1') {
            return "Laki-Laki";
        }else if (kodeJK == '2') {
            return "Perempuan";
        }
        return "Program Selesai";
    }

    public String getNomorUrutMHS() {
        char kodeNUMHS = nim.charAt(7);
        char kodeNUMHS2 = nim.charAt(8);
        char kodeNUMHS3 = nim.charAt(9);
        char kodeNUMHS4 = nim.charAt(10);

        return "" + kodeNUMHS+kodeNUMHS2+kodeNUMHS3+kodeNUMHS4;
    }


    @Override
    public String toString() {
        return "Mahasiswa : " + "\n";
    }

}