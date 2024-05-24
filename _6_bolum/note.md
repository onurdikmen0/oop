Bu bölümse neler var?
- Nested Class (İç içe sınıflar)
- Inner Class (İç sınıf)
- Outer Class (Dış sınıf)
- Local Class (Yerel sınıflar)
- Anonymus Class (Anonim Sınıflar)


## Nested Class (İç İçe Sınıflar)
- Sınıfların içinde başka sınıflar da tanımlayabiliriz. Bu şekilde iç içe sınıflar (nested classes) oluşturabiliriz.
- İç içe sınıflardan bağsederken iç sınıfın dışındaki sınıf __outher class(dış sınıf)__ adını alır. Dış sınıfın içindeki sınıf içe __inner class(iç sınıf)__ olur.
- Normal bir sınıfın yöntem ve özniteliklerine erişmek için örneğinin alınması gerektiğini biliyoruz. İç içe sınıflarda da durum buna benzer. İç sınıfın yönet ve özniteliklerini kullanabilmemiz için dıştaki sınıfın bir örneğinin alınması gerekir.





### Uygulama
Adım adım öğrendiklerimizi pekiştirelim.
1. İlk olarak `Outer` adında bir sınıf oluşturdum. `Outer` sınıfı bizim dış sınıfımız olacak.
- Şunu eklemek istiyorum dış sınıfın adı illaki outher olmak zorunda değildir, farklı isimlerde olabilir.
```java
    public class Outer {

    }
```
2. `Outer` sınıfına `sayi` adında öznitelik ve `print()` adında yöntem ekliyoruz. 
- Örnek olması adına yaptığımız bu uygulamada kapsülleme yapmıycaz. Amacımız öğrendiğimiz yeni koyu pekiştirmek.
```java
    public class Outer {
        public int sayi;

        public void print(){
            System.out.println("Out sınıfının print metodu!");
            System.out.println(sayi);
        }
    }
```
3. Buraya kadar yeni bir şey yapmadık. Şimdi ise `Outer` sınıfına bir iç sınıf ekliyelim. İç sınıfımızın adı `Inner` olsun. Dış sınıfta da yaptığımız gibi iç sınıfa da `sayi` adında öznitelik ve `print()` adında yöntem ekliyoruz.
- `Inner` sınıfın sayi niteliğine 10 ve `Outer` sınıfın 5 değerlerini default olarak verdim.
```java
    // Dış sınıf
    public class Outer {
        public int sayi = 10;
        
        public void print(){//Dış sınıfın print() metodu
            System.out.println("Out sınıfının print metodu!");
            System.out.println(sayi);
        }

        // İç sınıf
        public class Inner{//İç sınıfın print() metodu
            public int sayi = 5;
            
            public void print(){
                System.out.println("Inner sınıfının print metodu!");
                System.out.println(sayi);
            }
        }
    }
```
4. Bu adımda sınıfların içeriklerine erişmeye çalışıcaz.
- main metodunda `Outer` sınıfının örneğini üretelim.
- `Outer` sınıfının sayi değerini ekrana yazdıralım.
```java
public class Main {
    public static void main(String[] args){
        Outer outer = new Outer();
        System.out.println(outer.sayi);
    }
}
---ÇIKTI---
10
```
- Beklenildiği gibi 10 çıktısını aldık.
- `Inner` sınıfının içeriğine erişmek için 
```java
public class Main {
    public static void main(String[] args){
        Outer outer = new Outer();
        System.out.println(outer.sayi);
    }
}
---ÇIKTI---
10