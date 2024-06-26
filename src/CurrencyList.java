//JSON created from Cambio.today's currency list

import java.util.Map;
import java.util.TreeMap;

import org.json.JSONObject;

public class CurrencyList {

	String currency = "{\r\n" + "    \"AUD\": \"Dollar australien\",\r\n" + "    \"ARS\": \"Peso argentin\",\r\n"
			+ "    \"BIF\": \"Franc burundais\",\r\n" + "    \"BHD\": \"Dinar bahreïni\",\r\n"
			+ "    \"BOB\": \"Boliviano bolivien\",\r\n" + "    \"AZN\": \"Manat azerbaïdjanais\",\r\n"
			+ "    \"BTN\": \"Ngultrum\",\r\n" + "    \"CRC\": \"Costa Rica Colón\",\r\n"
			+ "    \"CZK\": \"Couronne tchèque\",\r\n" + "    \"CNY\": \"Yuan Chinois\",\r\n"
			+ "    \"DKK\": \"Couronne danoise\",\r\n" + "    \"ETB\": \"Birr éthiopien\",\r\n"
			+ "    \"GNF\": \"Franc guinéen\",\r\n" + "    \"HRK\": \"Kuna croate\",\r\n"
			+ "    \"IDR\": \"Roupie indonésienne\",\r\n" + "    \"JMD\": \"Dollar Jamaïquain\",\r\n"
			+ "    \"KGS\": \"Som kirghize\",\r\n" + "    \"BAM\": \"Mark convertible\",\r\n"
			+ "    \"ANG\": \"Florin des Antilles néerlandaises\",\r\n" + "    \"BWP\": \"Botswana pula\",\r\n"
			+ "    \"BND\": \"Dollar de Brunei\",\r\n" + "    \"CDF\": \"Franc congolais\",\r\n"
			+ "    \"BZD\": \"Dollar Belize\",\r\n" + "    \"BYR\": \"Rouble biélorusse\",\r\n"
			+ "    \"BGN\": \"Lev bulgare\",\r\n" + "    \"CAD\": \"Dollar canadien\",\r\n"
			+ "    \"DZD\": \"Dinar algérien\",\r\n" + "    \"ERN\": \"Nakfa érythréenne\",\r\n"
			+ "    \"EGP\": \"Livre égyptienne\",\r\n" + "    \"FJD\": \"Dollar de Fidji\",\r\n"
			+ "    \"GBP\": \"Livre sterling\",\r\n" + "    \"FKP\": \"Îles Falkland livre\",\r\n"
			+ "    \"GTQ\": \"Quetzal guatémaltèque\",\r\n" + "    \"HKD\": \"Dollar de Hong Kong\",\r\n"
			+ "    \"HUF\": \"Forint hongrois\",\r\n" + "    \"IQD\": \"Dinar irakien\",\r\n"
			+ "    \"IRR\": \"Rial iranien\",\r\n" + "    \"KMF\": \"Franc comorien\",\r\n"
			+ "    \"KRW\": \"Won Sud-Coréen\",\r\n" + "    \"ALL\": \"Lek albanais\",\r\n"
			+ "    \"BDT\": \"Taka Bangladesh\",\r\n" + "    \"AWG\": \"Florin Arubais\",\r\n"
			+ "    \"BRL\": \"Real brésilien\",\r\n" + "    \"BCH\": \"Bitcoin Cash\",\r\n"
			+ "    \"BTC\": \"Bitcoin\",\r\n" + "    \"AED\": \"Dirham des Émirats Arabes Unis\",\r\n"
			+ "    \"AOA\": \"Kwanza angolais\",\r\n" + "    \"BSD\": \"Dollar bahamien\",\r\n"
			+ "    \"CLP\": \"Peso chilien\",\r\n" + "    \"BYN\": \"Rouble Biélorusse\",\r\n"
			+ "    \"COP\": \"Peso colombien\",\r\n" + "    \"CUP\": \"Peso cubain\",\r\n"
			+ "    \"ECS\": \"Sucre équatorien\",\r\n" + "    \"ETH\": \"Ethereum\",\r\n" + "    \"EUR\": \"Euro\",\r\n"
			+ "    \"HNL\": \"Lempiras\",\r\n" + "    \"GMD\": \"Dalasi gambien\",\r\n"
			+ "    \"GIP\": \"Livre de Gibraltar\",\r\n" + "    \"HTG\": \"Gourde haïtienne\",\r\n"
			+ "    \"JOD\": \"Dinar jordanien\",\r\n" + "    \"JPY\": \"Yen japonais\",\r\n"
			+ "    \"AFN\": \"Afghanistan afghani\",\r\n" + "    \"BBD\": \"Dollar de la Barbade\",\r\n"
			+ "    \"BMD\": \"Dollar des Bermudes\",\r\n" + "    \"AMD\": \"Dram arménien\",\r\n"
			+ "    \"CHF\": \"Franc suisse\",\r\n" + "    \"DJF\": \"Franc djiboutien\",\r\n"
			+ "    \"DOP\": \"Peso dominicain\",\r\n" + "    \"CVE\": \"Escudo Cap-Verdien\",\r\n"
			+ "    \"GEL\": \"Georgian Lari\",\r\n" + "    \"GHS\": \"Ghana Cedi\",\r\n"
			+ "    \"GYD\": \"Dollar Guyanais\",\r\n" + "    \"ILS\": \"Shekel Israelien\",\r\n"
			+ "    \"INR\": \"Roupie indienne\",\r\n" + "    \"ISK\": \"Couronne islandaise\",\r\n"
			+ "    \"KHR\": \"Riel cambodgien\",\r\n" + "    \"KES\": \"Shilling kenyan\",\r\n"
			+ "    \"KWD\": \"Dinar koweïtien\",\r\n" + "    \"KZT\": \"Tenge kazakh\",\r\n"
			+ "    \"LKR\": \"Roupie sri-lankaise\",\r\n" + "    \"MAD\": \"Dirham marocain\",\r\n"
			+ "    \"MMK\": \"Kyats birmans\",\r\n" + "    \"MNT\": \"Mongolie Tugrik\",\r\n"
			+ "    \"MUR\": \"Roupie mauricienne\",\r\n" + "    \"MRO\": \"Ouguiya mauritanien\",\r\n"
			+ "    \"MVR\": \"Rufiyaa des Maldives\",\r\n" + "    \"MWK\": \"Kwacha malawien\",\r\n"
			+ "    \"NZD\": \"Dollar néo-zélandais\",\r\n" + "    \"NPR\": \"Roupie népalaise\",\r\n"
			+ "    \"PHP\": \"Peso philippin\",\r\n" + "    \"PKR\": \"Roupie pakistanaise\",\r\n"
			+ "    \"RWF\": \"Franc rwandais\",\r\n" + "    \"LTC\": \"Litecoin\",\r\n"
			+ "    \"MXN\": \"Peso mexicain\",\r\n" + "    \"NIO\": \"Córdoba nicaraguayen\",\r\n"
			+ "    \"RON\": \"Leu roumain\",\r\n" + "    \"KPW\": \"Won nord-coréenne\",\r\n"
			+ "    \"KYD\": \"Dollar des îles Cayman\",\r\n" + "    \"LBP\": \"Livre libanais\",\r\n"
			+ "    \"LYD\": \"Dinar libyen\",\r\n" + "    \"LAK\": \"Lao kip\",\r\n"
			+ "    \"MGA\": \"Ariary malgache\",\r\n" + "    \"LRD\": \"Dollar libérien\",\r\n"
			+ "    \"MKD\": \"Denar de Macédoine\",\r\n" + "    \"LSL\": \"Lesotho loti\",\r\n"
			+ "    \"MOP\": \"Pataca\",\r\n" + "    \"MDL\": \"Leu moldave\",\r\n"
			+ "    \"NAD\": \"Dollar namibien\",\r\n" + "    \"MYR\": \"Ringgit malaisien\",\r\n"
			+ "    \"OMR\": \"Rial omanais\",\r\n" + "    \"NGN\": \"Naira nigérian\",\r\n"
			+ "    \"PGK\": \"Kina\",\r\n" + "    \"PAB\": \"Balboa panaméen\",\r\n"
			+ "    \"PEN\": \"Sol péruvien\",\r\n" + "    \"NOK\": \"Couronne norvégienne\",\r\n"
			+ "    \"PLN\": \"Zloty polonais\",\r\n" + "    \"PYG\": \"Guaraní paraguayen\",\r\n"
			+ "    \"QAR\": \"Qatari Rial\",\r\n" + "    \"SBD\": \"Îles Salomon Dollar\",\r\n"
			+ "    \"SAR\": \"Riyal saoudien\",\r\n" + "    \"SGD\": \"Dollar de Singapour\",\r\n"
			+ "    \"SLL\": \"Sierra-léonais\",\r\n" + "    \"THB\": \"Baht thaïlandais\",\r\n"
			+ "    \"TWD\": \"Dollar de Taïwan\",\r\n" + "    \"UAH\": \"Hryvnia ukrainienne\",\r\n"
			+ "    \"UGX\": \"Shilling ougandais\",\r\n" + "    \"SRD\": \"Dollar surinamais\",\r\n"
			+ "    \"STD\": \"São Tomé e Príncipe et dobra\",\r\n" + "    \"TRY\": \"Livre turque\",\r\n"
			+ "    \"TTD\": \"Trinidad\",\r\n" + "    \"TOP\": \"Pa'anga tongien\",\r\n"
			+ "    \"UZS\": \"Som ouzbèke\",\r\n" + "    \"YER\": \"Riyal du Yémen\",\r\n"
			+ "    \"ZAR\": \"Rand sud-africain\",\r\n" + "    \"RSD\": \"Dinar serbe\",\r\n"
			+ "    \"RUB\": \"Rouble russe\",\r\n" + "    \"SOS\": \"Shilling somalien\",\r\n"
			+ "    \"SVC\": \"Salvadorien Colón\",\r\n" + "    \"SYP\": \"Livre syrienne\",\r\n"
			+ "    \"SZL\": \"Swazi lilangeni\",\r\n" + "    \"TND\": \"Dinar tunisien\",\r\n"
			+ "    \"UYU\": \"Peso uruguayen\",\r\n" + "    \"VND\": \"Dong vietnamien\",\r\n"
			+ "    \"VUV\": \"Vanuatu vatu\",\r\n" + "    \"WST\": \"Samoan Tala\",\r\n"
			+ "    \"XAF\": \"Franc CFA\",\r\n" + "    \"XCD\": \"Dollar des Caraïbes orientales\",\r\n"
			+ "    \"SCR\": \"Roupie Seychelloise\",\r\n" + "    \"SEK\": \"Couronne suédoise\",\r\n"
			+ "    \"SHP\": \"Saint Helena livre\",\r\n" + "    \"TZS\": \"Shilling tanzanien\",\r\n"
			+ "    \"USD\": \"Dollar américain\",\r\n" + "    \"XPF\": \"Franc CFP\",\r\n"
			+ "    \"XOF\": \"Franc CFA ouest-africaine\"\r\n" + "}\r\n" + "";

	// map for comboboxes
	Map<String, String> map = new TreeMap<String, String>();

	JSONObject json = new JSONObject(currency);

	{
		// Filling the map using the JsonObject
		for (String key : json.keySet()) {
			map.put(key, json.getString(key));

		}
	}
}
