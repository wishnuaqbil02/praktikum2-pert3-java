public class Person {
    private String nama;
    private String jenisKelamin;
    private int umur;
  
    public void setNama(String nama) {
        this.nama = nama;
    }
  
    public String getNama() {
        return nama;
    }
  
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
  
    public String getJenisKelamin() {
        return jenisKelamin;
    }
  
    public void setUmur(int umur) {
        this.umur = umur;
    }
  
    public int getUmur() {
        return umur;
    }
  
    public static void main(String[] args) {
        Person anton = new Person();
        anton.setNama("Anton");
        anton.setJenisKelamin("Laki-laki");
        anton.setUmur(25);
  
        Person riko = new Person();
        riko.setNama("Riko");
        riko.setJenisKelamin("Laki-laki");
        riko.setUmur(30);
  
        System.out.println("Nama: " + anton.getNama());
        System.out.println("Jenis Kelamin: " + anton.getJenisKelamin());
        System.out.println("Umur: " + anton.getUmur());
  
        System.out.println("Nama: " + riko.getNama());
        System.out.println("Jenis Kelamin: " + riko.getJenisKelamin());
        System.out.println("Umur: " + riko.getUmur());
    }
  }
  