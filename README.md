# Selenium Web Otomasyon



![se test](https://user-images.githubusercontent.com/33182036/109437527-4175e480-7a36-11eb-9478-da3e1c5dfc1e.png)
> - Proje Java programlama dilinde yazıldı.
> - Proje Maven projesi olarak yazıldı.
> - Selenium, JUnit ve Log4J kütüphaneleri kullanıldı.
> - Proje OOP (Object Oriented Programming) prensiplerine uygun yazılmaya çalışıldı.
> - Page Object Pattern kullanıldı.

## 📌SELENIUM NEDİR?
Selenium, farklı tarayıcılarda ve farklı platformlarda web uygulamalarını doğrulamak için kullanılan ücretsiz açık kaynak kodlu bir otomasyon test aracıdır. 
Test komut dosyalarını oluşturmak için Java, C#, Python vb. birden fazla programlama dilini desteklemektedir.

### Selenium ile test otomasyonu yazmak için nelere ihtiyaç duyarız?

1. Intellij Idea (ya da başka bir ide)
2. JDK (Java Development Kit)
3. Maven
## 📌MAVEN NEDİR?
Maven build, reporting, dependency management ve documentation işlemlerini gerçekleştirir.
Build işleminin iki yönünü ele alır: projenin nasıl build olacağını ve projenin dependency’lerini tanımlar.
Build işlemi için kendisinden önceki araçların aksine kabul edilen bir düzen kullanır ve sadece istisnaların yazılması gerekir.
Dependency management olarak Maven library ulaşmak için sırasıyla bulana kadar local, central ve uzak depolara bakar, indirilmesi gerekiyorsa indirir. Bu mekanizma sayesinde geliştiriciyi büyük bir iş yükünden kurtarır.
Konfigrasyon için pom.xml dosyasını kullanır. Bu dosya projeyi build etmek için gerekli bütün bilgileri içerir.
Maven başlıca Java projeleri için kullanılsa da C#, Ruby, Scala gibi farklı diller için de kullanılabilir.
### Maven ne işe yarar?
Maven’ın asıl amacı geliştirme sürecini en kısa zamana düşürmektir. Bu amaca ulaşmak için Maven bir kaç alanla ilgilenir:

1. Build işlemini kolaylaştırmak
2. Sabit bir build sistemi sağlamak
3. Kaliteli proje bilgisi sağlamak
4. En iyi uygulamayı geliştirmek için kurallar sağlamak
5. Yeni özelliklere geçişi kolaylaştırmak
## 📌POM(Page Object Model) NEDİR?
Project Object Model ya da POM, Maven’ın en önemli parçalarından biridir. Proje hakkında build işlemi için gerekli bilgileri ve konfigrasyon detaylarını içeren bir XML doyasıdır. 
Maven bir görevi yerine getirmeden önce, ilk olarak çalışma dizininde POM’u bulur ve gerekli bilgileri okur.
## 📌TEST ADIMLARI

- www.gittigidiyor.com sitesi açılır.
- Ana sayfanın açıldığı kontrol edilir. Siteye login olunur
- Login işlemi kontrol edilir.
- Arama kutucuğuna bilgisayar kelimesi girilir.
- Arama sonuçları sayfasından 2.sayfa açılır.
- 2.sayfanın açıldığı kontrol edilir.
- Sonuca göre sergilenen ürünlerden rastgele bir ürün seçilir.
- Seçilen ürün sepete eklenir.
- Ürün sayfasındaki fiyat ile sepette yer alan ürün fiyatının doğruluğu karşılaştırılır.
- Adet arttırılarak ürün adedinin 2 olduğu doğrulanır.
- Ürün sepetten silinerek sepetin boş olduğu kontrol edilir.
## 📌PROJE DETAYLARI

➡️ İlk olarak projemizi Maven olarak oluşturup POM dosyamıza aşağıdaki kodları eklemeliyiz. 

   ```
 <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.141.59</version>
    </dependency>
    <dependency>
      <groupId>log4j</groupId>
      <artifactId>log4j</artifactId>
      <version>1.2.17</version>
    </dependency>
```
### Projede kullandığım class'ların içerikleri :

📃 [**BasePage :**](https://github.com/fatmacafri/GittiGidiyorTest/blob/main/src/main/java/base/BasePage.java) : Burada Webdriver oluşturma ve kullanacağımız Selenium komutlarını methodlar haline getirme işlemlerini yapacağız.
Bu sayede işimize yarayan Selenium komutunu her defasında yazmak yerine methodu çağırarak çalıştıracağız.

📃 [**BaseTest :**](https://github.com/fatmacafri/GittiGidiyorTest/blob/main/src/test/java/base/BaseTest.java) : Burada Before ve After anotasyonlarımız olacak. Before ve afterın ana mantığı şu şekilde; herhangi bir testimizi çalıştırdığımızda önce before anotasyonu sonrasında çalıştırdığımız test sonrasında ise after anotasyonumuz çalışacak. 
@Before anotasyonunda driver ayarlarını yaparken @After anotasyonunda ise driverımızı kapatıyoruz.

📂[**constants**](https://github.com/fatmacafri/GittiGidiyorTest/tree/main/src/main/java/constants) : Bu package içindeki class'larda elementlerimizin locatorlarını tutuyoruz. Bu sayede elementlerde ki herhangi bir değişiklik meydana gelmesi durumunda buradan müdahele etmemiz yeterli olacaktır.

📂[**test**](https://github.com/fatmacafri/GittiGidiyorTest/tree/main/src/test/java/test) : Son olarak testimizi çalıştıracağımız komutlarımızı bu package içindeki class'ların @Test anotasyonu altında yazıyoruz. Burada dikkat edilmesi gereken husus test anotasyonu before ve after anotasyonları arasında olmalıdır.

