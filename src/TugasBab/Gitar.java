package TugasBab;

public class Gitar extends MusikPetik {

    private String Bahan, Jenis, Nada;

    public Gitar(String Bahan, String Jenis, String Nada) {
        super(Bahan, Jenis, Nada);
        this.Bahan = Bahan;
        this.Jenis = Jenis;
        this.Jenis = Nada;
    }

    @Override
    public void setBahan() {
        System.out.println("Bahan \t\t: " + Bahan);
    }

    @Override
    public void setJenis() {
        System.out.println("Jenis \t\t: " + Jenis);
    }

    @Override
    public void setNada() {
        System.out.println("Nada \t\t : " + Nada);
    }

}
