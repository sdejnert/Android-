package com.example.sebax.cozmoimautem;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListProblem extends AppCompatActivity {
    ActionBar actionBar;
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_problem);
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#726d6d")));

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        prepareListData();

        listAdapter = new ExpamdableListAdapter(this, listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);

        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();
                return false;
            }
        });
    }

    private void prepareListData(){
        listDataHeader = new ArrayList<>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add("Wyświetla się kontrolka \"Check engine\" ");

        listDataHeader.add("Przy hamowaniu trzęsie kierownicą");
        listDataHeader.add("Przy dużych prędkościach trzęsie kierownicą ");
        listDataHeader.add("Przy dodaniu gazu na skręconych kołach słychać dźwięk \"trykania\" bądź strzelania");
        listDataHeader.add("Podczas przyśpieszania bądź hamowania samochód ściąga");
        listDataHeader.add("Samochód jedzie z większym oporem");
        listDataHeader.add("Twardy pedał hamulca");
        listDataHeader.add("Miękki pedał hamulca, samochód nie hamuje");
        listDataHeader.add("Samochód nie odpala, rozrusznik się kręci");
        listDataHeader.add("Samochód nie odpala, rozrusznik się nie kręci");
        listDataHeader.add("Maź pod korkiem od wlewu oleju lub na bagnecie");
        listDataHeader.add("Samochód nie nagrzewa się lub długo się nagrzewa");
        listDataHeader.add("Samochód się przegrzewa");
        listDataHeader.add("Znikający olej");
        listDataHeader.add("Parujące szyby");
        listDataHeader.add("Szum, huczenie podczas jazdy");
        listDataHeader.add("Głośne wycie podczas obortu kierownicą");
        listDataHeader.add("Szarpanie podczas skręcania");
        listDataHeader.add("Stuki w zawieszeniu na dziurach");
        listDataHeader.add("Stuki podczas krókich ruchów kierownicą na postoju");
        listDataHeader.add("Samochód podczas jazdy ściąga w prawo lub lewo(nie koleiny)");
        listDataHeader.add("Auto buja na zakrętach");
        listDataHeader.add("Zapach spalin w samochodzie");

        List<String> checkE = new ArrayList<String>();
        checkE.add("Silnik pracuje normalnie, ale świeci się kontrolka. Czasem sterownik silnika dostaje błędną informację z czujnika. \n" +
        "Silnik pracuje normalnie, lecz ma mniej mocy i więcej pali. Trzeba znaleźć i usunąć przyczynę, samo skasowanie błedu pomoże tylko na chwilę.");
        checkE.add("Silnik pracuje gorzej, nie ma mocy, pali się kontrolka. Oznacza to, że samochód działa w tybie awaryjnym. \n" + "Należy udać się do mechanika w celu znalezienia usterki" +
                "i usunięcia jej");
        checkE.add("Najczęstrzymi przyczynami są: uszkodzona turbina, zablokowany zawór EGR, usterka wtrysków, uszkodzony filtr DPF lub katalizator, awaria sondy lambda");
        List<String> samochodSciaga = new ArrayList<String>();



        List<String> przyHamowaniu = new ArrayList<String>();
        przyHamowaniu.add("Krzywe tarcze hamulcowe(wymiana)");
        przyHamowaniu.add("Zużyte elementy zawieszenia(wymiana)");

        List<String> przyDuzych = new ArrayList<String>();
        przyDuzych.add("Źle wywyażone opony(wyważenie u wulkanizatora)");
        przyDuzych.add("Zużyte elementy zawieszenia(wymiana)");
        przyDuzych.add("Zła geometria kół(ustawienie u specjalisty, nie każdy mechanik to ustawi)");


        List<String> przyDodaniu = new ArrayList<String>();
        przyDodaniu.add("Uszkodzony przegub zewnętrzny(wymiana)");

        List<String> podczasPrzyspieszania = new ArrayList<String>();
        podczasPrzyspieszania.add("Zużyte elementy zawieszenia/ tuleje/ wahacze(wymiana)");
        podczasPrzyspieszania.add("Nierówna siła hamowania na jednej z osi");

        List<String> opor = new ArrayList<String>();
        opor.add("Zła geometria kół(ustawienie u specjalisty, nie każdy mechanik to ustawi)");
        opor.add("Jeśli dźwignia hamulca ręcznego jest luźna oznacza to albo zablokowanie się linki \n" +
                "w pancerzu lub zablokowany zacisk hamulców z tyłu, zbyt mocno naciągnięta linka(naprawa, wymiana linki)");
        opor.add("Zacisk hamulców(wymiana lub regeneracja)");

        List<String> twardy = new ArrayList<String>();
        twardy.add("Niedziałająca lub nieszczelna pompa vacum(regeneracja lub wymiana)");
        twardy.add("Nieszczelne serwo(wymiana)");
        twardy.add("Nieszczelne przewody ciśnienia od pompy vacum do serwo(wymiana)");

        List<String> miekki = new ArrayList<String>();
        miekki.add("Dziurawy przewód hamulcowy, można sprawdzić czy płyn nie wycieka pod samochodem, sprawdzić ilość płynu hamulcowego(Wymiana zniszczonych i uszkodzonych przewodów)");
        miekki.add("Ilość płyn hamulcowego(dolać, ale płyn z normą wskazaną przez producenta)");

        List<String> nOdpalaZRoz = new ArrayList<String>();
        nOdpalaZRoz.add("Uszkodzona pompa paliwa(wymiana lub regeneracja)");
        nOdpalaZRoz.add("Zalane świece i silnik");
        nOdpalaZRoz.add("Uszkodzone wtryski paliwa(wymiana bądź regeneracja)");
        nOdpalaZRoz.add("Problemy z immobilaizerem(wizyta elektromechanika)");
        nOdpalaZRoz.add("Zapchany filtr paliwa(wymiana)");
        nOdpalaZRoz.add("Słabe sprężanie silnika(remont silnika lub wymiana na sprawny)");
        nOdpalaZRoz.add("Zimą słaba jakość paliwa, zamarzanie w filtrze lub baku(ogrzanie)");

        List<String> nOdpalaBezRoz = new ArrayList<String>();
        nOdpalaBezRoz.add("Przepalony bezpiecznik(wymiana)");
        nOdpalaBezRoz.add("Słaby akumulator(podładowanie prostownikiem(prędzej czy później trzeba kupić nowy) lub wymiana na nowy");
        nOdpalaBezRoz.add("Uszkodzony rozrusznik(wymiana lub regeneracja)");
        nOdpalaBezRoz.add("Brak napięcia na rozruszniku, spowodowany uszkodzonymi kablami");

        List<String> maz = new ArrayList<String>();
        maz.add("Jeśli jest to duża ilość i ubywa płynu chłodniczego to jest to najprawdopodbniej uszczelka pod głowicą(wymiana uszczelki + planowanie głowicy");
        maz.add("Mała ilość może pojawić się w bardzo zimne dni, nie ma powodów do obaw");

        List<String> nieNagrzewa = new ArrayList<String>();
        nieNagrzewa.add("Termostat w pozycji otwartej(wymiana)");

        List<String> przegrzewa = new ArrayList<String>();
        przegrzewa.add("Termostat w pozycji zamkniętej(wymiana)");
        przegrzewa.add("Mała ilość płynu chłodniczego lub jego brak(dolewka płynu jaki zalecił producent samochodu)");
        przegrzewa.add("Uszkodzony wentylator chłodnicy(wymiana)");
        przegrzewa.add("Uszkodzona pompa wody(wymiana, zaleca się wymienić razem z rozrządem)");

        List<String> znikajacyOlej = new ArrayList<String>();
        znikajacyOlej .add("Nieszczelne pierścienie, olej jest spalany, niebieska chumrka za samochodem(remont silnika)");
        znikajacyOlej .add("Wyciek oleju, pod samochodem plama oleju ");

        List<String> parujaceSzyby = new ArrayList<String>();
        parujaceSzyby.add("Nieszczelność uszczelek, woda przedostaje się do wnętrza samochodu(zlokalizowanie nieszczelności, zlikwidowanie jej");
        parujaceSzyby.add("Wilgoć w samochodzie(w starą skarpetkę wsypać ryż i zostawić na jakiś czas w samochodzie)");
        parujaceSzyby.add("Zanieczyszczenie lub brak fitra kabinowego.");

        List<String> szum = new ArrayList<String>();
        szum.add("Wyrobione łożysko koła, dźwiek nasila się wraz z prędkością. Głośność wycia wzrasta na zakrętach w lewo wskazując na zużycie łożyska prawego i na odwrót.(wymiana) ");
        szum.add("Opony. Żeby rozpoznać czy to na 100% jest ogumienie, trzeba założyć inny komplet opon");
        szum.add("Geometria");

        List<String> glosneWycie = new ArrayList<String>();
        glosneWycie.add("Zatarta pompa wspomagania, zaleca się wymianę na nową. Czasem wystarczy regeneracja.");
        glosneWycie.add("Mała ilość płynu wspomagania(dolać, rodzaj płynu według wskazań producent");


        List<String> szarpanieSkret = new ArrayList<String>();
        szarpanieSkret.add("Zatarta pompa wspomagania, zaleca się wymianę na nową. Czasem wystarczy regeneracja.");
        szarpanieSkret.add("Mała ilość płynu wspomagania(dolać, rodzaj płynu według wskazań producent");
        szarpanieSkret.add("Luźny pasek pompy wspomagania, słychać piski z pod maski");
        szarpanieSkret.add("Drążek kierowniczy lub końcówka drążka(wymiana)");
        szarpanieSkret.add("Tuleje lub sworznie wahaczy. Jeśli kompniemy w koło, a ono się podda, oznacza to uszkodzenie któregoś z elementów wahacza(wymiana)");

        List<String> stukiDziury = new ArrayList<String>();
        stukiDziury.add("Amortyzatory, najlepiej sprawdzić je na SKP(wymiana)");
        stukiDziury.add("Poduszki amortyzatorów, najczęściej słychać je przy podskokach koła(wymiana)");
        stukiDziury.add("Pęknięta sprężyna, najlepiej sprawdzić je wizualnie, często jedna strona samochodu jest niżej(wymiana)");
        stukiDziury.add("Łącznik stabilizatora, charakteryzuje się stukaniem w okolicy kół podczas powolnego przejazdu po nierównościach(wymiana)");
        stukiDziury.add("Tuleje lub sworzeni na wahaczach, czasem może dojść do zerwania tulei, w większości przypadków jest już luźna guma.\n"+"Jeśli kompniemy w koło, a ono się podda, oznacza to uszkodzenie któregoś z elementów wahacza(wymiana)");
        List<String> stukiRuszanieKierownica = new ArrayList<String>();
        stukiRuszanieKierownica.add("Drążki kierownicze lub końcówki drążków(wymiana)");
        stukiRuszanieKierownica.add("Luzy na maglownicy(regeneracja lub wymiana)");
        stukiRuszanieKierownica.add("Krzyżak kolumny kierowniczej(wymiana)");

        samochodSciaga.add("1. Problemem może być ciśnienie opon. Należy najpierw sprawdzić czy ciśnienie w oponach na jednej osi jest takie samo.\n" +
                "Jeśli na każdej z opon jest różne ciśnienie \n" +
                "2. Różne opony na jednej osi mogą przyczynić się do ściągania samochodu. Należy sprawdzić czy:\n" +
                "-na jednej osi mamy założone opony z tej samej serii\n" +
                "-stan bieżnika opon jest taki sam ");
        samochodSciaga.add("Geometria\n" +
                "Jeśli samochód nie ma ustawionej geometrii kół, może być to przyczyną ściągania go.\n" +
                "Następstwem jazdy z źle ustawioną geometrią jest zniszczenie opon, zawieszenia lub układu przeniesienia napędu(przeguby).\n" +
                "Geometrie pojazdu należy sprawdzić w serwisie bądź warsztacie do tego przystosowanym. Najlepsze jest optyczne ustwienie zbieżności.");
        samochodSciaga.add("Zawieszenie\n" +
                "Luzy w zawieszeniu, również mogą przyczynić się do ww problemu. Najlepiej sprawdzić zawieszenie na stacji diagnostycznej.");
        samochodSciaga.add("Powypadkowy samochód\n" +
                "Samochody, które w przeszłości miały wypadek również może ściągać na bok");

        List<String> autoBuja = new ArrayList<String>();
        autoBuja.add("Słabe amortyzatory, najlepiej sprawdzić je na SKP(wymiana)");
        autoBuja.add("Słabe sprężyny(wymiana)");
        autoBuja.add("Łącznik stabilizatora(wymiana)");
        autoBuja.add("Tuleje lub sworzeni na wahaczach, czasem może dojść do zerwania tulei, w większości przypadków jest już luźna guma.\n" + "Jeśli kompniemy w koło, a ono się podda, oznacza to uszkodzenie któregoś z elementów wahacza(wymiana)");
        autoBuja.add("Złe ciśnienie w oponach");
        List<String> zapachSpalin = new ArrayList<String>();
        zapachSpalin.add("Nieszczelność układu wydechowego, jeśli na postoju. Czasem wystarczy zaspawać dziurę");
        zapachSpalin.add("Zatarty zawór EGR(wymiana lub czyszczenie");
        zapachSpalin.add("Uszczelka pod głowicą, jęsli włączymy ogrzewanie(wymiana)");

        listDataChild.put(listDataHeader.get(0), checkE);
        listDataChild.put(listDataHeader.get(1), przyHamowaniu);
        listDataChild.put(listDataHeader.get(2), przyDuzych);
        listDataChild.put(listDataHeader.get(3), przyDodaniu);
        listDataChild.put(listDataHeader.get(4), podczasPrzyspieszania);
        listDataChild.put(listDataHeader.get(5), opor);
        listDataChild.put(listDataHeader.get(6), twardy);
        listDataChild.put(listDataHeader.get(7), miekki);
        listDataChild.put(listDataHeader.get(8), nOdpalaZRoz);
        listDataChild.put(listDataHeader.get(9), nOdpalaBezRoz);
        listDataChild.put(listDataHeader.get(10), maz);
        listDataChild.put(listDataHeader.get(11), nieNagrzewa);
        listDataChild.put(listDataHeader.get(12), przegrzewa);
        listDataChild.put(listDataHeader.get(13), znikajacyOlej);
        listDataChild.put(listDataHeader.get(14), parujaceSzyby);
        listDataChild.put(listDataHeader.get(15), szum);
        listDataChild.put(listDataHeader.get(16), glosneWycie);
        listDataChild.put(listDataHeader.get(17), szarpanieSkret);
        listDataChild.put(listDataHeader.get(18), stukiDziury);
        listDataChild.put(listDataHeader.get(19), stukiRuszanieKierownica);
        listDataChild.put(listDataHeader.get(20), samochodSciaga);
        listDataChild.put(listDataHeader.get(21), autoBuja);
        listDataChild.put(listDataHeader.get(22), zapachSpalin);




    }

}