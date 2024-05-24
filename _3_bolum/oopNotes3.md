__Bu bölümde neler var?__
- Soyutlama (Abstraction)
- Abstract Class(Soyut Sınıf)
- Interface(Arayüz/Arabirim)



## Soyutlama (Abstraction)
- Soyutlama nesnenin sadece önemli olan kısımlarının görünmesini sağlar. 
- Önemsiz, ayrıntı kısımların görünmesini engeller.
- Soyutlama sadeleşme sağlar ve bilgininde gizlenmesini sağlar.
- Soyutlama abstarct class(soyut sınıflar) ya da interface(arayüzler) ile gerçekleştirilir.

- Soyutlama için bir örnek: Kahve makinasını bir nesne olarak düşünelim kullanıcılar sadece kahve yapma işlevini düşünür, düğmeye basarak istenilen özelliklerde kahve yapma talimatı veririz, içerideki detaylarla uğraşmaz.

## Abstract Class(Soyut Sınıf) ve Abstract Method(Soyut Yöntem)
- Soyut sınıflar kendisinden nesne türetilemeyen sınıflardır.
- Soyut sınıflar diğer sınıflardan kalıtım almak ve ortak özellikleri paylaşmak için kullanılırlar.
- Soyut sınıflar soyut yöntem(metod)lar içerebilir.
- Soyut sınıflar ortak özellikleri paylaşan sınıfları bir araya getirir.
- Soyut sınıflar programların daha küçük ve daha yönetilebilir birimlere bölünmesini sağlar.
- Soyut yöntemler bir gövdeye(imzalı kodsuz metod) sahip olmayan yöntemlerdir.
- Soyut yöntemler soyut sınıftan türetilen sınıflarda tanımlanmalıdır.


![alt text](image\image-1.png)

Yukarıda Shape(şekil) ana sınıfını ve onun alt sınıfalrı olan Rectangle(dikdörtgen), Triangle(üçgen), Rectangle sınıfının alt sınıfı olarakta Square(kare) alt sınıfı şeklinde bir model tasarladık. Bu modelde Shape sınıfından bir nesne türetmemiz mantıksız olacağından bu sınıfı abstract class olarak güncelleyebiliriz. Shape sınıfımız bizim için bir şablon görevi görecek. 

```java
  public abstract class Shape{

  }
```
Shape sınıfına bir de draw() adında alt sınıflarda kullanmak için abstract method tanımladık. 
Bu metod:

```java
  public abstract void draw();
```

görüldüğü üzere abstract anahtar kelimesi ile abstract metod olduğu belirtilir. Abstarct metod olduğu içinde metodun sadece imzası vardır, body(gözde) kısmı yoktur. Metodun gövdesi her alt sınıfta yeniden (kendine özgü) yazılması zorunludur.
```java
    @Override
    public void draw(){
      System.out.println("Dikdörtgen çizildi değerleri x : "+ getX() + " y : "+ getY());
    }
```


---

__Method Signature(Yöntem İmzası)__
Java'da metot imzası, bir metodun adını ve parametrelerini ifade eden bir kavramdır. Bir metodu diğerlerinden ayırt etmede ve tanımlamada kullanılır.

Metot imzası iki ana öğeden oluşur:

1. Metot Adı: Metodun neyi yaptığına dair ipucu veren, anlamlı bir şekilde seçilmesi gereken isimdir.

2. Parametreler: Metot tarafından işlenen verileri temsil eden ve parantez içinde belirtilen değişkenlerdir.

Parametrelerin de kendine ait iki bileşeni vardır:

- Tip: Metot tarafından kabul edilen veri türü (int, String, double gibi).
- Sayı: Metoda kaç adet veri girilebileceğini gösterir.

Örnekler:
```java
    public void yazdir(String metin){

    }
```
yazdir metodun adıdır ve bir metin yazdırma işlemini ifade eder. String metin ise metodun parametresidir ve metodun bir metin değeri alacağını gösterir.
```java
    public int carp(int x, int y){
    
    }
```
carp metodun adıdır ve iki sayıyı çarpma işlemini ifade eder.
int x ve int y ise metodun parametreleridir ve metodun iki adet tamsayı değeri alacağını gösterir.


Metot imzası ile ilgili dikkat edilmesi gereken bazı noktalar:

Aynı sınıfta aynı isimli birden fazla metot bulunduramazsınız. Fakat parametre sayısı veya tipleri farklı ise bu durum mümkündür. Bu, metot aşırı yükleme (method overloading) olarak adlandırılır.
Metot imzası, metodun kimliğini tanımlar ve metodun çağrılmasında kullanılır.
Overriding işleminde, alt sınıfın override ettiği metodun imzası (isim ve parametreler) üst sınıftaki metodun imzasıyla aynı olmalıdır.

---

## Interface (Arayüz/Arabirim)
- Interfaceleri isimlendirirken baş harfleri I ile başlar bu bir jargondur.
- Interfaceler class olarak kabul edilmezler fakat class ve abstarct class lar gibi referans tutabilirler.
- Interface (method)yöntemleri varsayılan olarak abstact ve public.
- Interface (attribute)nitelikleri varsayılan olarak public, static ve finaldir.
- Interfaceler ve soyut sınıflar sabitler içerebilir.
- Sabitler(static final) arayüz içinde tanımlanan ve tüm sınıflardan erişilebilen değişmez değerlerdir. Sabitler, arayüzün işlevselliğini tanımlamak için kullanılabilir, ancak uygulama ayrıntıları içermemelidir.
- Interfacelerde yöntemler(method), abstract classlar gibi gövdesiz sadece imzalı bir şekilde yazılır. 
- Bir class birden fazla Interfacei kalıtabilir(implemente edebilir). 
- Inheritance(kalıtım) keywordü extends ile ifade edilirken, Interface de implements keywordü ile ifade ediyoruz.
- Interfacei implement eden diğer classlar ınterfacein tüm metodlarını kullanmak zorundadırlar.
- Interfaceler de abstaract classlar gibi nesne üretilemezler.
- Interface onu implemente eden classın referansını tutabilir. Bu olay polimorphism(çok biçimlilik) ilkesine örnektir.
- Bir class hem extends edilebilir hemde implements edilebilir.
- Interfaceler ve abstaract classlar, Java'da soyutlama sağlamak için kullanılır. Ancak aralarında bazı temel farklar vardır.
- Interfaceler ve abstaract classlar abstaract methodlar içerebilir. Ancak soyut sınıflar, somut metotlar da içerebilirken, arayüzler içeremez.


<br>
<br>

### Neden Interface Kullanırız?

1. Kod Yeniden Kullanılabilirliği: Arayüzler, kodun farklı parçaları arasında tutarlılık sağlayarak kod yeniden kullanılabilirliğini artırır. Farklı sınıflar, aynı arayüzü uygulayarak aynı fonksiyonları yerine getirebilir. Bu sayede kod tekrarı azalır ve kod yazma ve bakım süresi kısalır.

2. Esneklik: Arayüzler, kodun daha esnek olmasını sağlar. Yeni sınıflar, mevcut arayüzleri kullanarak kolayca sisteme eklenebilir. Bu sayede sistemin yeni ihtiyaçlara göre güncellenmesi ve genişletilmesi kolaylaşır.

3. Soyutlama: Arayüzler, uygulama ayrıntılarını gizleyerek kodun daha soyut hale gelmesini sağlar. Bu sayede kod daha okunabilir ve anlaşılır hale gelir. Aynı zamanda, kodun farklı geliştiriciler tarafından daha kolay bir şekilde üzerinde çalışılabilmesini sağlar.

4. Çoklu Kalıtım: Java, bir sınıfın tek bir somut sınıftan miras almasına izin verir. Fakat birden fazla arayüzden miras almasına izin verir. Bu sayede bir sınıf, birden fazla kaynaktan davranış miras alabilir. Bu özellik, karmaşık sistemleri modellemeyi kolaylaştırır.

5. Polimorfizm: Arayüzler, polimorfizmi destekler. Polimorfizm, aynı metot isminin farklı sınıflarda farklı fonksiyonlar yerine getirmesine olanak tanır. Bu sayede kod daha dinamik ve esnek hale gelir.

__Özetle:__ Arayüzler, Java'da kodun daha sağlam, esnek, bakımı kolay ve tekrar kullanılabilir olmasını sağlayan güçlü bir araçtır.

Arayüz kullanmanın bazı dezavantajları da vardır. Örneğin, arayüzler ek kod karmaşıklığı yaratabilir ve performansı biraz düşürebilir.
Ancak, arayüzlerin sağladığı faydalar, çoğu durumda dezavantajlarından daha fazladır. Bu nedenle, Java'da kod yazarken arayüzleri sıklıkla kullanmak önemlidir.

__Arayüz Kullanmanın Uygun Olduğu Durumlar:__
- Birden fazla sınıfın aynı fonksiyonları yerine getirmesi gerektiğinde
- Kodu daha soyut ve anlaşılır hale getirmek istediğinizde
- Kodun yeniden kullanılabilirliğini artırmak istediğinizde
- Kodun esnekliğini ve bakımı kolaylığını artırmak istediğinizde
- Polimorfizm kullanmak istediğinizde


__Arayüz Kullanmanın Uygun Olmadığı Durumlar:__
- Kodun basit ve karmaşık olmadığı durumlarda
- Performans kritik önem taşıdığında
- Ek kod karmaşıklığı yaratmak istemediğinizde

---
### Uygulama

![alt text](image\image-2.png)
Yukarıdaki diyagarmı implemente edelim.

Instrument adında bir interface oluşturalım. Interfaceler isimlendirilirken başına "I" harfi konur. Bu onun interface olsuğunu gösterir.

```java
  public interface IInstrument {
    void play(); //method
}
```
Interface imize play() adında gövdesiz bir metod yazdık.

<br>
<br>
Guitar ve Piano adında classlar oluşturalım. Şimdilik içlerine bir şeyler yazmayalım.

```java
  public class Guitar{

  }
```
```java
  public class Piano{

  }
```
Oluşturduğumuz interfacei diğer classlarda kullanmak için yani kalıtmak için `implements` anahtar kelimesini kullanırız. Daha sonra hangi interfaceden implement ettiğimizi belirtiriz.

```java
  public class Guitar implements IInstrument{

  }
```
```java
  public class Piano implements IInstrument{

  }
```
Classlara implement işlemini yaptıktan sonra hata alırız.
__HATA:__ The type Guitar must implement the inherited abstract method IInstrument.play()(Guitar türü, miras alınan soyut IInstrument.play() yöntemini uygulamalıdır)
<br>Burada bizden istediği şey hangi interface den kalıtım alırsak o interface deki metodları alt sınıflarda override(tekrar yazma) işlemi yapmamız gerektiğini söylüyor.

```java
  public class Guitar implements IInstrument{
    @Override
    public void play() {
      System.out.println("Gitar çalıyor");
    }
  }
```
```java
  public class Piano implements IInstrument{
    @Override
    public void play() {
      System.out.println("Piyano çalıyor");
    }
  }
```
Override işlemlerini yaptıktan sonra herhangi bir hata almayız.
Interfaceimizi oluşturduk ve 2 sınıf oluşturarak kalıtım yaptık bundan sonraki işlemlerimizi Main dosyasında yapıcaz.

```java
  public class Main {
    public static void main(String[] args) {
      IInstrument guitar = new IInstrument();
    }
}
```
Bu koddan sonra hata alıcaz.

__HATA:__ Cannot instantiate the type IInstrument(IInstrument türü örneklenemiyor)
Yukarıdada bahsettiğimiz gibi interfaceler örneklenemezler ancak onu implemente eden classın referansını tutabilir.

```java
  public class Main {
    public static void main(String[] args) {
      IInstrument guitar = new Guitar();
      IInstrument guitar = new Piano();
      guitar.play();
      piano.play();
      --ÇIKTI--
      Gitar çalıyor
      Piyano çalıyor
    }
}
```
Yukarıdaki kod bloğunda IInstrument interface inden implements edilen classların(Guitar ve Piano) referansını tutarak örnek türettik.

Uygulamamızı geliştirelim.

![alt text](image\image-3.png)

Diyagramda görüldüğü üzere Piano ve Guitar sınıfı 2 farklı interface tarafından miras almış.
IKeyboardIntrument ve IElctronicInstrument interface lerini yazalım.

```java
  public interface IKeyboardInstrument{
    void press();
  }
```
```java
  public interface IElectronicInstrument{
    void tune();
  }
```

Yeni interfaceleri yazdık şimdi ise Guitar ve Piano sınıflarına implements edelim.

```java
  public class Guitar implements IInstrument, IElectronicInstrument{
    @Override
    public void play() {
      System.out.println("Gitar çalıyor");
    }
    @Override
    public void tune() {
      System.out.println("Elektronik gitar");
    }
  }
```

```java
public class Piano implements IInstrument, IKeyboardInstrument {
    @Override
    public void play() {
      System.out.println("Piyano çalıyor");
    }
    @Override
    public void press() {
      System.out.println("Tuşlu piyano");
  }
}
```
implements kelimesinden sonra hangi interfacelerden miras alacaksa belirtiyoruz. Belirtikden sonra miras alınan interfacelerin metodlarını override etmek zorundayız.


![alt text](image\image-4.png)

```java
public class Orchestra {
  private IInstrument[] instruments = {new Guitar(), new Piano()};
  public void playAll(){
    for (IInstrument instrument : instruments) {
      instrument.play();
    }
  }
}
```

```java
  public static void main(String[] args) {
    Orchestra orchestra = new Orchestra();
    orchestra.playAll();
    --ÇIKTI--
    Gitar çalıyor
    Piyano çalıyor
  }
```


#### Kaynak Kodlar

```java

public interface IInstrument {
  void play();
}

public interface IKeyboardInstrument{
  void press();
}

public interface IElectronicInstrument{
  void tune();
}

public class Guitar implements IInstrument, IElectronicInstrument{

  @Override
  public void play() {
    System.out.println("Gitar çalıyor");
  }

  @Override
  public void tune() {
    System.out.println("Elektronik gitar");
  }
}

public class Piano implements IInstrument, IKeyboardInstrument {

  @Override
  public void play() {
    System.out.println("Piyano çalıyor");
  }

  @Override
  public void press() {
    System.out.println("Tuşlu piyano");
  }
}

public class Orchestra {
  private IInstrument[] instruments = {new Guitar(), new Piano()};
  public void playAll(){
    for (IInstrument instrument : instruments) {
      instrument.play();
    }
  }
}

public class Main {
  public static void main(String[] args) {
    IInstrument guitar = new Guitar();
    guitar.play();
    --ÇIKTI--
    Gitar çalıyor

    IInstrument piano = new Piano();
    piano.play();
    --ÇIKTI--
    Piyano çalıyor

    IElectronicInstrument eguitar = new Guitar();
    eguitar.tune();
    --ÇIKTI--
    Elektronik gitar

    IKeyboardInstrument kpianon = new Piano();
    kpianon.press();
    --ÇIKTI--
    Tuşlu piyano

    Orchestra orchestra = new Orchestra();
    orchestra.playAll();
    --ÇIKTI--
    Gitar çalıyor
    Piyano çalıyor
  }
}
```



---