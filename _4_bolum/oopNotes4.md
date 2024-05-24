
## Static Keyword
- static anahtar sözcüğü, bir sınıfın üye değişkeninin sınıfın tüm örnekleri arasında paylaşması gerektiğinde kullanılır.
- Tüm static değişkenler ve örnekler sınıfa aittir, sınıfın herhangi örneğine ait değildir.
- static üyeler bu nedenle sınıf üyesi (class member) olarak ifade edilir. static olmayan yapılar ise instance member olurlar.
- Nesne yönelimli programlamada, static sınıf nesneye özgü olmayan bir sınıftır.
- Static sınıflar nesneler oluşturmak için kullanılmaz
- Static sınıflar yalnızca static değişkenler, static yöntemler ve static yapıları içerebilir.
- Static sınıflar, nesneye özgü olmayan kodu depolamak için kullanılır.
<br>

![alt text](image\image-1.png)

İşlemler sırasıyla gerçekleşir. Buradan yola çıkarak static yapıların hızlı olduklarından bahsedebiliriz.
<br>

![alt text](image\image-2.png)
Yukarıda bir static class tanımlanmış. Nesne türetmeden direk sınıfın ismiyle yöntemlere  erişimin olduğunu görüyoruz.

```java
public class MathHelper {
    public static int add(int a, int b){
        return a + b;
    }
    public static int substract(int a, int b){
        return a - b;
    }
    public static int multipy(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        if(b == 0){
            System.out.println("b, 0'a eşit olamaz.");
        }
        return a / b;
    }
}
```
Burada MathHelper sınıfının kaynak kodu. Yöntemler static yöntem olarak yazılmış. Java'da sınıfın static olmasına izin verilmiyor ancak diğer dillerde bu mümkün örnek vermek gerekirse C#'da bir sınıfın static olması için `public static class MathHelper { ... }` şeklinde bir tanımlama yapılabilirinir.
<br>
<br>

## Access Modifiers(Erişim Belirleyiciler)
Java'da bir sınıfa ait nitelik ve davranışlara ulaşabilmek için Erişim Belirleyiciler (Access Modifiers) kullanılır. Erişim belirleyiciler, değişken ,metot ve sınıfların önüne yazılır ve yazıldıkları konuların erişilebilecekleri alanları belirlerler.

#### Private Erişim Belirleyici

Java'da `private` deyimi yazıldığı öğenin sadece ait olduğu sınıftan doğrudan erişilebilir olduğunu ve o sınıfın dışındaki kod parçacıklarından doğrudan erişilemeyeceğini tanımlar. 

#### Public Erişim Belirleyici

Java'da `public` deyimi , yazıldığı öğenin sadece olduğu sınıf için değil, diğer sınıflar tarafından doğrudan erişilebilir olmasını sağlar. Sınıflara ait nesnelerin ve diğer nesneler tarafından kullanılması istenilen metotlar için "Public Erişim Düzenleyicisi" kullanılır.

#### Protected Erişim Belirleyici

Java'da `protected` deyimi , public ve private arasında kalan bir erişim düzenleyicidir. `protected` ile tanımlanan öğeler, kendisi ile aynı package (paket) bulunan sınıflar tarafından doğrudan erişilir.

#### Default(Varsayılan)

Eğer yazdığımız kodlarda herhangi bir öğenin önüne erişim düzenleyici yazmazsak, o öğenin erişimi ait olduğu paket ile sınırlandırılır. Aynı pakette bulunan başka bir sınıf içinden o öğeye erişilir.

![alt text](image\image-3.png)

## Final Keyword

Java'da `final` deyimi, önüne yazıldığı öğenin değerini bir kez tanımlandıktan sonra değiştirilemeyeceğini söyler. Sabit tanımlamak olarak da bilinir.

Bir sabit değeri tanımlandıktan sonra değiştirilemeyeceği için, `final` ile tanımlanmış bir değişkenin `public` olmasında bir sorun olmayacaktır.

Sabitlerde isimlendirmede genel kullanım olarak tüm harfler büyük ve birden fazla kelime varsa alt çizgi konulur.

```java
 public final double PI_SAYISI = 3.14;
```
`PI_SAYISI` değerini daha sonra değiştirmek istersek hata alırız.

