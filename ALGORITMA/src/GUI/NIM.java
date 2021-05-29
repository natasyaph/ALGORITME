package GUI;

class NIM {
    private String nim;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getFakultas() {
        char kodeFK = nim.charAt(3);
        if (kodeFK == '1') {
            return "Tarbiyah dan Keguruan";
        } else if (kodeFK == '2') {
            return "Syari’ah dan Hukum";
        } else if (kodeFK == '3') {
            return "Ushuluddin";
        } else if (kodeFK == '4') {
            return "Dakwah dan Komunikasi";
        } else if (kodeFK == '5') {
            return "Sains dan Teknologi";
        } else if (kodeFK == '6') {
            return "Psikologi";
        } else if (kodeFK == '7') {
            return "Ekonomi dan Ilmu Sosial";
        } else if (kodeFK == '8') {
            return "Pertanian dan Peternakan";
        }
        return "Unknown";
    }

    public String getJurusan() {
        char kodeJN = nim.charAt(5);
        if (kodeJN == '1') {
            return "Teknik Informatika";
        } else if (kodeJN == '2') {
            return "Teknik Industri";
        } else if (kodeJN == '3') {
            return "Sistem Informasi";
        } else if (kodeJN == '4') {
            return "Matematika";
        } else if (kodeJN == '5') {
            return "Teknik Elektro";
        }
        return "Unknown";
    }

    public String getJenisKelamin() {
        char kodeJK = nim.charAt(6);
        if (kodeJK == '1') {
            return "LAKI-LAKI";
        } else if (kodeJK == '2') {
            return "PEREMPUAN";
        }
        return "UNKNOWN";
    }
    public String getNomorUrut(){
        char kodeU = nim.charAt(7);
        char kodeUr = nim.charAt(8);
        char kodeUru = nim.charAt(9);
        char kodeurut = nim.charAt(10);
        return "Nomor Urut:" + kodeU + kodeUr + kodeUru +kodeurut;
    }
}
