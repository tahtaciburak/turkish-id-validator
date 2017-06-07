# TC Kimlik Numarasi Dogrulayici

TC kimlik numaralari belirli bir algoritmayla sifrelenerek olusturulmus 11 adet rakamdan olusur. Uygulamanizda girilen bir string'in gecerli olup olmadigini sorgulamak istiyorsaniz yukaridaki Java Classini projenize dahil edebilirsiniz.

## Algoritma

Bir stringin gecerli bir kimlik numarasi olabilmesi icin asagidaki sartlari saglamasi gerekir.
```
--->11 haneli olmalidir
--->Soldan ilk basamak 0 olamaz.
--->d10 = ((d1+d3+d5+d7+d9)*7 - (d2+d4+d6+d8))mod10 (Onuncu basamak icin dogrulama islemi)
--->d11 = sum(d1,d2,d3...d11)mod10 (Onbirinci basamak icin dogrulama islemi)
```
## Kullanim

Yukaridaki kodlari projenize dahil ettikten sonra ilgileneceginiz tek kisim <code>boolean IsValid()</code> fonksiyonu. Ana sinifinizda olusturacaginiz bir <code>TurkishIdNumber</code> nesnesinin <code>IsValid()</code> fonksyionuna erisip boolean tipinde bir geridonus alacaksiniz.

## Test

Kodlari bilgisayariniza cekip asagidaki adimlari izleyerek test edebilirsiniz.
Konsolda kodlarinizin bulundugu klasore gidin.

```
javac *
```

ve ardindan

```
java Test [TC_Kimlik_Numaranizi_Yazin]
```

ve size bir girdiginiz stringin dogru bir kimlik numarasi mi oldugunu true yada false dondurerek gosterecektir.

## Rica

Siz de uzman oldugunuz veya gelismek istediginiz dillerde bu uygulamayi yapip pull request atarsaniz repoya eklerim. Yeni baslayanlar icin faydali bir egzersiz olabilir. Hepinize iyi calismalar.
