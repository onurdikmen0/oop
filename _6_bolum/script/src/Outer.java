//outer class - dış sınıf
public class Outer {
    public int sayi = 10;

    public void print(){
        Inner innerOut = new Inner();
        innerOut.print();
        //dış sınıfdan iç sınıfa erişmek için "System.out.println(Out.this.a);" bunun gibi bir kod yazamayız. Ancak nesne üreterek metod yardımıyla sınıfın içeriğine erişebiliriz.
    }

    //inner class - iç sınıf
    public class Inner {//dış sınıfın iç sınıfı
        public int sayi = 5;


        public void print(){
            System.out.println("InnerOut sınıfına ait print metodu çalıştı!");
            sayi = 1;
            System.out.println(sayi);//scope a göre çıktılar
            System.out.println(this.sayi);//ait olduğu sınıfın a değeri
            System.out.println(Outer.this.sayi);//Out sınıfının a değeri
            // out sınıfı dış sınıf olduğundan kolayca erişilebilindi
        }
    }



}
