package com.hllbr.parameteroperationonclass

class Simpson (var age : Int,var name : String,var job : String){
var hairColor = "" //Private tanımlarsam mainActivity içinde kullanamam proje içerisinde değiştirilmesini yada erişilmesini istemediğim değişkenleri oluştururken bu yapıdan yararlanarak oluşturabilrim.Private yapıarl üzerinde erişim mümkün getter & setter ile bunlara ulaşabilirim

fun changedHairColor(){
    this.hairColor = "Black"
}

}
/*Bu işlemler genelde diğer obje odaklı programlama dillerinde de aynı şekilde işliyor fakat Korlin bu işlemi daha kısa bir şekilde yapma imkanı sunuyor


    Property
    var age = 0
    var job = ""
    var name = ""

    Simpson sınıfından bir obje oluşrturulduğunda çağrılacak metod Constructor() oalrak ifade edilir.


    constructor(ageInput : Int,nameInput : String,jobInput: String){
      this anahtar kelimesi içinde bulunduğu sınıfa yada bir üst seviyeye referans verir
        this.age = ageInput
        this.name = nameInput
        this.job = jobInput



 Visibility model /Acces modifier == Erişilebilirlik seviyeleri = bir değişkenin tanımlanan bir property yada tanımlanana bir objenin nereden erişilebileceğinin kararını veren yapılardır.

 Private = en katı yapımız hiçbir yerden ulaşılamaz.Nerde tanımladıysak ordan ulaşabiliriz.

 Protected = Private gibi çok farkı yok sadece eğer kalıtım aldığım bir sınıf varsa inheritance varsa ordada kullanılabiliyor.

 internal = Bütün Projeden ulaşılabilir fakat farklı modüllerden ulşılamaz.Extra bir kütüphane kullanırsam oradan ulaşamam


 Public = heryerden ulaşılabiliyor
 */
