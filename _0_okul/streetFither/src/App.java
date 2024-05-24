public class App {
    public static void main(String[] args) throws Exception {
        Karakter ken = new Karakter("Ken", "yok", 100);
        Karakter johncena = new Karakter("johncena", "yalnız", 200);
        
        Dovus dovus = new Dovus(ken, johncena);
        dovus.oyun(ken, johncena);
        
        
        
    }
    // public static String oyun(Karakter ken, Karakter johncena){
    //     Dovus dovus = new Dovus(ken, johncena);
    //     while((ken.getCan() > 0) && (johncena.getCan() > 0)){
    //         dovus.rount();
            
    //         int hasar = dovus.hasarHesapla(ken);
    //         dovus.canAzaltma(johncena, hasar);
    //         dovus.canBilgi(ken);
            
    //         if (johncena.getCan() > 0){//vurduktan sonra tekrar kontrol yapılır
    //             hasar = dovus.hasarHesapla(johncena);
    //             dovus.canAzaltma(ken, hasar);
    //             dovus.canBilgi(ken); 
    //         }
    //     }

    //     if (ken.getCan() <= 0) {
    //         return johncena.getIsim() + " kazandı!";
    //     } 
    //     else {
    //         return ken.getIsim() + " kazandı!";
    //     }
    
}

