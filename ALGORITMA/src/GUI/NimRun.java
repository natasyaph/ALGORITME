package GUI;

import java.text.MessageFormat;

public class NimRun {
        public static void main(String[] args) {
            String nim = "12050123494";
            Nim objNim = new Nim();
            objNim.setNim(nim);
            System.out.println("Nama = Natasya Pingkan Haqia ");
            System.out.println(new StringBuilder().append("Jenis pendidikan = ").append(objNim.getJenjangPendidikan()).toString());
            System.out.println(objNim.getTahunMasuk ());
            System.out.println(MessageFormat.format("Fakultas = {0}", objNim.getFakultas()));
            System.out.println(new StringBuilder().append("Jurusan =").append(objNim.getJurusan()).toString());
            System.out.println("Jenis kelamin = "+objNim.getJenisKelamin());
            System.out.println(objNim.getNomorUrut());
        }

    private static class Nim {
        private String nim;

        public void setNim(String nim) {
            this.nim = nim;
        }

        public boolean getJenjangPendidikan() {
            return false;
        }

        public boolean getTahunMasuk() {
            return false;
        }

        public Object getFakultas() {
            return null;
        }

        public boolean getJurusan() {
            return false;
        }

        public String getJenisKelamin() {
            return null;
        }

        public boolean getNomorUrut() {
            return false;
        }
    }
}
