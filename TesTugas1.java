
class Tabungan {
    private int saldo;

    public Tabungan(int initsaldo) {
        this.saldo = initsaldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void simpanUang(int jumlah) {
        this.saldo += jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            return false;
        }
    }
}


public class TesTugas1 {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : " + tabungan.getSaldo());

        tabungan.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");

        System.out.println("Jumlah uang yang diambil : 6000    " + (tabungan.ambilUang(6000) ? "ok" : "gagal"));

        tabungan.simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500");

        System.out.println("Jumlah uang yang diambil : 4000    " + (tabungan.ambilUang(4000) ? "ok" : "gagal"));

        System.out.println("Jumlah uang yang diambil : 1600    " + (tabungan.ambilUang(1600) ? "ok" : "gagal"));

        tabungan.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");

        System.out.println("Saldo sekarang = " + tabungan.getSaldo());
    }
}
