public abstract class Insan {
    public Insan(String tc, String ad, String soyad, String meslek, int yas) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.meslek = meslek;
        this.yas = yas;
    }
    private String tc;
    private String ad;
    private String soyad;
    private String meslek;
    private int yas;

    public String getTc() {
        return tc;
    }
    public void setTc(String tc) {
        this.tc = tc;
    }
    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getMeslek() {
        return meslek;
    }
    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }
    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }
    
    

}
