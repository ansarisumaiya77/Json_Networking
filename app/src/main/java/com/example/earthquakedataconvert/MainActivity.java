package com.example.earthquakedataconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String JSON_Data = "{ \n" +
            "   \"type\":\"FeatureCollection\",\n" +
            "   \"metadata\":{ \n" +
            "      \"generated\":1574857068000,\n" +
            "      \"url\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2019-01-02&minmagnitude=7&limit=25\",\n" +
            "      \"title\":\"USGS Earthquakes\",\n" +
            "      \"status\":200,\n" +
            "      \"api\":\"1.8.1\",\n" +
            "      \"limit\":25,\n" +
            "      \"offset\":1,\n" +
            "      \"count\":25\n" +
            "   },\n" +
            "   \"features\":[ \n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7,\n" +
            "            \"place\":\"96km ESE of Pondaguitan, Philippines\",\n" +
            "            \"time\":1546054749740,\n" +
            "            \"updated\":1572366014141,\n" +
            "            \"tz\":480,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000iyta\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000iyta&format=geojson\",\n" +
            "            \"felt\":126,\n" +
            "            \"cdi\":5.2000000000000002,\n" +
            "            \"mmi\":5.1299999999999999,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":819,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000iyta\",\n" +
            "            \"ids\":\",at00pkhbhc,pt18363000,us2000iyta,\",\n" +
            "            \"sources\":\",at,pt,us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,geoserve,ground-failure,impact-link,losspager,moment-tensor,origin,phase-data,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":1.7689999999999999,\n" +
            "            \"rms\":1.45,\n" +
            "            \"gap\":21,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.0 - 96km ESE of Pondaguitan, Philippines\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               126.9209,\n" +
            "               5.8982999999999999,\n" +
            "               60.210000000000001\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000iyta\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.2999999999999998,\n" +
            "            \"place\":\"83km W of Nikol'skoye, Russia\",\n" +
            "            \"time\":1545325315150,\n" +
            "            \"updated\":1550953303040,\n" +
            "            \"tz\":660,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000ivfw\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000ivfw&format=geojson\",\n" +
            "            \"felt\":6,\n" +
            "            \"cdi\":3.2000000000000002,\n" +
            "            \"mmi\":6.9199999999999999,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":822,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000ivfw\",\n" +
            "            \"ids\":\",us2000ivfw,pt18354000,at00pk1on9,\",\n" +
            "            \"sources\":\",us,pt,at,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,ground-failure,impact-link,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":4.1260000000000003,\n" +
            "            \"rms\":0.79000000000000004,\n" +
            "            \"gap\":23,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.3 - 83km W of Nikol'skoye, Russia\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               164.69929999999999,\n" +
            "               55.099899999999998,\n" +
            "               16.559999999999999\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000ivfw\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.0999999999999996,\n" +
            "            \"place\":\"54km N of Bristol Island, South Sandwich Islands\",\n" +
            "            \"time\":1544495189420,\n" +
            "            \"updated\":1550356143040,\n" +
            "            \"tz\":-120,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000isc8\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000isc8&format=geojson\",\n" +
            "            \"felt\":null,\n" +
            "            \"cdi\":null,\n" +
            "            \"mmi\":5.3600000000000003,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":776,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000isc8\",\n" +
            "            \"ids\":\",us2000isc8,pt18345000,at00pjjw49,\",\n" +
            "            \"sources\":\",us,pt,at,\",\n" +
            "            \"types\":\",general-text,geoserve,impact-link,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":7.0430000000000001,\n" +
            "            \"rms\":0.92000000000000004,\n" +
            "            \"gap\":20,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.1 - 54km N of Bristol Island, South Sandwich Islands\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -26.3856,\n" +
            "               -58.544600000000003,\n" +
            "               133\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000isc8\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.5,\n" +
            "            \"place\":\"165km ESE of Tadine, New Caledonia\",\n" +
            "            \"time\":1543983488420,\n" +
            "            \"updated\":1550346740040,\n" +
            "            \"tz\":660,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us1000i2gt\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us1000i2gt&format=geojson\",\n" +
            "            \"felt\":17,\n" +
            "            \"cdi\":3.3999999999999999,\n" +
            "            \"mmi\":6.3099999999999996,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":871,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"1000i2gt\",\n" +
            "            \"ids\":\",at00pj8xaa,pt18339001,us1000i2gt,\",\n" +
            "            \"sources\":\",at,pt,us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,ground-failure,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":2.4049999999999998,\n" +
            "            \"rms\":0.73999999999999999,\n" +
            "            \"gap\":18,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.5 - 165km ESE of Tadine, New Caledonia\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               169.42660000000001,\n" +
            "               -21.9496,\n" +
            "               10\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us1000i2gt\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.0999999999999996,\n" +
            "            \"place\":\"14km NNW of Anchorage, Alaska\",\n" +
            "            \"time\":1543598969330,\n" +
            "            \"updated\":1573839586995,\n" +
            "            \"tz\":-540,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/ak018fcnsk91\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=ak018fcnsk91&format=geojson\",\n" +
            "            \"felt\":2525,\n" +
            "            \"cdi\":7.5999999999999996,\n" +
            "            \"mmi\":7.7000000000000002,\n" +
            "            \"alert\":\"orange\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":1760,\n" +
            "            \"net\":\"ak\",\n" +
            "            \"code\":\"018fcnsk91\",\n" +
            "            \"ids\":\",ak20419010,us1000hyfh,at00pj0ol4,pt18334000,ak018fcnsk91,\",\n" +
            "            \"sources\":\",ak,us,at,pt,ak,\",\n" +
            "            \"types\":\",associate,dyfi,finite-fault,general-link,general-text,geoserve,ground-failure,impact-link,impact-text,losspager,moment-tensor,oaf,origin,phase-data,poster,scitech-link,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":null,\n" +
            "            \"rms\":1.04,\n" +
            "            \"gap\":null,\n" +
            "            \"magType\":\"mw\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.1 - 14km NNW of Anchorage, Alaska\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -149.95519999999999,\n" +
            "               61.346400000000003,\n" +
            "               46.700000000000003\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"ak018fcnsk91\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7,\n" +
            "            \"place\":\"118km E of Kimbe, Papua New Guinea\",\n" +
            "            \"time\":1539204500100,\n" +
            "            \"updated\":1557178557711,\n" +
            "            \"tz\":600,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us1000haa3\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us1000haa3&format=geojson\",\n" +
            "            \"felt\":6,\n" +
            "            \"cdi\":6.2999999999999998,\n" +
            "            \"mmi\":7.4699999999999998,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":758,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"1000haa3\",\n" +
            "            \"ids\":\",us1000haa3,pt18283003,at00pgehsk,\",\n" +
            "            \"sources\":\",us,pt,at,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,ground-failure,impact-link,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":1.778,\n" +
            "            \"rms\":1.1000000000000001,\n" +
            "            \"gap\":18,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.0 - 118km E of Kimbe, Papua New Guinea\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               151.2046,\n" +
            "               -5.7012,\n" +
            "               39\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us1000haa3\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.5,\n" +
            "            \"place\":\"70km N of Palu, Indonesia\",\n" +
            "            \"time\":1538128965250,\n" +
            "            \"updated\":1569927919616,\n" +
            "            \"tz\":480,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us1000h3p4\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us1000h3p4&format=geojson\",\n" +
            "            \"felt\":31,\n" +
            "            \"cdi\":9.0999999999999996,\n" +
            "            \"mmi\":9.2400000000000002,\n" +
            "            \"alert\":\"red\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":2028,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"1000h3p4\",\n" +
            "            \"ids\":\",us1000h3p4,\",\n" +
            "            \"sources\":\",us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,ground-failure,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,trump-shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":1.649,\n" +
            "            \"rms\":1,\n" +
            "            \"gap\":13,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.5 - 70km N of Palu, Indonesia\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               119.8462,\n" +
            "               -0.25590000000000002,\n" +
            "               20\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us1000h3p4\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.9000000000000004,\n" +
            "            \"place\":\"102km ESE of Suva, Fiji\",\n" +
            "            \"time\":1536248958710,\n" +
            "            \"updated\":1555994727592,\n" +
            "            \"tz\":720,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000h9e2\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000h9e2&format=geojson\",\n" +
            "            \"felt\":26,\n" +
            "            \"cdi\":7,\n" +
            "            \"mmi\":3.7599999999999998,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":978,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000h9e2\",\n" +
            "            \"ids\":\",at00pen5a4,pt18249001,us2000h9e2,\",\n" +
            "            \"sources\":\",at,pt,us,\",\n" +
            "            \"types\":\",dyfi,general-text,geoserve,impact-link,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":1.431,\n" +
            "            \"rms\":1.0700000000000001,\n" +
            "            \"gap\":12,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.9 - 102km ESE of Suva, Fiji\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               179.3502,\n" +
            "               -18.474299999999999,\n" +
            "               670.80999999999995\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000h9e2\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.0999999999999996,\n" +
            "            \"place\":\"202km WNW of Ile Hunter, New Caledonia\",\n" +
            "            \"time\":1535514716100,\n" +
            "            \"updated\":1541615824040,\n" +
            "            \"tz\":660,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us1000gjaz\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us1000gjaz&format=geojson\",\n" +
            "            \"felt\":2,\n" +
            "            \"cdi\":2,\n" +
            "            \"mmi\":4.5099999999999998,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":776,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"1000gjaz\",\n" +
            "            \"ids\":\",at00pe7eqn,us1000gjaz,pt18241000,\",\n" +
            "            \"sources\":\",at,us,pt,\",\n" +
            "            \"types\":\",dyfi,general-text,geoserve,ground-failure,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":2.548,\n" +
            "            \"rms\":0.97999999999999998,\n" +
            "            \"gap\":23,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.1 - 202km WNW of Ile Hunter, New Caledonia\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               170.12620000000001,\n" +
            "               -22.029499999999999,\n" +
            "               21.43\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us1000gjaz\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.0999999999999996,\n" +
            "            \"place\":\"140km WNW of Iberia, Peru\",\n" +
            "            \"time\":1535101448250,\n" +
            "            \"updated\":1541094657040,\n" +
            "            \"tz\":-300,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us1000ggj4\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us1000ggj4&format=geojson\",\n" +
            "            \"felt\":null,\n" +
            "            \"cdi\":null,\n" +
            "            \"mmi\":2.9300000000000002,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":0,\n" +
            "            \"sig\":776,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"1000ggj4\",\n" +
            "            \"ids\":\",us1000ggj4,\",\n" +
            "            \"sources\":\",us,\",\n" +
            "            \"types\":\",general-text,geoserve,ground-failure,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":3.77,\n" +
            "            \"rms\":0.98999999999999999,\n" +
            "            \"gap\":12,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.1 - 140km WNW of Iberia, Peru\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -70.828400000000002,\n" +
            "               -11.035500000000001,\n" +
            "               630\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us1000ggj4\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.2999999999999998,\n" +
            "            \"place\":\"24km ENE of Rio Caribe, Venezuela\",\n" +
            "            \"time\":1534887107600,\n" +
            "            \"updated\":1544118057591,\n" +
            "            \"tz\":-270,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us1000gez7\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us1000gez7&format=geojson\",\n" +
            "            \"felt\":1319,\n" +
            "            \"cdi\":7.5999999999999996,\n" +
            "            \"mmi\":6.71,\n" +
            "            \"alert\":\"yellow\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":1580,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"1000gez7\",\n" +
            "            \"ids\":\",at00pdtygt,pt18233000,us1000gez7,\",\n" +
            "            \"sources\":\",at,pt,us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,ground-failure,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":1.8220000000000001,\n" +
            "            \"rms\":1.1000000000000001,\n" +
            "            \"gap\":15,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.3 - 24km ENE of Rio Caribe, Venezuela\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -62.901899999999998,\n" +
            "               10.773099999999999,\n" +
            "               146.81999999999999\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us1000gez7\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":8.1999999999999993,\n" +
            "            \"place\":\"286km NNE of Ndoi Island, Fiji\",\n" +
            "            \"time\":1534637980670,\n" +
            "            \"updated\":1566195522402,\n" +
            "            \"tz\":-720,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us1000gcii\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us1000gcii&format=geojson\",\n" +
            "            \"felt\":22,\n" +
            "            \"cdi\":5,\n" +
            "            \"mmi\":4.6200000000000001,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":1045,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"1000gcii\",\n" +
            "            \"ids\":\",at00pdom8q,pt18231000,us1000gcii,\",\n" +
            "            \"sources\":\",at,pt,us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":3.6299999999999999,\n" +
            "            \"rms\":0.79000000000000004,\n" +
            "            \"gap\":13,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 8.2 - 286km NNE of Ndoi Island, Fiji\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -178.15299999999999,\n" +
            "               -18.112500000000001,\n" +
            "               600\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us1000gcii\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.5,\n" +
            "            \"place\":\"83km SW of Porgera, Papua New Guinea\",\n" +
            "            \"time\":1519580684140,\n" +
            "            \"updated\":1539813289859,\n" +
            "            \"tz\":600,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000d7q6\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000d7q6&format=geojson\",\n" +
            "            \"felt\":86,\n" +
            "            \"cdi\":9,\n" +
            "            \"mmi\":8.8800000000000008,\n" +
            "            \"alert\":\"yellow\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":943,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000d7q6\",\n" +
            "            \"ids\":\",pt18056001,at00p4pvyj,us2000d7q6,\",\n" +
            "            \"sources\":\",pt,at,us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-link,general-text,geoserve,ground-failure,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":5.4800000000000004,\n" +
            "            \"rms\":1.3100000000000001,\n" +
            "            \"gap\":17,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.5 - 83km SW of Porgera, Papua New Guinea\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               142.75360000000001,\n" +
            "               -6.0698999999999996,\n" +
            "               25.210000000000001\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000d7q6\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.2000000000000002,\n" +
            "            \"place\":\"3km S of San Pedro Jicayan, Mexico\",\n" +
            "            \"time\":1518824379280,\n" +
            "            \"updated\":1573085108953,\n" +
            "            \"tz\":-360,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000d3km\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000d3km&format=geojson\",\n" +
            "            \"felt\":822,\n" +
            "            \"cdi\":7.4000000000000004,\n" +
            "            \"mmi\":6.9900000000000002,\n" +
            "            \"alert\":\"yellow\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":1406,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000d3km\",\n" +
            "            \"ids\":\",at00p49oe8,pt18047000,us2000d3km,\",\n" +
            "            \"sources\":\",at,pt,us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-link,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":0.14199999999999999,\n" +
            "            \"rms\":1.23,\n" +
            "            \"gap\":82,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.2 - 3km S of San Pedro Jicayan, Mexico\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -97.978700000000003,\n" +
            "               16.3855,\n" +
            "               22\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000d3km\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.9000000000000004,\n" +
            "            \"place\":\"280km SE of Kodiak, Alaska\",\n" +
            "            \"time\":1516699900890,\n" +
            "            \"updated\":1561995255502,\n" +
            "            \"tz\":-600,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000cmy3\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000cmy3&format=geojson\",\n" +
            "            \"felt\":2440,\n" +
            "            \"cdi\":9.0999999999999996,\n" +
            "            \"mmi\":4.8399999999999999,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":1870,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000cmy3\",\n" +
            "            \"ids\":\",ak18173527,us2000cmy3,at00p3054t,pt18023001,ak18173519,ak018126wm5v,\",\n" +
            "            \"sources\":\",ak,us,at,pt,ak,ak,\",\n" +
            "            \"types\":\",associate,dyfi,finite-fault,general-link,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,trump-origin,trump-shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":2.585,\n" +
            "            \"rms\":0.77000000000000002,\n" +
            "            \"gap\":30,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.9 - 280km SE of Kodiak, Alaska\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -149.16579999999999,\n" +
            "               56.003900000000002,\n" +
            "               14.06\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000cmy3\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.0999999999999996,\n" +
            "            \"place\":\"38km SSW of Acari, Peru\",\n" +
            "            \"time\":1515921525540,\n" +
            "            \"updated\":1551445926320,\n" +
            "            \"tz\":-300,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000cjfy\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000cjfy&format=geojson\",\n" +
            "            \"felt\":348,\n" +
            "            \"cdi\":8.5,\n" +
            "            \"mmi\":6.4400000000000004,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":1071,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000cjfy\",\n" +
            "            \"ids\":\",at00p2jgj9,pt18014000,us2000cjfy,\",\n" +
            "            \"sources\":\",at,pt,us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":4.29,\n" +
            "            \"rms\":1.2,\n" +
            "            \"gap\":23,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.1 - 38km SSW of Acari, Peru\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -74.709199999999996,\n" +
            "               -15.7675,\n" +
            "               39\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000cjfy\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.5,\n" +
            "            \"place\":\"44km E of Great Swan Island, Honduras\",\n" +
            "            \"time\":1515552693290,\n" +
            "            \"updated\":1546037544264,\n" +
            "            \"tz\":-360,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us1000c2zy\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us1000c2zy&format=geojson\",\n" +
            "            \"felt\":1058,\n" +
            "            \"cdi\":8.3000000000000007,\n" +
            "            \"mmi\":7.29,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":1695,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"1000c2zy\",\n" +
            "            \"ids\":\",at00p2bjxw,pt18010000,us1000c2zy,\",\n" +
            "            \"sources\":\",at,pt,us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-link,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":4.5810000000000004,\n" +
            "            \"rms\":0.81999999999999995,\n" +
            "            \"gap\":12,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.5 - 44km E of Great Swan Island, Honduras\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -83.519999999999996,\n" +
            "               17.482500000000002,\n" +
            "               19\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us1000c2zy\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7,\n" +
            "            \"place\":\"85km ENE of Tadine, New Caledonia\",\n" +
            "            \"time\":1511131409250,\n" +
            "            \"updated\":1518573665040,\n" +
            "            \"tz\":660,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000brlf\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000brlf&format=geojson\",\n" +
            "            \"felt\":44,\n" +
            "            \"cdi\":3.7999999999999998,\n" +
            "            \"mmi\":6.4500000000000002,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":771,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000brlf\",\n" +
            "            \"ids\":\",at00ozosgj,us2000brlf,pt17323002,\",\n" +
            "            \"sources\":\",at,us,pt,\",\n" +
            "            \"types\":\",dyfi,general-text,geoserve,impact-link,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":0.61699999999999999,\n" +
            "            \"rms\":0.65000000000000002,\n" +
            "            \"gap\":14,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.0 - 85km ENE of Tadine, New Caledonia\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               168.67150000000001,\n" +
            "               -21.3246,\n" +
            "               10\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000brlf\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.2999999999999998,\n" +
            "            \"place\":\"29km S of Halabjah, Iraq\",\n" +
            "            \"time\":1510510697180,\n" +
            "            \"updated\":1546782788642,\n" +
            "            \"tz\":210,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000bmcg\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000bmcg&format=geojson\",\n" +
            "            \"felt\":2257,\n" +
            "            \"cdi\":7.9000000000000004,\n" +
            "            \"mmi\":8.1999999999999993,\n" +
            "            \"alert\":\"red\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":0,\n" +
            "            \"sig\":2790,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000bmcg\",\n" +
            "            \"ids\":\",us2000bmcg,\",\n" +
            "            \"sources\":\",us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":0.28399999999999997,\n" +
            "            \"rms\":1.29,\n" +
            "            \"gap\":33,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.3 - 29km S of Halabjah, Iraq\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               45.959200000000003,\n" +
            "               34.910899999999998,\n" +
            "               19\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000bmcg\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.0999999999999996,\n" +
            "            \"place\":\"1km E of Ayutla, Mexico\",\n" +
            "            \"time\":1505844878090,\n" +
            "            \"updated\":1572359422942,\n" +
            "            \"tz\":-360,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000ar20\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000ar20&format=geojson\",\n" +
            "            \"felt\":2219,\n" +
            "            \"cdi\":9.0999999999999996,\n" +
            "            \"mmi\":7.6399999999999997,\n" +
            "            \"alert\":null,\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":0,\n" +
            "            \"sig\":1686,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000ar20\",\n" +
            "            \"ids\":\",us2000ar20,\",\n" +
            "            \"sources\":\",us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-link,general-text,geoserve,impact-text,losspager,moment-tensor,origin,phase-data,poster,scitech-link,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":0.98399999999999999,\n" +
            "            \"rms\":1.1399999999999999,\n" +
            "            \"gap\":23,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.1 - 1km E of Ayutla, Mexico\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -98.488699999999994,\n" +
            "               18.549900000000001,\n" +
            "               48\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000ar20\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":8.1999999999999993,\n" +
            "            \"place\":\"101km SSW of Tres Picos, Mexico\",\n" +
            "            \"time\":1504846159180,\n" +
            "            \"updated\":1568258723535,\n" +
            "            \"tz\":-360,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us2000ahv0\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us2000ahv0&format=geojson\",\n" +
            "            \"felt\":3072,\n" +
            "            \"cdi\":9.0999999999999996,\n" +
            "            \"mmi\":8.5700000000000003,\n" +
            "            \"alert\":\"red\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":2910,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"2000ahv0\",\n" +
            "            \"ids\":\",at00ovy2q7,pt17251000,us2000ahv0,\",\n" +
            "            \"sources\":\",at,pt,us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-link,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,scitech-link,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":0.94399999999999995,\n" +
            "            \"rms\":1.22,\n" +
            "            \"gap\":22,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 8.2 - 101km SSW of Tres Picos, Mexico\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -93.899299999999997,\n" +
            "               15.0222,\n" +
            "               47.390000000000001\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us2000ahv0\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.7000000000000002,\n" +
            "            \"place\":\"202km ESE of Nikol'skoye, Russia\",\n" +
            "            \"time\":1500334453740,\n" +
            "            \"updated\":1539813216593,\n" +
            "            \"tz\":660,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us20009x42\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20009x42&format=geojson\",\n" +
            "            \"felt\":3,\n" +
            "            \"cdi\":7.7999999999999998,\n" +
            "            \"mmi\":6.9699999999999998,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":914,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"20009x42\",\n" +
            "            \"ids\":\",pt17198005,us20009x42,at00ot9dh6,\",\n" +
            "            \"sources\":\",pt,us,at,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,impact-link,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":3.5640000000000001,\n" +
            "            \"rms\":0.68000000000000005,\n" +
            "            \"gap\":13,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.7 - 202km ESE of Nikol'skoye, Russia\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               168.857,\n" +
            "               54.443399999999997,\n" +
            "               10\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us20009x42\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.9000000000000004,\n" +
            "            \"place\":\"35km WNW of Panguna, Papua New Guinea\",\n" +
            "            \"time\":1485059422960,\n" +
            "            \"updated\":1539813199164,\n" +
            "            \"tz\":660,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us10007uph\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10007uph&format=geojson\",\n" +
            "            \"felt\":30,\n" +
            "            \"cdi\":9.0999999999999996,\n" +
            "            \"mmi\":8.2400000000000002,\n" +
            "            \"alert\":\"yellow\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":987,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"10007uph\",\n" +
            "            \"ids\":\",pt17022050,us10007uph,at00ok5z6p,\",\n" +
            "            \"sources\":\",pt,us,at,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":3.625,\n" +
            "            \"rms\":1.22,\n" +
            "            \"gap\":9,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.9 - 35km WNW of Panguna, Papua New Guinea\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               155.17179999999999,\n" +
            "               -6.2464000000000004,\n" +
            "               135\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us10007uph\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.2999999999999998,\n" +
            "            \"place\":\"189km SSE of Tabiauan, Philippines\",\n" +
            "            \"time\":1484028828140,\n" +
            "            \"updated\":1494178928352,\n" +
            "            \"tz\":480,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us10007s9c\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10007s9c&format=geojson\",\n" +
            "            \"felt\":50,\n" +
            "            \"cdi\":5.9000000000000004,\n" +
            "            \"mmi\":3.3300000000000001,\n" +
            "            \"alert\":\"green\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":849,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"10007s9c\",\n" +
            "            \"ids\":\",at00ojjvz0,us10007s9c,\",\n" +
            "            \"sources\":\",at,us,\",\n" +
            "            \"types\":\",dyfi,general-text,geoserve,impact-link,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":3.8130000000000002,\n" +
            "            \"rms\":1.05,\n" +
            "            \"gap\":18,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.3 - 189km SSE of Tabiauan, Philippines\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               122.61709999999999,\n" +
            "               4.4782000000000002,\n" +
            "               627.16999999999996\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us10007s9c\"\n" +
            "      },\n" +
            "      { \n" +
            "         \"type\":\"Feature\",\n" +
            "         \"properties\":{ \n" +
            "            \"mag\":7.5999999999999996,\n" +
            "            \"place\":\"41km SW of Puerto Quellon, Chile\",\n" +
            "            \"time\":1482675747010,\n" +
            "            \"updated\":1540052027271,\n" +
            "            \"tz\":-240,\n" +
            "            \"url\":\"https://earthquake.usgs.gov/earthquakes/eventpage/us10007mn3\",\n" +
            "            \"detail\":\"https://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us10007mn3&format=geojson\",\n" +
            "            \"felt\":258,\n" +
            "            \"cdi\":9.0999999999999996,\n" +
            "            \"mmi\":7.7999999999999998,\n" +
            "            \"alert\":\"yellow\",\n" +
            "            \"status\":\"reviewed\",\n" +
            "            \"tsunami\":1,\n" +
            "            \"sig\":1123,\n" +
            "            \"net\":\"us\",\n" +
            "            \"code\":\"10007mn3\",\n" +
            "            \"ids\":\",at00oiqvxe,pt16360050,us10007mn3,\",\n" +
            "            \"sources\":\",at,pt,us,\",\n" +
            "            \"types\":\",dyfi,finite-fault,general-text,geoserve,impact-link,impact-text,losspager,moment-tensor,origin,phase-data,poster,shakemap,\",\n" +
            "            \"nst\":null,\n" +
            "            \"dmin\":0.35499999999999998,\n" +
            "            \"rms\":0.79000000000000004,\n" +
            "            \"gap\":29,\n" +
            "            \"magType\":\"mww\",\n" +
            "            \"type\":\"earthquake\",\n" +
            "            \"title\":\"M 7.6 - 41km SW of Puerto Quellon, Chile\"\n" +
            "         },\n" +
            "         \"geometry\":{ \n" +
            "            \"type\":\"Point\",\n" +
            "            \"coordinates\":[ \n" +
            "               -73.941299999999998,\n" +
            "               -43.406399999999998,\n" +
            "               38\n" +
            "            ]\n" +
            "         },\n" +
            "         \"id\":\"us10007mn3\"\n" +
            "      }\n" +
            "   ],\n" +
            "   \"bbox\":[ \n" +
            "      -178.153,\n" +
            "      -58.5446,\n" +
            "      10,\n" +
            "      179.3502,\n" +
            "      61.3464,\n" +
            "      670.81\n" +
            "   ]\n" +
            "}\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONConvert convert = new JSONConvert();
        ArrayList<Earthquake> arraylist = convert.ConvertJson(JSON_Data);
        listView = findViewById(R.id.list);
        ArrayAdapter<Earthquake> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arraylist);
        listView.setAdapter(adapter);
    }
}
