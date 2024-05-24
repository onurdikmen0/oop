## Nesnelerin İlişkisi
- Nesne yönelimli programlamada, program yürütüldüğünde çeşitli nesneler porgramlama görevlerini yerine getirmek için birlikte çalışırlar.

- Senaryolar, sistemin nesneleri(sınıf örnekleri) arasında gerçekleşecek dinamik etkileşimler belirlenmesine yardımcı olur.

![alt text](image\image-1.png)

### has-a (Aggregation/Birleşim)
- Bir nesnenin başka bir nesneyi içerdiği ve her iki nesnenin de kendi bağımsız var oluşlarına sahip olması durumudur.
- Aslında Composition bir türdür.

![alt text](image\image-2.png)

- Bu uml diyagramından yola çıkarak "University has Student"(University sınıfı Student sınıfına sahiptir) bilgisini çıkartabiliriz. Bunu nerden çıkardık şöyle, University sınıfının sutudents adındaki Student türündeki List yapısına bakarsak bu listenin görevi öğrencileri bu listede tutmaktır. Bunu da Student sınıfının nesnelerini kullanarak yapmaktadır. 
- Bir öğrencinin bir üniversitede yer alabileceği ve bir üniversitenin birden fazla öğrencisi olabileceği bilgisini de çıkartabiliriz.


### is-a (Extension/Kalıtım)
Bir nesnenin başka bir nesneyi kalıtım(miras alma) yoluyla genişlettiği veya uzantısı olduğu ilişkisini ifade eder.

![alt text](image\image-3.png)


### use-a (Dependency/Bağımlılık)
Bir nesnenin başka bir nesneyi kullanarak veya içererek işlevselliğini genişlettiği ilişkisini ifade eder.

![alt text](image\image-4.png)

- Burad ise Car sınıfının Engine sınıfını kullandığını ifade edebiliriz.

### is-a-part-of (Composition)
Bir nesnenin başka bir nesnenin bir parçası olduğu ilişkisini ifade eder.
Bu ilişkide bir nesne başka bir nesnenin fiziksel veya mantıksal bir bölümünü temsil eder.
Oluşum "constains-a" ilişkisi olarak anlaşılmalıdır.

![alt text](image\image-5.png)
- Car sınıfında liste olarak Wheel ve Pessanger sınıfları kullanılmış.
- Car içerir wheel(araba tekerlek içerir) burada Composition dan bahsedilir arabanın tekerleği olması zorunludur. Burada verlıklar ayrı olarak yaşamlarını sürdüremiyorlardır.
- Car has Passanger(araba yolcuya sahip ama olmayabilirde) bu ilişkideki 0..5 ifadesi araba sınıfının yolcusu olmayabilir olursa da en fazla 5 yolcusu olur anlamındadır. Burada varlıklar ayrı bir şekilde hayatlarına devam edebilirler.


contains : içerir

Extension : uzatma
Composition : birleşim
Aggregation : birleştirme, toplama
