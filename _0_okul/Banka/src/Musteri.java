public class Musteri extends Insan implements ParaIslem{
    private int bakiye;
    private String iban;
    
    public Musteri(String tc, String ad, String soyad, String meslek, int yas, int bakiye, String iban) {
        super(tc, ad, soyad, meslek, yas);
        this.bakiye = bakiye;
        this.iban = iban;
    }

    public int getBakiye() {
        return bakiye;
    }
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    
    @Override
    public void paraCek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'paraCek'");
    }
    @Override
    public void paraYatir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'paraYatir'");
    }
    @Override
    public void odeme() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'odeme'");
    }

}
