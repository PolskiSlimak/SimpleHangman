package com.hangman;

import java.util.Scanner;

public class Game {
    private String[] words = {"zdolny","konto","kwas","przez","działać","dodanie","dostosowanie","Reklama","jeszcze raz","przeciwko","umowa","powietrze","wszystko","prawie","pośród","ilość","rozrywka","kąt","zły","zwierzę","odpowiedź","Mrówka","każdy","aparat","jabłko","zatwierdzenie","łuk","argument","ramię","armia","sztuka","tak jak","atak","próba","Uwaga","atrakcja","autorytet","automatyczny","obudzić","niemowlę","plecy","zły","torba","saldo","piłka","zespół muzyczny","baza","basen","kosz","kąpiel","być","piękny","dlatego","łóżko","pszczoła","przed","zachowanie","wiara","dzwon","zgięty","jagoda","pomiędzy","ptak","narodziny","kawałek","gryźć","gorzki","czarny","nóż","krew","cios","niebieski","deska","łódź","ciało","wrzenie","kość","książka","bagażnik","butelka","pudełko","chłopiec","mózg","hamulec","gałąź","mosiądz","chleb","oddech","cegła","most","jasny","złamany","brat","brązowy","szczotka","wiadro","budynek","żarówka","palić się","rozerwanie","biznes","ale","masło","przycisk","przez","ciasto","aparat fotograficzny","brezentowy","karta","opieka","wagon","wózek","kot","przyczyna","pewny","łańcuch","kreda","szansa","zmiana","tani","ser","chemiczny","skrzynia","szef","Broda","kościół","okrąg","czysty","jasny","zegar","płótno","Chmura","węgiel","płaszcz","zimno","kołnierz","kolor","grzebień","chodź","komfort","komisja","wspólny","firma","porównanie","konkurencja","kompletny","złożony","stan: schorzenie","połączenie","przytomny","kontrola","gotować","miedź","Kopiuj","sznur","korek","bawełna","kaszel","kraj","pokrywa","krowa","pęknięcie","kredyt","przestępstwo","okrutny","zmiażdżyć","płakać","Puchar","Puchar","obecny","kurtyna","krzywa","poduszka","uszkodzić","zagrożenie","ciemny","córka","dzień","nie żyje","drogi","śmierć","dług","decyzja","głęboki","stopień","delikatny","zależny","projekt","pragnienie","zniszczenie","Szczegół","rozwój","różne","trawienie","kierunek","brudny","odkrycie","dyskusja","choroba","niesmak","dystans","dystrybucja","podział","zrobić","pies","drzwi","wątpić","na dół","drenaż","szuflada","sukienka","drink","napędowy","upuszczać","suchy","kurz","ucho","wcześnie","Ziemia","Wschód","Brzeg","Edukacja","efekt","jajko","elastyczny","elektryczny","koniec","silnik","wystarczająco","równy","błąd","parzysty","zdarzenie","zawsze","każdy","przykład","Wymieniać się","istnienie","ekspansja","doświadczenie","ekspert","oko","Twarz","fakt","spadek","fałszywy","rodzina","daleko","gospodarstwo rolne","gruby","ojciec","strach","pióro","słaby","uczucie","Płeć żeńska","płodny","fikcja","pole","walka","palec","ogień","pierwszy","ryba","naprawiony","flaga","płomień","mieszkanie","lot","podłoga","kwiat","latać","zagięcie","jedzenie","głupi","stopa","dla","siła","widelec","Formularz","Naprzód","ptactwo","rama","wolny","częsty","przyjaciel","od","z przodu","owoc","pełny","przyszłość","ogród","generał","dostać","dziewczyna","dać","szkło","rękawica","iść","Koza","złoto","dobry","rząd","ziarno","trawa","świetny","Zielony","szary","uchwyt","Grupa","wzrost","przewodnik","pistolet","włosy","młotek","dłoń","wiszące","szczęśliwy","port","ciężko","Harmonia","kapelusz","nienawidzić","mieć","on","głowa","zdrowy","słyszeć","przesłuchanie","serce","ciepło","Wsparcie","wysoki","historia","otwór","wydrążony","hak","nadzieja","róg","koń","szpital","godzina","dom","w jaki sposób","humor","ja","lód","pomysł","gdyby","chory","ważny","impuls","w","zwiększać","przemysł","atrament","owad","instrument","ubezpieczenie","zainteresowanie","wynalazek","żelazo","wyspa","galaretka","klejnot","Przystąp","podróż","sędzia","skok","trzymać","czajnik","klucz","kopnięcie","uprzejmy","pocałunek","kolano","nóż","węzeł","wiedza, umiejętności","wylądować","język","ostatni, ubiegły, zeszły","późno","śmiech","prawo","prowadzić","liść","uczenie się","Skórzany","lewo","noga","pozwolić","list","poziom","biblioteka","winda","lekki","lubić","limit","linia","bielizna","warga","ciekły","lista","mało","życie","zamek","długo","Popatrz","luźny","utrata","głośny","miłość","Niska","maszyna","robić","męski","mężczyzna","menedżer","mapa","znak","rynek","żonaty","masa","mecz","materiał","może","posiłek","pomiar","mięso","medyczny","spotkanie","pamięć","metal","środkowy","wojskowy","mleko","umysł","mój","minuta","zamglenie","mieszany","pieniądze","małpa","miesiąc","księżyc","ranek","matka","ruch","Góra","usta","ruszaj się","dużo","mięsień","muzyka","gwóźdź","Nazwa","wąski","naród","naturalny","Blisko","niezbędny","szyja","potrzeba","igła","nerw","netto","Nowy","Aktualności","noc","Nie","hałas","normalna","północ","nos","nie","Uwaga","teraz","numer","orzech","obserwacja","z","poza","oferta","gabinet","olej","stary","na","tylko","otwarty","operacja","opinia","naprzeciwko","lub","Pomarańczowy","zamówienie","organizacja","ornament","inny","na zewnątrz","piekarnik","nad","właściciel","strona","ból","farba","papier","równolegle","paczka","część","przeszłość","pasta","Zapłata","pokój","długopis","ołówek","osoba","fizyczny","obrazek","świnia","kołek","rura","miejsce","samolot","roślina","talerz","grać","Proszę","przyjemność","pług","kieszeń","punkt","zatruć","Polskie","polityczny","ubogi","porter","pozycja","możliwy","garnek","Ziemniak","proszek","moc","obecny","Cena £","wydrukować","więzienie","prywatny","prawdopodobny","proces","produkować","zysk","własność","proza","protest","publiczny","Ciągnąć","pompa","kara","cel, powód","Pchać","położyć","jakość","pytanie","szybki","cichy","całkiem","szyna","deszcz","zasięg","szczur","oceniać","promień","reakcja","czytanie","gotowy","powód","paragon","rekord","czerwony","żal","regularny","relacja","religia","przedstawiciel","żądanie","szacunek","odpowiedzialny","odpoczynek","nagroda","rytm","Ryż","dobrze","pierścień","rzeka","Droga","pręt","rolka","dach","Pokój","korzeń","szorstki","okrągły","pocierać","reguła","biegać","smutny","bezpieczny","żagiel","Sól","podobnie","piasek","mówić","skala","szkoła","nauka","nożyce","wkręt","morze","siedzenie","druga","sekret","sekretarz","widzieć","nasionko","wydać się","wybór","samego siebie","wysłać","sens","oddzielny","poważny","sługa","seks","cień","potrząsnąć","wstyd","ostry","owca","półka","statek","koszula","zaszokować","but","krótki","zamknąć","bok","znak","jedwab","srebro","prosty","siostra","rozmiar","skóra","Spódnica","niebo","spać","poślizg","nachylenie","powolny","mały","rozbić","zapach","uśmiech","palić","gładki","wąż","kichnięcie","śnieg","więc","mydło","społeczeństwo","skarpetka","miękki","solidny","trochę","syn","piosenka","sortować","dźwięk","zupa","południe","przestrzeń","łopata","specjalny","gąbka","łyżka","wiosna","plac","etap","znaczek","gwiazda","początek","komunikat","stacja","parowy","stal","trzon","krok","kij","lepki","sztywny","nadal","szew","pończocha","żołądek","złóg","zatrzymać","sklep","fabuła","prosto","dziwne","ulica","rozciągać","silny","Struktura","substancja","taki","nagły","cukier","sugestia","lato","słońce","wsparcie","niespodzianka","Słodkie","pływać","system","stół","ogon","brać","rozmowa","wysoki","smak","podatek","nauczanie","tendencja","test","niż","że","the","następnie","teoria","tam","gruby","chudy","rzecz","to","myśl","wątek","gardło","przez","przez","kciuk","grzmot","bilet","mocno","do","czas","cyna","zmęczony","do","palec u nogi","razem","jutro","język","ząb","Top","dotknąć","miasto","handel","pociąg","transport","taca","drzewo","sztuczka","kłopot","spodnie","prawdziwe","skręcać","skręcać","parasol","pod","jednostka","w górę","posługiwać się","wartość","werset","bardzo","naczynie","widok"};
    private StringBuilder word = new StringBuilder(words[(int) (Math.random() * words.length)]);
    private StringBuilder sb = new StringBuilder(new String(new char[word.length()]).replace("\0", "_"));
    private int count = 0;

    Game() {
        if (word.length() != 1)
            sb.setCharAt(0, word.charAt(0));
        if (word.toString().contains(" "))
            sb.setCharAt(word.indexOf(" "), ' ');
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        boolean answer = false;
        String guess;
        System.out.println("Guess word");
        System.out.println(sb.toString() + " (" + word.length() + ")");
        while (count < 5) {
            guess = sc.next();
            if (isNumeric(guess) && Integer.parseInt(guess) > 0 && Integer.parseInt(guess) < word.length())
                giveLetters(Integer.parseInt(guess));
            if (!isNumeric(guess)) {
                answer = checkWord(guess);
                if (answer)
                    break;
            }
        }
        if (answer == false)
            System.out.println("Too many wrong answers, The word was: " + word);
    }

    private boolean checkWord(String guess) {
        if (guess.equals(word.toString())) {
            System.out.println("Correct! You win! The word was: " + word);
            return true;
        }
        System.out.println("Wrong answer");
        count++;
        return false;
    }

    private void printOneLetter() {
        int letter = 0;
        boolean cantPrint = true;
        while (cantPrint) {
            letter = (int) (Math.random() * word.length());
            if (sb.charAt(letter) == '_' || sb.toString().equals(word.toString()))
                cantPrint = false;
        }
        sb.setCharAt(letter, word.charAt(letter));
    }

    private void giveLetters(int params) {
        for (int i = 0; i < params; i++) {
            printOneLetter();
        }
        System.out.println(sb.toString() + " (" + word.length() + ")");
    }

    private static boolean isNumeric(String guess) {
        if (guess == null)
            return false;
        try {
            Integer.parseInt(guess);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
