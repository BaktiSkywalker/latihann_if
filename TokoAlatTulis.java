

 class AlatTulis {
    private String nama;
    private int stok;
    private double hargaSatuan;

    public AlatTulis(String nama, int stok, double hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }
   
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public void sethargaSatuan(double hargaSatuan){
        this.hargaSatuan = hargaSatuan; }
    public String getNama(){
        return nama;
    }
    public int getStok(){
        return stok;
    }
    public double gethargaSatuan(){
        return hargaSatuan;
    }
    
    public double getTotalHarga(){
        return stok * hargaSatuan;
    }
}
public class TokoAlatTulis {
    public static void main(String[] args){
        
        AlatTulis bolpoin = new AlatTulis("Bolpoin", 10, 2000);
        AlatTulis pensil = new AlatTulis("Pensil", 10, 1000);
        AlatTulis penghapus = new AlatTulis("Penghapus", 10, 500);
        
        System.out.println("Nama Alat Tulis: " + bolpoin.getNama());
        System.out.println("Stok:" + bolpoin.getStok());
        System.out.println("Harga Satuan :" +bolpoin.gethargaSatuan());
        System.out.println(" Total Harga " +bolpoin.getNama() + ":" + bolpoin.getTotalHarga());
        System.out.println("------------------------------------");

        System.out.println("Nama Alat Tulis: " + pensil.getNama());
        System.out.println("Stok:" + pensil.getStok());
        System.out.println("Harga Satuan :" +pensil.gethargaSatuan());
        System.out.println(" Total Harga " +pensil.getNama()+ ":" + pensil.getTotalHarga());
        System.out.println("------------------------------------");

        System.out.println("Nama Alat Tulis: " + penghapus.getNama());
        System.out.println("Stok:" + penghapus.getStok());
        System.out.println("Harga Satuan :" +penghapus.gethargaSatuan());
        System.out.println("Total Harga " +penghapus.getNama()+ ":" + penghapus.getTotalHarga());
        System.out.println("------------------------------------");

        double totalHargaSemua = bolpoin.getTotalHarga() + pensil.getTotalHarga() + penghapus.getTotalHarga();
        System.out.println("Total harga alat tulis kalau terjual semua :" + totalHargaSemua);   
        System.out.println("_____________________________________"); 
    }
    
}


