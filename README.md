# Java03VizsgaValodi

Java03Vizsga

Java03Vizsga

A feladatok megoldását egy zip vagy rar fájlba becsomagolva kérjük feltölteni a verziókövetőbe, egy jelszóval ellátva, amit kérjük adjon meg a tanárnak. A csomagolt fájl nevében szerepeljen az ön teljes neve.

Minden sikeres feladatmegoldás 20 pontot ér, részpontszámok számítanak.

1, Írjon egy függvényt, ami kap egy számot és visszaadja Stringként hogy az adott szám milyen hónap lenne szövegesen. (Pld. 1 - "január", 2 - "február", stb...) Ha nincs ilyen hónap akkor dobjon egy saját NoSuchMonth kivételt, ami a RuntimeException-ből származzon le.

2, Írjon függvényt ami egy Stringet kap paraméterként és megmondja hogy az adott String palindróma-e (előlről hátrafelé és hátulról előrefelé olvasva ugyanazt kapjuk). Példák: ("görög", "búb", "apa") Elég palindróma szavakat vizsgálnunk, nem kell kifejezéseket. (Pld. "Indul a pap aludni")

3, Írjon egy bevásárlólista programot, ami a következő konzolos menüvel rendelkezik:

    új elem felvétele a bevásárlólistába
    elem törlése a bevásárlólistából
    minden elem törlése a bevásárlólistából
    bevásárlólista kiírása a képernyőre
    kilépés

Az input bekérésére használjon Scanner-t. Hozzon létre egy Termék osztályt, amiben a következő adatok legyenek: termékId, termékNeve, termékÁra Az 1. menüpont választása után kérjük be a termék adatait, ahogy a Termék osztályban szerepel és mentsük el a terméket egy tetszőleges adatszerkezetbe. A 2. menüpont választása után kérjük be a termék id-ját amit törölni szeretnénk és töröljük a bevásárlólistából. A 3. menüpont választásánál töröljük az összes terméket a bevásárlólistából. A 4. menüpont menjen végig a bevásárló listán és írja ki az összes terméket a képernyőre. Az 5. menüpont lépjen ki a programból. Kilépés hiányában az első 4 menüpont bármelyikét végtelen sokszor lehessen választani. A bevásárlólista egyenlőre csak a memóriába kerüljön bele, azaz kilépésnél elveszhet.

4, Az előző feladathoz adjon hozzá két új menüpontot: 6. bevásárlólista mentése fájlba 7. bevásárlólista betöltése fájlból Bármelyik választása után kérjen be egy elérési utat és fájlnevet, (vagy meg lehet oldani úgy is hogy csak fájlnevet és az elérési út mindig rögzített) és utána írja ki a Termékeket fájlba, vagy olvassa be őket onnan.

5, A 4. feladatban JDBC segítségével mentse el adatbázisba a Termékeket, illetve adatbázisból olvassa be őket. Ehhez vegyen fel két új menüpontot: 8. bevásárlólista mentése adatbázisba 9. bevásárlólista betöltése adatbázisból
