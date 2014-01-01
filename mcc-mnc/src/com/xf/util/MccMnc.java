package com.xf.util;

import java.util.HashMap;
import java.util.Map;

public class MccMnc {
	private Integer mcc;
	private Integer mnc;
	
	public MccMnc(Integer mcc, Integer mnc){
		this.mcc = mcc;
		this.mnc = mnc;
	}
	
	private static final Map<Integer,String> mcc2country = new HashMap<Integer,String>();
	/**
	 * this mapping table basically comes from http://www.mcc-mnc.com/
	 * and use below javascript to auto-create java code.
	* function c(){
		var created = [];
	    $("#mncmccTable tbody tr").each(function(){
	        var mcc = $($("td",this)[0]).text();
	        var mnc = $($("td",this)[1]).text();
	        var iso = $($("td",this)[2]).text();
	        var country = $($("td",this)[3]).text();
	        var carrier = $($("td",this)[5]).text();
	        if (created.indexOf(mcc) === -1){
	        	console.log("mcc2country.put(" + mcc + ",\"" + iso + "\");//" + country);
	        	created.push(mcc);
	        }
	    });
	}
	c();
	*/
	static {
		mcc2country.put(289,"ge");//Abkhazia
		mcc2country.put(412,"af");//Afghanistan
		mcc2country.put(276,"al");//Albania
		mcc2country.put(603,"dz");//Algeria
		mcc2country.put(544,"as");//American Samoa
		mcc2country.put(213,"ad");//Andorra
		mcc2country.put(631,"ao");//Angola
		mcc2country.put(365,"ai");//Anguilla
		mcc2country.put(344,"ag");//Antigua and Barbuda
		mcc2country.put(722,"ar");//Argentina Republic
		mcc2country.put(283,"am");//Armenia
		mcc2country.put(363,"aw");//Aruba
		mcc2country.put(505,"au");//Australia
		mcc2country.put(232,"at");//Austria
		mcc2country.put(400,"az");//Azerbaijan
		mcc2country.put(364,"bs");//Bahamas
		mcc2country.put(426,"bh");//Bahrain
		mcc2country.put(470,"bd");//Bangladesh
		mcc2country.put(342,"bb");//Barbados
		mcc2country.put(257,"by");//Belarus
		mcc2country.put(206,"be");//Belgium
		mcc2country.put(702,"bz");//Belize
		mcc2country.put(616,"bj");//Benin
		mcc2country.put(350,"bm");//Bermuda
		mcc2country.put(402,"bt");//Bhutan
		mcc2country.put(736,"bo");//Bolivia
		mcc2country.put(218,"ba");//Bosnia & Herzegov.
		mcc2country.put(652,"bw");//Botswana
		mcc2country.put(724,"br");//Brazil
		mcc2country.put(348,"vg");//British Virgin Islands
		mcc2country.put(528,"bn");//Brunei Darussalam
		mcc2country.put(284,"bg");//Bulgaria
		mcc2country.put(613,"bf");//Burkina Faso
		mcc2country.put(414,"mm");//Burma
		mcc2country.put(642,"bi");//Burundi
		mcc2country.put(456,"kh");//Cambodia
		mcc2country.put(624,"cm");//Cameroon
		mcc2country.put(302,"ca");//Canada
		mcc2country.put(625,"cv");//Cape Verde
		mcc2country.put(346,"ky");//Cayman Islands
		mcc2country.put(623,"cf");//Central African Rep.
		mcc2country.put(622,"td");//Chad
		mcc2country.put(730,"cl");//Chile
		mcc2country.put(460,"cn");//China
		mcc2country.put(732,"co");//Colombia
		mcc2country.put(654,"km");//Comoros
		mcc2country.put(630,"cd");//Congo, Dem. Rep.
		mcc2country.put(629,"cg");//Congo, Republic
		mcc2country.put(548,"ck");//Cook Islands
		mcc2country.put(712,"cr");//Costa Rica
		mcc2country.put(219,"hr");//Croatia
		mcc2country.put(368,"cu");//Cuba
		mcc2country.put(280,"cy");//Cyprus
		mcc2country.put(230,"cz");//Czech Rep.
		mcc2country.put(238,"dk");//Denmark
		mcc2country.put(638,"dj");//Djibouti
		mcc2country.put(366,"dm");//Dominica
		mcc2country.put(370,"do");//Dominican Republic
		mcc2country.put(740,"ec");//Ecuador
		mcc2country.put(602,"eg");//Egypt
		mcc2country.put(706,"sv");//El Salvador
		mcc2country.put(627,"gq");//Equatorial Guinea
		mcc2country.put(657,"er");//Eritrea
		mcc2country.put(248,"ee");//Estonia
		mcc2country.put(636,"et");//Ethiopia
		mcc2country.put(288,"fo");//Faroe Islands
		mcc2country.put(542,"fj");//Fiji
		mcc2country.put(244,"fi");//Finland
		mcc2country.put(208,"fr");//France
		mcc2country.put(340,"fg");//French Guiana
		mcc2country.put(547,"pf");//French Polynesia
		mcc2country.put(628,"ga");//Gabon
		mcc2country.put(607,"gm");//Gambia
		mcc2country.put(282,"ge");//Georgia
		mcc2country.put(262,"de");//Germany
		mcc2country.put(620,"gh");//Ghana
		mcc2country.put(266,"gi");//Gibraltar
		mcc2country.put(202,"gr");//Greece
		mcc2country.put(290,"gl");//Greenland
		mcc2country.put(352,"gd");//Grenada
		mcc2country.put(310,"gu");//Guam
		mcc2country.put(704,"gt");//Guatemala
		mcc2country.put(611,"gn");//Guinea
		mcc2country.put(632,"gw");//Guinea-Bissau
		mcc2country.put(738,"gy");//Guyana
		mcc2country.put(372,"ht");//Haiti
		mcc2country.put(708,"hn");//Honduras
		mcc2country.put(454,"hk");//Hongkong, China
		mcc2country.put(216,"hu");//Hungary
		mcc2country.put(274,"is");//Iceland
		mcc2country.put(404,"in");//India
		mcc2country.put(405,"in");//India
		mcc2country.put(510,"id");//Indonesia
		
		//mcc2country.put(901,"n/a");//International Networks
		
		mcc2country.put(432,"ir");//Iran
		mcc2country.put(418,"iq");//Iraq
		mcc2country.put(272,"ie");//Ireland
		mcc2country.put(425,"il");//Israel
		mcc2country.put(222,"it");//Italy
		mcc2country.put(612,"ci");//Ivory Coast
		mcc2country.put(338,"jm");//Jamaica
		mcc2country.put(440,"jp");//Japan
		mcc2country.put(441,"jp");//Japan
		mcc2country.put(416,"jo");//Jordan
		mcc2country.put(401,"kz");//Kazakhstan
		mcc2country.put(639,"ke");//Kenya
		mcc2country.put(545,"ki");//Kiribati
		mcc2country.put(467,"kp");//Korea N., Dem. People's Rep.
		mcc2country.put(450,"kr");//Korea S, Republic of
		mcc2country.put(419,"kw");//Kuwait
		mcc2country.put(437,"kg");//Kyrgyzstan
		mcc2country.put(457,"la");//Laos P.D.R.
		mcc2country.put(247,"lv");//Latvia
		mcc2country.put(415,"lb");//Lebanon
		mcc2country.put(651,"ls");//Lesotho
		mcc2country.put(618,"lr");//Liberia
		mcc2country.put(606,"ly");//Libya
		mcc2country.put(295,"li");//Liechtenstein
		mcc2country.put(246,"lt");//Lithuania
		mcc2country.put(270,"lu");//Luxembourg
		mcc2country.put(455,"mo");//Macao, China
		mcc2country.put(294,"mk");//Macedonia
		mcc2country.put(646,"mg");//Madagascar
		mcc2country.put(650,"mw");//Malawi
		mcc2country.put(502,"my");//Malaysia
		mcc2country.put(472,"mv");//Maldives
		mcc2country.put(610,"ml");//Mali
		mcc2country.put(278,"mt");//Malta
		mcc2country.put(609,"mr");//Mauritania
		mcc2country.put(617,"mu");//Mauritius
		mcc2country.put(334,"mx");//Mexico
		mcc2country.put(550,"fm");//Micronesia
		mcc2country.put(259,"md");//Moldova
		mcc2country.put(212,"mc");//Monaco
		mcc2country.put(428,"mn");//Mongolia
		mcc2country.put(354,"ms");//Montserrat
		mcc2country.put(604,"ma");//Morocco
		mcc2country.put(643,"mz");//Mozambique
		mcc2country.put(649,"na");//Namibia
		mcc2country.put(429,"np");//Nepal
		mcc2country.put(204,"nl");//Netherlands
		mcc2country.put(362,"an");//Netherlands Antilles
		mcc2country.put(546,"nc");//New Caledonia
		mcc2country.put(530,"nz");//New Zealand
		mcc2country.put(614,"ne");//Niger
		mcc2country.put(621,"ng");//Nigeria
		mcc2country.put(242,"no");//Norway
		mcc2country.put(422,"om");//Oman
		mcc2country.put(410,"pk");//Pakistan
		mcc2country.put(425,"ps");//Palestinian Territory
		mcc2country.put(714,"pa");//Panama
		mcc2country.put(537,"pg");//Papua New Guinea
		mcc2country.put(744,"py");//Paraguay
		mcc2country.put(716,"pe");//Peru
		mcc2country.put(515,"ph");//Philippines
		mcc2country.put(260,"pl");//Poland
		mcc2country.put(268,"pt");//Portugal
		mcc2country.put(427,"qa");//Qatar
		mcc2country.put(647,"re");//Reunion
		mcc2country.put(226,"ro");//Romania
		mcc2country.put(250,"ru");//Russian Federation
		mcc2country.put(635,"rw");//Rwanda
		mcc2country.put(356,"kn");//Saint Kitts and Nevis
		mcc2country.put(358,"lc");//Saint Lucia
		mcc2country.put(549,"ws");//Samoa
		mcc2country.put(292,"sm");//San Marino
		mcc2country.put(626,"st");//Sao Tome & Principe
		mcc2country.put(901,"n/a");//Satellite Networks
		mcc2country.put(420,"sa");//Saudi Arabia
		mcc2country.put(608,"sn");//Senegal
		mcc2country.put(220,"rs");//Serbia 
		mcc2country.put(293,"si");//Slovenia
		mcc2country.put(540,"sb");//Solomon Islands
		mcc2country.put(637,"so");//Somalia
		mcc2country.put(655,"za");//South Africa
		mcc2country.put(214,"es");//Spain
		mcc2country.put(413,"lk");//Sri Lanka
		mcc2country.put(308,"pm");//St. Pierre & Miquelon
		mcc2country.put(360,"vc");//St. Vincent & Gren.
		mcc2country.put(634,"sd");//Sudan
		mcc2country.put(746,"sr");//Suriname
		mcc2country.put(653,"sz");//Swaziland
		mcc2country.put(240,"se");//Sweden
		mcc2country.put(228,"ch");//Switzerland
		mcc2country.put(417,"sy");//Syrian Arab Republic
		mcc2country.put(466,"tw");//Taiwan
		mcc2country.put(436,"tk");//Tajikistan
		mcc2country.put(640,"tz");//Tanzania
		mcc2country.put(520,"th");//Thailand
		mcc2country.put(514,"tp");//Timor-Leste
		mcc2country.put(615,"tg");//Togo
		mcc2country.put(539,"to");//Tonga
		mcc2country.put(374,"tt");//Trinidad and Tobago
		mcc2country.put(605,"tn");//Tunisia
		mcc2country.put(286,"tr");//Turkey
		mcc2country.put(438,"tm");//Turkmenistan
		mcc2country.put(641,"ug");//Uganda
		mcc2country.put(255,"ua");//Ukraine
		mcc2country.put(424,"ae");//United Arab Emirates
		mcc2country.put(234,"uk");//United Kingdom
		mcc2country.put(235,"uk");//United Kingdom
		mcc2country.put(310,"us");//United States
		mcc2country.put(311,"us");//United States
		mcc2country.put(316,"us");//United States
		mcc2country.put(748,"uy");//Uruguay
		mcc2country.put(434,"uz");//Uzbekistan
		mcc2country.put(541,"vu");//Vanuatu
		mcc2country.put(734,"ve");//Venezuela
		mcc2country.put(452,"vn");//Viet Nam
		mcc2country.put(376,"vi");//Virgin Islands, U.S.
		mcc2country.put(421,"ye");//Yemen
		mcc2country.put(645,"zm");//Zambia
		mcc2country.put(648,"zw");//Zimbabwe
	}
	
	/**
	 * translate mcc to iso 2-letter country code
	 * @param mcc
	 * @return iso 2-letter country code
	 */
	public static String isoCountryCode(Integer mcc){
		return mcc2country.get(mcc);
	}
	
	/**
	 * translate mcc to iso 2-letter country code
	 * @return iso 2-letter country code
	 */
	public String isoCountryCode(){
		return MccMnc.isoCountryCode(mcc);
	}
	
	/**
	 * translate specificed mcc/mnc tuple to carrier display name
	 * @param mcc
	 * @param mnc
	 * @return carrier display name
	 */
	public static String carrier(Integer mcc,Integer mnc){
		String hni = mcc + "-" + mnc;
		return hni2carrier.get(hni);
	}
	/**
	 * translate mcc/mnc tuple to carrier display name
	 * @return carrier display name
	 */
	public String carrier(){
		return MccMnc.carrier(mcc, mnc);
	}
	
	/**
	 * this mapping table basically comes from http://www.mcc-mnc.com/
	 * and use below javascript to auto-create java code.
	 * function ca(){
	var created = [];
    $("#mncmccTable tbody tr").each(function(){
        var mcc = $($("td",this)[0]).text();
        var mnc = $($("td",this)[1]).text();
        var hni = mcc + "-" + mnc;
        var iso = $($("td",this)[2]).text();
        var country = $.trim($($("td",this)[3]).text());
        var carrier = $.trim($($("td",this)[5]).text());
        if (created.indexOf(hni) === -1){
        	console.log("hni2carrier.put(\"" + hni + "\", \"" + carrier + "\");");
        	created.push(hni);
        }
    });
}
ca();
	 */
	private static final Map<String,String> hni2carrier = new HashMap<String,String>();
	static{
		hni2carrier.put("552-80", "Palau Mobile Corp. (PMC) (Palau ");
		hni2carrier.put("552-1", "Palau National Communications Corp. (PNCC) (Palau ");
		hni2carrier.put("289-88", "A-Mobile ");
		hni2carrier.put("289-68", "A-Mobile ");
		hni2carrier.put("289-67", "Aquafon ");
		hni2carrier.put("412-40", "Areeba ");
		hni2carrier.put("412-50", "Etisalat");
		hni2carrier.put("412-20", "Roshan");
		hni2carrier.put("412-1", "Afghan Wireless/AWCC");
		hni2carrier.put("276-1", "AMC Mobil");
		hni2carrier.put("276-3", "Eagle Mobile");
		hni2carrier.put("276-4", "PLUS Communication Sh.a");
		hni2carrier.put("276-2", "Vodafone");
		hni2carrier.put("603-1", "ATM Mobils");
		hni2carrier.put("603-2", "Orascom / DJEZZY");
		hni2carrier.put("603-3", "Wataniya / Nedjma ");
		hni2carrier.put("544-11", "Blue Sky Communications");
		hni2carrier.put("213-3", "Mobiland");
		hni2carrier.put("631-4", "MoviCel");
		hni2carrier.put("631-2", "Unitel");
		hni2carrier.put("365-840", "Cable and Wireless");
		hni2carrier.put("365-10", "Wireless Ventures Ltd");
		hni2carrier.put("344-30", "APUA PCS");
		hni2carrier.put("344-920", "C & W");
		hni2carrier.put("344-930", "Cing. Wirel./DigiCel");
		hni2carrier.put("722-", "Arch Comunicaciones Argentina SA");
		hni2carrier.put("722-310", "Claro/ CTI/AMX");
		hni2carrier.put("722-330", "Claro/ CTI/AMX");
		hni2carrier.put("722-320", "Claro/ CTI/AMX");
		hni2carrier.put("722-10", "Compania De Radiocomunicaciones Moviles SA");
		hni2carrier.put("722-70", "Movistar/Telefonica");
		hni2carrier.put("722-20", "Nextel");
		hni2carrier.put("722-2", "Nextel");
		hni2carrier.put("722-34", "Telecom Personal S.A.");
		hni2carrier.put("722-341", "Telecom Personal S.A.");
		hni2carrier.put("722-1", "Movistar/Telefonica");
		hni2carrier.put("722-7", "Movistar/Telefonica");
		hni2carrier.put("283-1", "ArmenTel");
		hni2carrier.put("283-4", "Karabakh Telecom");
		hni2carrier.put("283-10", "Orange");
		hni2carrier.put("283-5", "Vivacell");
		hni2carrier.put("363-20", "Digicel");
		hni2carrier.put("363-1", "Setar GSM");
		hni2carrier.put("505-26", "Dialogue Communications Pty Ltd");
		hni2carrier.put("505-12", "H3G Ltd.");
		hni2carrier.put("505-6", "H3G Ltd.");
		hni2carrier.put("505-19", "Lycamobile Pty Ltd");
		hni2carrier.put("505-", "My Number Pty Ltd");
		hni2carrier.put("505-13", "Railcorp/Vodafone");
		hni2carrier.put("505-90", "Singtel Optus");
		hni2carrier.put("505-2", "Singtel Optus");
		hni2carrier.put("505-1", "Telstra Corp. Ltd.");
		hni2carrier.put("505-71", "Telstra Corp. Ltd.");
		hni2carrier.put("505-11", "Telstra Corp. Ltd.");
		hni2carrier.put("505-72", "Telstra Corp. Ltd.");
		hni2carrier.put("505-16", "Victorian Rail Track Corp. (VicTrack)");
		hni2carrier.put("505-7", "Vodafone");
		hni2carrier.put("505-3", "Vodafone");
		hni2carrier.put("232-2", "A1 MobilKom");
		hni2carrier.put("232-11", "A1 MobilKom");
		hni2carrier.put("232-9", "A1 MobilKom");
		hni2carrier.put("232-1", "A1 MobilKom");
		hni2carrier.put("232-15", "T-Mobile/Telering");
		hni2carrier.put("232-", "eety-Telecommunications GmbH");
		hni2carrier.put("232-0", "Fix Line");
		hni2carrier.put("232-10", "H3G");
		hni2carrier.put("232-14", "H3G");
		hni2carrier.put("232-5", "Orange/One Connect");
		hni2carrier.put("232-6", "Orange/One Connect");
		hni2carrier.put("232-12", "Orange/One Connect");
		hni2carrier.put("232-7", "T-Mobile/Telering");
		hni2carrier.put("232-4", "T-Mobile/Telering");
		hni2carrier.put("232-3", "T-Mobile/Telering");
		hni2carrier.put("232-8", "Telefonica");
		
		hni2carrier.put("400-1", "Azercell Telekom B.M.");
		hni2carrier.put("400-4", "Azerfon.");
		hni2carrier.put("400-2", "J.V. Bakcell GSM 2000");
		hni2carrier.put("364-30", "Bahamas Telco. Comp.");
		hni2carrier.put("364-3", "Smart Communications");
		hni2carrier.put("364-390", "Bahamas Telco. Comp.");
		hni2carrier.put("364-39", "Bahamas Telco. Comp.");
		hni2carrier.put("426-1", "Batelco");
		hni2carrier.put("426-2", "MTC Vodafone");
		hni2carrier.put("426-4", "VIVA");
		hni2carrier.put("470-2", "Aktel");
		hni2carrier.put("470-5", "Citycell");
		hni2carrier.put("470-1", "GrameenPhone");
		hni2carrier.put("470-3", "Orascom");
		hni2carrier.put("470-4", "TeleTalk");
		hni2carrier.put("470-7", "Warid Telecom");
		hni2carrier.put("342-600", "C & W BET Ltd.");
		hni2carrier.put("342-810", "Cingular Wireless");
		hni2carrier.put("342-750", "Digicel");
		hni2carrier.put("342-50", "Digicel");
		hni2carrier.put("342-820", "Sunbeach");
		hni2carrier.put("257-4", "BeST");
		hni2carrier.put("257-1", "Mobile Digital Communications");
		hni2carrier.put("257-2", "MTS");
		hni2carrier.put("206-20", "Base/KPN");
		hni2carrier.put("206-1", "Belgacom/Proximus");
		hni2carrier.put("206-10", "Mobistar/Orange");
		hni2carrier.put("206-2", "SNCT/NMBS");
		hni2carrier.put("206-5", "Mobistar/Orange");
		hni2carrier.put("702-67", "DigiCell");
		hni2carrier.put("702-68", "International Telco (INTELCO)");
		hni2carrier.put("702-", "Smart/SeedNet Com.");
		hni2carrier.put("702-999", "Smart/SeedNet Com.");
		hni2carrier.put("616-4", "Bell Benin/BBCOM");
		hni2carrier.put("616-5", "GloMobile");
		hni2carrier.put("616-1", "Libercom");
		hni2carrier.put("616-2", "Etisalat/MOOV");
		hni2carrier.put("616-3", "MTN/Spacetel");
		hni2carrier.put("350-99", "CellOne Ltd");
		hni2carrier.put("350-1", "DigiCel / Cingular");
		hni2carrier.put("350-10", "DigiCel / Cingular");
		hni2carrier.put("350-2", "M3 Wireless Ltd");
		hni2carrier.put("402-11", "B-Mobile");
		hni2carrier.put("402-17", "B-Mobile");
		hni2carrier.put("402-77", "TashiCell");
		hni2carrier.put("736-2", "Entel Pcs");
		hni2carrier.put("736-1", "Nuevatel");
		hni2carrier.put("736-3", "TELECEL BOLIVIA");
		hni2carrier.put("218-3", "Eronet Mobile");
		hni2carrier.put("218-5", "M-Tel");
		hni2carrier.put("218-90", "BH Mobile");
		hni2carrier.put("652-4", "beMOBILE");
		hni2carrier.put("652-1", "Mascom Wireless (Pty) Ltd.");
		hni2carrier.put("652-2", "Orange");
		hni2carrier.put("724-12", "Claro/Albra/America Movil");
		hni2carrier.put("724-38", "Claro/Albra/America Movil");
		hni2carrier.put("724-5", "Claro/Albra/America Movil");
		hni2carrier.put("724-1", "Vivo S.A./Telemig");
		hni2carrier.put("724-34", "CTBC Celular SA (CTBC)");
		hni2carrier.put("724-33", "CTBC Celular SA (CTBC)");
		hni2carrier.put("724-32", "CTBC Celular SA (CTBC)");
		hni2carrier.put("724-8", "TIM");
		hni2carrier.put("724-0", "Nextel (Telet)");
		hni2carrier.put("724-39", "Nextel (Telet)");
		hni2carrier.put("724-30", "Oi (TNL PCS / Oi)");
		hni2carrier.put("724-24", "Oi (TNL PCS / Oi)");
		hni2carrier.put("724-31", "Oi (TNL PCS / Oi)");
		hni2carrier.put("724-16", "Oi (TNL PCS / Oi)");
		hni2carrier.put("724-15", "Sercontel Cel");
		hni2carrier.put("724-7", "CTBC/Triangulo");
		hni2carrier.put("724-19", "Vivo S.A./Telemig");
		hni2carrier.put("724-2", "TIM");
		hni2carrier.put("724-4", "TIM");
		hni2carrier.put("724-3", "TIM");
		hni2carrier.put("724-37", "Unicel do Brasil Telecomunicacoes Ltda");
		hni2carrier.put("724-11", "Vivo S.A./Telemig");
		hni2carrier.put("724-10", "Vivo S.A./Telemig");
		hni2carrier.put("724-6", "Vivo S.A./Telemig");
		hni2carrier.put("724-23", "Vivo S.A./Telemig");
		hni2carrier.put("348-570", "Caribbean Cellular");
		hni2carrier.put("348-770", "Digicel");
		hni2carrier.put("348-170", "LIME");
		hni2carrier.put("528-2", "b-mobile");
		hni2carrier.put("528-11", "Datastream (DTSCom)");
		hni2carrier.put("284-6", "BTC Mobile EOOD (vivatel)");
		hni2carrier.put("284-5", "Cosmo Mobile EAD/Globul");
		hni2carrier.put("284-1", "MobilTel AD");
		hni2carrier.put("284-3", "BTC Mobile EOOD (vivatel)");
		hni2carrier.put("613-2", "ZAIN - CelTel");
		hni2carrier.put("613-3", "TeleCel");
		hni2carrier.put("613-1", "TeleMob-OnaTel");
		hni2carrier.put("414-1", "Myanmar Post & Teleco.");
		hni2carrier.put("642-2", "Africel / Safaris");
		hni2carrier.put("642-8", "HiTs Telecom");
		hni2carrier.put("642-3", "Onatel / Telecel");
		hni2carrier.put("642-7", "Smart Mobile / LACELL");
		hni2carrier.put("642-1", "Spacetel / Econet");
		hni2carrier.put("642-82", "U-COM");
		hni2carrier.put("456-18", "MFone/Camshin");
		
		hni2carrier.put("456-2", "Hello/Malaysia Telcom");
		hni2carrier.put("456-8", "Metfone");
		hni2carrier.put("456-1", "Mobitel/Cam GSM");
		hni2carrier.put("456-4", "QB/Cambodia Adv. Comms.");
		hni2carrier.put("456-3", "QB/Cambodia Adv. Comms.");
		hni2carrier.put("456-5", "Smart Mobile");
		hni2carrier.put("456-6", "Smart Mobile");
		hni2carrier.put("624-1", "MTN");
		hni2carrier.put("624-2", "Orange");
		hni2carrier.put("302-652", "BC Tel Mobility");
		hni2carrier.put("302-630", "Bell Aliant");
		hni2carrier.put("302-651", "Bell Mobility");
		hni2carrier.put("302-610", "Bell Mobility");
		hni2carrier.put("302-670", "CityWest Mobility");
		hni2carrier.put("302-360", "Clearnet");
		hni2carrier.put("302-361", "Clearnet");
		hni2carrier.put("302-380", "DMTS Mobility");
		hni2carrier.put("302-710", "Globalstar Canada");
		hni2carrier.put("302-640", "Latitude Wireless");
		hni2carrier.put("302-370", "FIDO (Rogers AT&T/ Microcell)");
		hni2carrier.put("302-320", "mobilicity");
		hni2carrier.put("302-702", "MT&T Mobility");
		hni2carrier.put("302-660", "MTS Mobility");
		hni2carrier.put("302-655", "MTS Mobility");
		hni2carrier.put("302-701", "NB Tel Mobility");
		hni2carrier.put("302-703", "New Tel Mobility");
		hni2carrier.put("302-760", "Public Mobile");
		hni2carrier.put("302-657", "Quebectel Mobility");
		hni2carrier.put("302-720", "Rogers AT&T Wireless");
		hni2carrier.put("302-680", "Sask Tel Mobility");
		hni2carrier.put("302-654", "Sask Tel Mobility");
		hni2carrier.put("302-656", "Tbay Mobility");
		hni2carrier.put("302-653", "Telus Mobility");
		hni2carrier.put("302-220", "Telus Mobility");
		hni2carrier.put("302-500", "Videotron");
		hni2carrier.put("302-490", "WIND");
		hni2carrier.put("625-1", "CV Movel");
		hni2carrier.put("625-2", "T+ Telecom");
		hni2carrier.put("346-140", "LIME / Cable & Wirel.");
		hni2carrier.put("346-0", "Cingular");
		hni2carrier.put("346-6", "Digicel Ltd.");
		hni2carrier.put("346-50", "Digicel Ltd.");
		hni2carrier.put("623-1", "Centrafr. Telecom+");
		hni2carrier.put("623-4", "Nationlink");
		hni2carrier.put("623-3", "Orange/Celca");

		hni2carrier.put("623-2", "Telecel Centraf.");

		hni2carrier.put("622-4", "Salam/Sotel");
		hni2carrier.put("622-2", "Tchad Mobile");
		hni2carrier.put("622-3", "Tigo/Milicom");
		hni2carrier.put("622-1", "Zain/Airtel/Celtel");
		hni2carrier.put("730-", "ARCH Comunicaciones Chile Ltda");
		hni2carrier.put("730-6", "Blue Two Chile SA");
		hni2carrier.put("730-11", "Celupago SA");
		hni2carrier.put("730-15", "Cibeles Telecom SA");
		hni2carrier.put("730-3", "Claro");
		hni2carrier.put("730-10", "Entel PCS");
		hni2carrier.put("730-1", "Entel Telefonia Mov");
		hni2carrier.put("730-14", "Netline Telefonica Movil Ltda");
		hni2carrier.put("730-5", "Nextel SA");
		hni2carrier.put("730-4", "Nextel SA");
		hni2carrier.put("730-9", "Nextel SA");
		hni2carrier.put("730-2", "TELEFONICA");
		hni2carrier.put("730-7", "TELEFONICA");
		hni2carrier.put("730-12", "Telestar Movil SA");
		hni2carrier.put("730-0", "TESAM SA");
		hni2carrier.put("730-13", "Tribe Mobile SPA");
		hni2carrier.put("730-8", "VTR Banda Ancha SA");
		hni2carrier.put("460-0", "China Mobile GSM");
		hni2carrier.put("460-7", "China Mobile GSM");
		hni2carrier.put("460-2", "China Mobile GSM");
		hni2carrier.put("460-4", "China Space Mobile Satellite Telecommunications Co. Ltd (China Spacecom)");
		hni2carrier.put("460-5", "China Telecom");
		hni2carrier.put("460-3", "China Telecom");
		hni2carrier.put("460-6", "China Unicom");
		hni2carrier.put("460-1", "China Unicom");
		hni2carrier.put("732-11", " ");
		hni2carrier.put("732-130", "Avantel SAS");
		hni2carrier.put("732-102", "Movistar");
		hni2carrier.put("732-103", "TIGO/Colombia Movil");
		hni2carrier.put("732-1", "TIGO/Colombia Movil");
		hni2carrier.put("732-101", "Comcel S.A. Occel S.A./Celcaribe");
		hni2carrier.put("732-2", "Edatel S.A.");
		hni2carrier.put("732-", "Exito Inversiones SAS");
		hni2carrier.put("732-123", "Movistar");
		hni2carrier.put("732-111", "TIGO/Colombia Movil");
		hni2carrier.put("732-20", "UNE EPM Telecomunicaciones SA ESP");
		hni2carrier.put("732-142", "UNE EPM Telecomunicaciones SA ESP");
		hni2carrier.put("732-154", "Virgin Mobile Colombia SAS");
		hni2carrier.put("654-1", "HURI - SNPT");
		hni2carrier.put("630-86", "CCT");
		hni2carrier.put("630-89", "TIGO/Oasis");
		hni2carrier.put("630-5", "SuperCell");
		hni2carrier.put("630-1", "Vodacom");
		hni2carrier.put("630-2", "ZAIN CelTel");
		hni2carrier.put("629-2", "Zain/Celtel");
		hni2carrier.put("629-1", "Zain/Celtel");
		hni2carrier.put("629-10", "MTN/Libertis");
		hni2carrier.put("629-7", "Warid");
		hni2carrier.put("548-1", "Telecom Cook Islands");
		hni2carrier.put("712-3", "Claro");
		hni2carrier.put("712-", "Comunicaciones Multiples J.V. de C.R.");
		hni2carrier.put("712-2", "ICE");
		hni2carrier.put("712-1", "ICE");
		hni2carrier.put("712-4", "Movistar");
		hni2carrier.put("219-1", "T-Mobile/Cronet");
		hni2carrier.put("219-2", "Tele2");
		hni2carrier.put("219-10", "VIPnet d.o.o.");
		hni2carrier.put("368-1", "C-COM");
		hni2carrier.put("280-10", "Areeba");
		hni2carrier.put("280-20", "PrimeTel PLC");
		hni2carrier.put("280-1", "Vodafone/CyTa");
		hni2carrier.put("230-2", "O2");
		hni2carrier.put("230-1", "T-Mobile / RadioMobil");
		hni2carrier.put("230-4", "Ufone");
		hni2carrier.put("230-99", "Vodafone");
		hni2carrier.put("230-3", "Vodafone");
		hni2carrier.put("238-", "42 Telecom AB");
		hni2carrier.put("238-5", "ApS KBUS");
		hni2carrier.put("238-23", "Banedanmark");
		hni2carrier.put("238-28", "CoolTEL ApS");
		hni2carrier.put("238-6", "Hi3G");
		hni2carrier.put("238-12", "Lycamobile Denmark Ltd");
		hni2carrier.put("238-3", "Mach Connectivity ApS");
		hni2carrier.put("238-7", "");
		hni2carrier.put("238-4", "NextGen Mobile Ltd (CardBoardFish)");
		hni2carrier.put("238-10", "TDC Denmark");
		hni2carrier.put("238-1", "TDC Denmark");
		hni2carrier.put("238-77", "Telenor/Sonofon");
		hni2carrier.put("238-2", "Telenor/Sonofon");
		hni2carrier.put("238-20", "Telia");
		hni2carrier.put("238-30", "Telia");
		hni2carrier.put("638-1", "Djibouti Telecom SA (Evatis)");
		hni2carrier.put("366-110", "C & W");
		hni2carrier.put("366-20", "Cingular Wireless/Digicel");
		hni2carrier.put("366-50", "Digicel");
		hni2carrier.put("370-2", "Claro");
		hni2carrier.put("370-1", "Orange");
		hni2carrier.put("370-3", "TRIcom");
		hni2carrier.put("370-4", "Trilogy Dominicana S. A.");
		hni2carrier.put("740-2", "Alegro/Telcsa");
		hni2carrier.put("740-0", "MOVISTAR/OteCel");
		hni2carrier.put("740-1", "Porta/Conecel");
		hni2carrier.put("602-1", "EMS - Mobinil");
		hni2carrier.put("602-3", "ETISALAT");
		hni2carrier.put("602-2", "Vodafone (Misrfone Telecom)");
		hni2carrier.put("706-1", "CLARO/CTE");
		hni2carrier.put("706-2", "Digicel");
		
		hni2carrier.put("706-4", "Telefonica");
		hni2carrier.put("706-3", "Telemovil");
		hni2carrier.put("627-1", "ORANGE/GETESA");
		hni2carrier.put("627-3", "HiTs-GE");
		hni2carrier.put("657-1", "Eritel");
		hni2carrier.put("657-0", "EriTel");
		hni2carrier.put("248-1", "EMT GSM");
		hni2carrier.put("248-2", "Radiolinja Eesti");
		hni2carrier.put("248-3", "Tele2 Eesti AS");
		hni2carrier.put("636-1", "ETH/MTN");
		hni2carrier.put("288-1", "Faroese Telecom");
		hni2carrier.put("288-2", "Kall GSM");
		hni2carrier.put("542-2", "DigiCell");
		hni2carrier.put("542-1", "Vodafone");
		hni2carrier.put("244-14", "Alands");
		hni2carrier.put("244-3", "DNA/Finnet");
		hni2carrier.put("244-12", "DNA/Finnet");
		hni2carrier.put("244-4", "DNA/Finnet");
		hni2carrier.put("244-21", "Elisa/Saunalahti");
		hni2carrier.put("244-5", "Elisa/Saunalahti");
		hni2carrier.put("244-9", "DNA/Finnet");
		hni2carrier.put("244-82", "ID-Mobile");
		hni2carrier.put("244-91", "TeliaSonera");
		hni2carrier.put("208-27", "S.F.R.");
		hni2carrier.put("208-28", "Astrium");
		hni2carrier.put("208-21", "Bouygues Telecom");
		hni2carrier.put("208-20", "Bouygues Telecom");
		hni2carrier.put("208-92", "Orange");
		hni2carrier.put("208-15", "Lliad/FREE Mobile");
		hni2carrier.put("208-14", "Lliad/FREE Mobile");
		hni2carrier.put("208-16", "Lliad/FREE Mobile");
		hni2carrier.put("208-29", "Orange");
		hni2carrier.put("208-25", "Bouygues Telecom");
		hni2carrier.put("208-24", "MobiquiThings");
		hni2carrier.put("208-3", "MobiquiThings");
		hni2carrier.put("208-26", "NRJ");
		hni2carrier.put("208-2", "Orange");
		hni2carrier.put("208-89", "Orange");
		hni2carrier.put("208-91", "Orange");
		hni2carrier.put("208-1", "Orange");
		hni2carrier.put("208-23", "S.F.R.");
		hni2carrier.put("208-9", "S.F.R.");
		hni2carrier.put("208-10", "S.F.R.");
		hni2carrier.put("208-11", "S.F.R.");
		hni2carrier.put("208-13", "S.F.R.");
		hni2carrier.put("208-4", "SISTEER");
		hni2carrier.put("208-22", "Bouygues Telecom");
		hni2carrier.put("208-0", "Tel/Tel");
		hni2carrier.put("208-31", "S.F.R.");
		hni2carrier.put("340-20", "Bouygues/DigiCel");
		hni2carrier.put("340-8", "AMIGO/Dauphin");
		hni2carrier.put("340-1", "Orange Caribe");
		hni2carrier.put("340-2", "Outremer Telecom");
		hni2carrier.put("340-3", "TelCell GSM");
		hni2carrier.put("340-11", "TelCell GSM");
		hni2carrier.put("547-20", "Tikiphone");
		hni2carrier.put("628-4", "Azur/Usan S.A.");
		hni2carrier.put("628-3", "ZAIN/Celtel Gabon S.A.");
		hni2carrier.put("628-1", "Libertis S.A.");
		hni2carrier.put("628-2", "MOOV/Telecel");
		hni2carrier.put("607-2", "Africel");
		hni2carrier.put("607-3", "Comium");
		hni2carrier.put("607-1", "Gamcel");
		hni2carrier.put("607-4", "Q-Cell");
		hni2carrier.put("282-1", "Geocell Ltd.");
		hni2carrier.put("282-3", "Iberiatel Ltd.");
		hni2carrier.put("282-2", "Magti GSM Ltd.");
		hni2carrier.put("282-4", "MobiTel/Beeline");
		hni2carrier.put("282-0", "Silknet");
		hni2carrier.put("282-", "Silknet");
		hni2carrier.put("262-17", "E-Plus");
		hni2carrier.put("262-n/a", "Debitel");
		hni2carrier.put("262-", "e*Message Wireless Information Services Deutschland GmbH");
		hni2carrier.put("262-77", "E-Plus");
		hni2carrier.put("262-5", "E-Plus");
		hni2carrier.put("262-3", "E-Plus");
		hni2carrier.put("262-999", "Fix Line SMS");
		hni2carrier.put("262-14", "Group 3G UMTS");
		hni2carrier.put("262-43", "Lycamobile");
		hni2carrier.put("262-13", "Mobilcom");
		hni2carrier.put("262-7", "O2");
		hni2carrier.put("262-8", "O2");
		hni2carrier.put("262-11", "O2");
		hni2carrier.put("262-10", "O2");
		hni2carrier.put("262-12", "O2");
		hni2carrier.put("262-6", "Telekom/T-mobile");
		hni2carrier.put("262-1", "Telekom/T-mobile");
		hni2carrier.put("262-16", "Telogic/ViStream");
		hni2carrier.put("262-4", "Vodafone D2");
		hni2carrier.put("262-2", "Vodafone D2");
		hni2carrier.put("262-9", "Vodafone D2");
		hni2carrier.put("620-4", "Expresso Ghana Ltd");
		hni2carrier.put("620-", "GloMobile");
		hni2carrier.put("620-3", "Milicom/Tigo");
		
		hni2carrier.put("620-1", "MTN");
		hni2carrier.put("620-2", "Vodafone");
		hni2carrier.put("620-6", "ZAIN");
		hni2carrier.put("266-6", "CTS Mobile");
		hni2carrier.put("266-9", "eazi telecom");
		hni2carrier.put("266-1", "Gibtel GSM");
		hni2carrier.put("202-7", "AMD Telecom SA");
		hni2carrier.put("202-1", "Cosmote");
		hni2carrier.put("202-2", "Cosmote");
		hni2carrier.put("202-", "Infobip Ltd");
		hni2carrier.put("202-4", "Organismos Sidirodromon Ellados (OSE)");
		hni2carrier.put("202-3", "OTE Hellenic Telecommunications Organization SA");
		hni2carrier.put("202-9", "Tim/Wind");
		hni2carrier.put("202-10", "Tim/Wind");
		hni2carrier.put("202-5", "Vodafone");
		hni2carrier.put("290-1", "Tele Greenland");
		hni2carrier.put("352-110", "Cable & Wireless");
		hni2carrier.put("352-50", "Digicel");
		hni2carrier.put("352-30", "Digicel");
		hni2carrier.put("310-470", "Docomo");
		hni2carrier.put("310-370", "Docomo");
		hni2carrier.put("310-140", "GTA Wireless");
		hni2carrier.put("310-33", "Guam Teleph. Auth.");
		hni2carrier.put("310-32", "IT&E OverSeas");
		hni2carrier.put("704-2", "TIGO/COMCEL");
		hni2carrier.put("704-1", "SERCOM");
		hni2carrier.put("704-3", "Telefonica");
		hni2carrier.put("611-4", "Areeba - MTN");
		hni2carrier.put("611-5", "Celcom");
		hni2carrier.put("611-3", "Intercel");
		hni2carrier.put("611-2", "SotelGui");
		hni2carrier.put("611-1", "Orange/Spacetel");
		hni2carrier.put("632-2", "SpaceTel");
		hni2carrier.put("632-0", "GuineTel");
		hni2carrier.put("632-3", "Orange");
		hni2carrier.put("738-1", "DigiCel");
		hni2carrier.put("738-2", "Cellink Plus");
		hni2carrier.put("372-1", "Comcel");
		hni2carrier.put("372-2", "Digicel");
		hni2carrier.put("372-", "HaiTel SA");
		hni2carrier.put("372-3", "National Telecom SA (NatCom)");
		hni2carrier.put("708-40", "Digicel");
		hni2carrier.put("708-30", "HonduTel");
		hni2carrier.put("708-1", "SERCOM/CLARO");
		hni2carrier.put("708-2", "Telefonica/CELTEL");
		hni2carrier.put("454-12", "China Mobile/Peoples");
		hni2carrier.put("454-13", "China Mobile/Peoples");
		hni2carrier.put("454-9", "China Motion");
		hni2carrier.put("454-7", "H3G/Hutchinson");
		hni2carrier.put("454-1", "Citic Telecom Ltd.");
		hni2carrier.put("454-10", "CSL/New World PCS Ltd.");
		hni2carrier.put("454-19", "HKT/PCCW");
		hni2carrier.put("454-29", "HKT/PCCW");
		hni2carrier.put("454-20", "HKT/PCCW");
		hni2carrier.put("454-16", "HKT/PCCW");
		hni2carrier.put("454-18", "CSL Ltd.");
		hni2carrier.put("454-47", "shared by private TETRA systems");
		hni2carrier.put("454-2", "CSL Ltd.");
		hni2carrier.put("454-0", "CSL Ltd.");
		hni2carrier.put("454-11", "HKT/PCCW");
		hni2carrier.put("454-3", "H3G/Hutchinson");
		hni2carrier.put("454-14", "H3G/Hutchinson");
		hni2carrier.put("454-5", "H3G/Hutchinson");
		hni2carrier.put("454-4", "H3G/Hutchinson");
		hni2carrier.put("454-40", "shared by private TETRA systems");
		hni2carrier.put("454-6", "Vodafone/SmarTone");
		hni2carrier.put("454-15", "Vodafone/SmarTone");
		hni2carrier.put("454-17", "Vodafone/SmarTone");
		hni2carrier.put("454-8", "Trident Telecom Ventures Ltd.");
		hni2carrier.put("216-1", "Pannon/Telenor");
		hni2carrier.put("216-30", "T-mobile/Magyar");
		hni2carrier.put("216-", "TENETTEL Kft.");
		hni2carrier.put("216-71", "UPC Magyarorszag Kft.");
		hni2carrier.put("216-70", "Vodafone");
		hni2carrier.put("274-9", "Amitelo");
		hni2carrier.put("274-7", "IceCell");
		hni2carrier.put("274-4", "VIKING/IMC");
		hni2carrier.put("274-3", "Vodafone/Tal hf");
		hni2carrier.put("274-8", "Landssiminn");
		hni2carrier.put("274-1", "Landssiminn");
		hni2carrier.put("274-11", "NOVA");
		hni2carrier.put("274-5", "Vodafone/Tal hf");
		hni2carrier.put("274-2", "Vodafone/Tal hf");
		hni2carrier.put("404-28", "Aircel");
		hni2carrier.put("404-25", "Aircel");
		hni2carrier.put("404-42", "Aircel");
		hni2carrier.put("404-17", "Aircel");
		hni2carrier.put("404-33", "Aircel");
		
		hni2carrier.put("404-29", "Aircel");
		hni2carrier.put("404-60", "Aircel Digilink India");
		hni2carrier.put("404-1", "Aircel Digilink India");
		hni2carrier.put("404-15", "Aircel Digilink India");
		hni2carrier.put("405-53", "AirTel");
		hni2carrier.put("405-51", "AirTel");
		hni2carrier.put("405-55", "AirTel");
		hni2carrier.put("405-56", "Airtel (Bharati Mobile) - Assam");
		hni2carrier.put("404-13", "Barakhamba Sales & Serv.");
		hni2carrier.put("404-86", "Barakhamba Sales & Serv.");
		hni2carrier.put("404-57", "BSNL");
		hni2carrier.put("404-72", "BSNL");
		hni2carrier.put("404-76", "BSNL");
		hni2carrier.put("404-51", "BSNL");
		hni2carrier.put("404-80", "BSNL");
		hni2carrier.put("404-66", "BSNL");
		hni2carrier.put("404-71", "BSNL");
		hni2carrier.put("404-75", "BSNL");
		hni2carrier.put("404-38", "BSNL");
		hni2carrier.put("404-55", "BSNL");
		hni2carrier.put("404-64", "BSNL");
		hni2carrier.put("404-59", "BSNL");
		hni2carrier.put("404-74", "BSNL");
		hni2carrier.put("404-34", "BSNL");
		hni2carrier.put("404-54", "BSNL");
		hni2carrier.put("404-62", "BSNL");
		hni2carrier.put("404-58", "BSNL");
		hni2carrier.put("404-73", "BSNL");
		hni2carrier.put("404-77", "BSNL");
		hni2carrier.put("404-53", "BSNL");
		hni2carrier.put("404-81", "BSNL");
		hni2carrier.put("405-10", "Bharti Airtel Limited (Delhi)");
		hni2carrier.put("404-79", "CellOne A&N");
		hni2carrier.put("404-87", "Escorts Telecom Ltd.");
		hni2carrier.put("404-82", "Escorts Telecom Ltd.");
		hni2carrier.put("404-89", "Escorts Telecom Ltd.");
		hni2carrier.put("404-88", "Escorts Telecom Ltd.");
		hni2carrier.put("404-56", "Escotel Mobile Communications");
		hni2carrier.put("404-12", "Escotel Mobile Communications");
		hni2carrier.put("404-19", "Escotel Mobile Communications");
		hni2carrier.put("405-5", "Fascel Limited");
		hni2carrier.put("404-5", "Fascel");
		hni2carrier.put("404-70", "Hexacom India");
		hni2carrier.put("404-16", "Hexcom India");
		hni2carrier.put("404-24", "Idea Cellular Ltd.");
		hni2carrier.put("404-22", "Idea Cellular Ltd.");
		hni2carrier.put("404-78", "Idea Cellular Ltd.");
		hni2carrier.put("404-7", "Idea Cellular Ltd.");
		hni2carrier.put("404-4", "Idea Cellular Ltd.");
		hni2carrier.put("404-68", "Mahanagar Telephone Nigam");
		hni2carrier.put("404-69", "Mahanagar Telephone Nigam");
		hni2carrier.put("404-83", "Reliable Internet Services");
		hni2carrier.put("405-9", "RELIANCE TELECOM");
		hni2carrier.put("404-85", "Reliance Telecom Private");
		hni2carrier.put("404-36", "Reliance Telecom Private");
		hni2carrier.put("404-52", "Reliance Telecom Private");
		hni2carrier.put("404-50", "Reliance Telecom Private");
		hni2carrier.put("404-18", "Reliance Telecom Private");
		hni2carrier.put("404-67", "Reliance Telecom Private");
		hni2carrier.put("404-9", "Reliance Telecom Private");
		hni2carrier.put("404-41", "RPG Cellular");
		hni2carrier.put("404-44", "Spice");
		hni2carrier.put("404-14", "Spice");
		hni2carrier.put("404-11", "Sterling Cellular Ltd.");
		hni2carrier.put("404-30", "Usha Martin Telecom");
		hni2carrier.put("510-8", "Axis/Natrindo");
		hni2carrier.put("510-89", "H3G CP");
		hni2carrier.put("510-21", "Indosat/Satelindo/M3");
		hni2carrier.put("510-28", "");
		hni2carrier.put("510-0", "");
		hni2carrier.put("510-11", "PT. Excelcom");
		hni2carrier.put("510-1", "Indosat/Satelindo/M3");
		hni2carrier.put("510-10", "Telkomsel");
		hni2carrier.put("901-13", "Antarctica");
		hni2carrier.put("432-35", "MTN/IranCell");
		hni2carrier.put("432-70", "MTCE");
		hni2carrier.put("432-19", "MTCE");
		hni2carrier.put("432-32", "Taliya");
		hni2carrier.put("432-11", "TCI / MCI");
		hni2carrier.put("432-14", "TKC/KFZO");
		hni2carrier.put("418-5", "Asia Cell");
		hni2carrier.put("418-20", "ZAIN/Atheer");
		hni2carrier.put("418-92", "Itisaluna and Kalemat");
		hni2carrier.put("418-40", "Korek");
		hni2carrier.put("418-45", "Mobitel (Iraq-Kurdistan) and Moutiny");
		hni2carrier.put("418-30", "Orascom Telecom");
		hni2carrier.put("418-8", "Sanatel");
		hni2carrier.put("272-4", "Access Telecom Ltd.");
		hni2carrier.put("272-5", "H3G");
		hni2carrier.put("272-11", "Liffey Telecom");
		hni2carrier.put("272-3", "Meteor Mobile Ltd.");
		hni2carrier.put("272-2", "O2/Digifone");
		hni2carrier.put("272-1", "Vodafone Eircell");
		hni2carrier.put("425-2", "Cellcom ltd.");
		hni2carrier.put("425-8", "Golan Telekom");
		hni2carrier.put("425-15", "Cellcom ltd.");
		hni2carrier.put("425-77", "Hot Mobile/Mirs");
		hni2carrier.put("425-7", "Hot Mobile/Mirs");
		hni2carrier.put("425-1", "Orange/Partner Co. Ltd.");
		hni2carrier.put("425-3", "Pelephone");
		
		hni2carrier.put("425-16", "Pelephone");
		hni2carrier.put("425-14", "Orange/Partner Co. Ltd.");
		hni2carrier.put("222-", "Auchan SpA");
		hni2carrier.put("222-34", "BT Italia SpA");
		hni2carrier.put("222-99", "Hi3G");
		hni2carrier.put("222-33", "Hi3G");
		hni2carrier.put("222-35", "Lycamobile Srl");
		hni2carrier.put("222-7", "Noverca Italia Srl");
		hni2carrier.put("222-30", "RFI Rete Ferroviaria Italiana SpA");
		hni2carrier.put("222-1", "Telecom Italia Mobile SpA");
		hni2carrier.put("222-48", "Telecom Italia Mobile SpA");
		hni2carrier.put("222-43", "Telecom Italia Mobile SpA");
		hni2carrier.put("222-6", "Vodafone");
		hni2carrier.put("222-10", "Vodafone");
		hni2carrier.put("222-44", "WIND (Blu) -");
		hni2carrier.put("222-88", "WIND (Blu) -");
		hni2carrier.put("612-2", "Atlantik Tel./Moov");
		hni2carrier.put("612-4", "Comium");
		hni2carrier.put("612-1", "Comstar");
		hni2carrier.put("612-5", "MTN");
		hni2carrier.put("612-3", "Orange");
		hni2carrier.put("612-6", "OriCell");
		hni2carrier.put("612-0", "Warid");
		hni2carrier.put("338-180", "Cable & Wireless");
		hni2carrier.put("338-20", "Cable & Wireless");
		hni2carrier.put("338-50", "DIGICEL/Mossel");
		hni2carrier.put("338-5", "DIGICEL/Mossel");
		hni2carrier.put("440-0", "eMobile");
		hni2carrier.put("441-70", "KDDI Corporation");
		hni2carrier.put("440-71", "KDDI Corporation");
		hni2carrier.put("440-75", "KDDI Corporation");
		hni2carrier.put("440-50", "KDDI Corporation");
		hni2carrier.put("440-54", "KDDI Corporation");
		hni2carrier.put("440-8", "KDDI Corporation");
		hni2carrier.put("440-70", "KDDI Corporation");
		hni2carrier.put("440-74", "KDDI Corporation");
		hni2carrier.put("440-79", "KDDI Corporation");
		hni2carrier.put("440-53", "KDDI Corporation");
		hni2carrier.put("440-7", "KDDI Corporation");
		hni2carrier.put("440-89", "KDDI Corporation");
		hni2carrier.put("440-73", "KDDI Corporation");
		hni2carrier.put("440-77", "KDDI Corporation");
		hni2carrier.put("440-52", "KDDI Corporation");
		hni2carrier.put("440-56", "KDDI Corporation");
		hni2carrier.put("440-88", "KDDI Corporation");
		hni2carrier.put("440-72", "KDDI Corporation");
		hni2carrier.put("440-76", "KDDI Corporation");
		hni2carrier.put("440-51", "KDDI Corporation");
		hni2carrier.put("440-55", "KDDI Corporation");
		hni2carrier.put("441-44", "NTT Docomo");
		hni2carrier.put("440-87", "NTT Docomo");
		hni2carrier.put("440-61", "NTT Docomo");
		hni2carrier.put("440-24", "NTT Docomo");
		hni2carrier.put("440-19", "NTT Docomo");
		hni2carrier.put("441-93", "NTT Docomo");
		hni2carrier.put("440-25", "NTT Docomo");
		hni2carrier.put("440-3", "NTT Docomo");
		hni2carrier.put("441-42", "NTT Docomo");
		hni2carrier.put("440-49", "NTT Docomo");
		hni2carrier.put("440-36", "NTT Docomo");
		hni2carrier.put("441-90", "NTT Docomo");
		hni2carrier.put("440-1", "NTT Docomo");
		hni2carrier.put("440-15", "NTT Docomo");
		hni2carrier.put("440-69", "NTT Docomo");
		hni2carrier.put("441-41", "NTT Docomo");
		hni2carrier.put("440-66", "NTT Docomo");
		hni2carrier.put("440-32", "NTT Docomo");
		hni2carrier.put("440-39", "NTT Docomo");
		hni2carrier.put("440-13", "NTT Docomo");
		hni2carrier.put("440-21", "NTT Docomo");
		hni2carrier.put("441-40", "NTT Docomo");
		hni2carrier.put("440-64", "NTT Docomo");
		hni2carrier.put("440-30", "NTT Docomo");
		hni2carrier.put("440-38", "NTT Docomo");
		hni2carrier.put("441-92", "NTT Docomo");
		hni2carrier.put("440-12", "NTT Docomo");
		hni2carrier.put("440-17", "NTT Docomo");
		hni2carrier.put("440-63", "NTT Docomo");
		hni2carrier.put("440-29", "NTT Docomo");
		hni2carrier.put("440-37", "NTT Docomo");
		hni2carrier.put("441-91", "NTT Docomo");
		hni2carrier.put("440-16", "NTT Docomo");
		hni2carrier.put("440-99", "NTT Docomo");
		hni2carrier.put("440-58", "NTT Docomo");
		hni2carrier.put("440-22", "NTT Docomo");
		hni2carrier.put("441-62", "NTT Docomo");
		hni2carrier.put("440-31", "NTT Docomo");
		hni2carrier.put("440-35", "NTT Docomo");
		hni2carrier.put("440-2", "NTT Docomo");
		hni2carrier.put("441-61", "NTT Docomo");
		hni2carrier.put("441-65", "NTT Docomo");
		hni2carrier.put("441-43", "NTT Docomo");
		hni2carrier.put("440-10", "NTT Docomo");
		
		hni2carrier.put("441-64", "NTT Docomo");
		hni2carrier.put("440-60", "NTT Docomo");
		hni2carrier.put("440-9", "NTT Docomo");
		hni2carrier.put("441-63", "NTT Docomo");
		hni2carrier.put("440-26", "NTT Docomo");
		hni2carrier.put("441-98", "NTT Docomo");
		hni2carrier.put("440-34", "NTT Docomo");
		hni2carrier.put("440-62", "NTT Docomo");
		hni2carrier.put("440-68", "NTT Docomo");
		hni2carrier.put("441-99", "NTT Docomo");
		hni2carrier.put("441-45", "NTT Docomo");
		hni2carrier.put("440-65", "NTT Docomo");
		hni2carrier.put("440-28", "NTT Docomo");
		hni2carrier.put("441-94", "NTT Docomo");
		hni2carrier.put("440-14", "NTT Docomo");
		hni2carrier.put("440-67", "NTT Docomo");
		hni2carrier.put("440-18", "NTT Docomo");
		hni2carrier.put("440-33", "NTT Docomo");
		hni2carrier.put("440-11", "NTT Docomo");
		hni2carrier.put("440-23", "NTT Docomo");
		hni2carrier.put("440-27", "NTT Docomo");
		hni2carrier.put("440-78", "Okinawa Cellular Telephone");
		hni2carrier.put("440-95", "SoftBank Mobile Corp");
		hni2carrier.put("440-41", "SoftBank Mobile Corp");
		hni2carrier.put("440-45", "SoftBank Mobile Corp");
		hni2carrier.put("440-90", "SoftBank Mobile Corp");
		hni2carrier.put("440-20", "SoftBank Mobile Corp");
		hni2carrier.put("440-98", "SoftBank Mobile Corp");
		hni2carrier.put("440-40", "SoftBank Mobile Corp");
		hni2carrier.put("440-44", "SoftBank Mobile Corp");
		hni2carrier.put("440-48", "SoftBank Mobile Corp");
		hni2carrier.put("440-94", "SoftBank Mobile Corp");
		hni2carrier.put("440-97", "SoftBank Mobile Corp");
		hni2carrier.put("440-6", "SoftBank Mobile Corp");
		hni2carrier.put("440-43", "SoftBank Mobile Corp");
		hni2carrier.put("440-47", "SoftBank Mobile Corp");
		hni2carrier.put("440-93", "SoftBank Mobile Corp");
		hni2carrier.put("440-96", "SoftBank Mobile Corp");
		hni2carrier.put("440-4", "SoftBank Mobile Corp");
		hni2carrier.put("440-42", "SoftBank Mobile Corp");
		hni2carrier.put("440-46", "SoftBank Mobile Corp");
		hni2carrier.put("440-92", "SoftBank Mobile Corp");
		hni2carrier.put("440-85", "KDDI Corporation");
		hni2carrier.put("440-83", "KDDI Corporation");
		hni2carrier.put("440-81", "KDDI Corporation");
		hni2carrier.put("440-80", "KDDI Corporation");
		hni2carrier.put("440-86", "KDDI Corporation");
		hni2carrier.put("440-82", "KDDI Corporation");
		hni2carrier.put("440-84", "KDDI Corporation");
		hni2carrier.put("416-1", "ZAIN /J.M.T.S");
		hni2carrier.put("416-77", "Orange/Petra");
		hni2carrier.put("416-3", "Umniah Mobile Co.");
		hni2carrier.put("416-2", "Xpress");
		hni2carrier.put("401-", "2DAY Telecom too");
		hni2carrier.put("401-999", "ARNA");
		hni2carrier.put("401-1", "Beeline/KaR-Tel LLP");
		hni2carrier.put("401-7", "Dalacom/Altel");
		hni2carrier.put("401-2", "K-Cell");
		hni2carrier.put("401-77", "NEO/MTS");
		hni2carrier.put("639-3", "Zain/Celtel Ltd.");
		hni2carrier.put("639-5", "Econet Wireless");
		hni2carrier.put("639-7", "Orange");
		hni2carrier.put("639-2", "Safaricom Ltd.");
		hni2carrier.put("545-9", "Kiribati Frigate");
		hni2carrier.put("467-193", "Sun Net");
		hni2carrier.put("467-3", "Sun Net");
		hni2carrier.put("450-2", "KT Freetel Co. Ltd.");
		hni2carrier.put("450-4", "KT Freetel Co. Ltd.");
		hni2carrier.put("450-8", "KT Freetel Co. Ltd.");
		hni2carrier.put("450-6", "LG Telecom");
		hni2carrier.put("450-3", "SK Telecom");
		hni2carrier.put("450-5", "SK Telecom");
		hni2carrier.put("419-2", "Zain");
		hni2carrier.put("419-3", "Wantaniya");
		hni2carrier.put("419-4", "Viva");
		hni2carrier.put("437-1", "Beeline/Bitel");
		hni2carrier.put("437-5", "MEGACOM");
		hni2carrier.put("437-9", "O!/NUR Telecom");
		hni2carrier.put("457-2", "ETL Mobile");
		hni2carrier.put("457-1", "Lao Tel");
		hni2carrier.put("457-8", "Tigo/Millicom");
		hni2carrier.put("457-3", "UNITEL/LAT");
		hni2carrier.put("247-5", "Bite Latvija");
		hni2carrier.put("247-8", "Bite Latvija");
		hni2carrier.put("247-1", "Latvian Mobile Phone");
		hni2carrier.put("247-7", "Bite Latvija");
		hni2carrier.put("247-2", "Tele2");
		hni2carrier.put("247-3", "TRIATEL/Telekom Baltija");
		hni2carrier.put("415-33", "Cellis");
		hni2carrier.put("415-32", "Cellis");
		hni2carrier.put("415-35", "Cellis");
		hni2carrier.put("415-34", "FTML Cellis");
		hni2carrier.put("415-38", "MIC2/LibanCell");
		
		hni2carrier.put("415-37", "MIC2/LibanCell");
		hni2carrier.put("415-39", "MIC2/LibanCell");
		hni2carrier.put("415-1", "MIC1 (Alfa)");
		hni2carrier.put("415-3", "MIC2/LibanCell");
		hni2carrier.put("415-36", "MIC2/LibanCell");
		hni2carrier.put("651-2", "Econet/Ezi-cel");
		hni2carrier.put("651-1", "Vodacom Lesotho");
		hni2carrier.put("618-3", "Celcom");
		hni2carrier.put("618-7", "Celcom");
		hni2carrier.put("618-4", "Comium BVI");
		hni2carrier.put("618-2", "Libercell");
		hni2carrier.put("618-20", "LibTelco");
		hni2carrier.put("618-1", "Lonestar");
		hni2carrier.put("606-2", "Al-Madar");
		hni2carrier.put("606-1", "Al-Madar");
		hni2carrier.put("606-6", "Hatef");
		hni2carrier.put("606-3", "Libyana");
		hni2carrier.put("606-0", "Libyana");
		hni2carrier.put("295-6", "CUBIC (Liechtenstein");
		hni2carrier.put("295-5", "Mobilkom AG");
		hni2carrier.put("295-2", "Orange");
		hni2carrier.put("295-1", "Swisscom FL AG");
		hni2carrier.put("295-77", "Alpmobile/Tele2");
		hni2carrier.put("246-2", "Bite");
		hni2carrier.put("246-1", "Omnitel");
		hni2carrier.put("246-3", "Tele2");
		hni2carrier.put("270-77", "Millicom Tango GSM");
		hni2carrier.put("270-1", "P+T LUXGSM");
		hni2carrier.put("270-99", "VOXmobile S.A.");
		hni2carrier.put("455-1", "C.T.M. TELEMOVEL+");
		hni2carrier.put("455-2", "China Telecom");
		hni2carrier.put("455-3", "H3G Hutchison");
		hni2carrier.put("455-0", "Smartone Mobile");
		hni2carrier.put("294-", "Alo Telekom");
		hni2carrier.put("294-75", "MTS/Cosmofone");
		hni2carrier.put("294-2", "MTS/Cosmofone");
		hni2carrier.put("294-1", "T-Mobile/Mobimak");
		hni2carrier.put("294-3", "VIP Mobile");
		hni2carrier.put("646-1", "MADACOM");
		hni2carrier.put("646-2", "Orange/Soci");
		hni2carrier.put("646-3", "Sacel");
		hni2carrier.put("646-4", "Telma");
		hni2carrier.put("650-10", "Zain/Celtel ltd.");
		hni2carrier.put("650-1", "TNM/Telekom Network Ltd.");
		hni2carrier.put("502-", "ARL HomeComm Sdn Bhd");
		hni2carrier.put("502-0", "Art900");
		hni2carrier.put("502-151", "Baraka Telecom Sdn Bhd");
		hni2carrier.put("502-19", "CelCom");
		hni2carrier.put("502-13", "CelCom");
		hni2carrier.put("502-10", "Digi Telecommunications");
		hni2carrier.put("502-16", "Digi Telecommunications");
		hni2carrier.put("502-20", "Electcoms Wireless Sdn Bhd");
		hni2carrier.put("502-17", "Maxis");
		hni2carrier.put("502-12", "Maxis");
		hni2carrier.put("502-11", "MTX Utara");
		hni2carrier.put("502-153", "Packet One Networks (Malaysia) Sdn Bhd");
		hni2carrier.put("502-155", "Samata Communications Sdn Bhd");
		hni2carrier.put("502-154", "Talk Focus Sdn Bhd");
		hni2carrier.put("502-18", "U Mobile");
		hni2carrier.put("502-152", "YES");
		hni2carrier.put("472-1", "Dhiraagu/C&W");
		hni2carrier.put("472-2", "Wataniya/WMOBILE");
		hni2carrier.put("610-1", "Malitel");
		hni2carrier.put("610-2", "Orange/IKATEL");
		hni2carrier.put("278-21", "GO/Mobisle");
		hni2carrier.put("278-77", "Melita");
		hni2carrier.put("278-1", "Vodafone");
		hni2carrier.put("609-1", "Mattel");
		hni2carrier.put("609-10", "Mauritel");
		hni2carrier.put("617-1", "Orange/Cellplus");
		hni2carrier.put("617-10", "Emtel Ltd");
		hni2carrier.put("617-2", "Emtel Ltd");
		hni2carrier.put("334-0", "Axtel");
		hni2carrier.put("334-50", "IUSACell/UneFon");
		hni2carrier.put("334-4", "IUSACell/UneFon");
		hni2carrier.put("334-3", "Movistar/Pegaso");
		hni2carrier.put("334-1", "NEXTEL");
		hni2carrier.put("334-2", "TelCel/America Movil");
		hni2carrier.put("334-20", "TelCel/America Movil");
		
		hni2carrier.put("550-1", "FSM Telecom");
		hni2carrier.put("259-4", "Eventis Mobile");
		hni2carrier.put("259-3", "IDC/Unite");
		hni2carrier.put("259-2", "Moldcell");
		hni2carrier.put("259-1", "Orange/Voxtel");
		hni2carrier.put("259-5", "IDC/Unite");
		hni2carrier.put("212-10", "Monaco Telecom");
		hni2carrier.put("212-1", "Monaco Telecom");
		hni2carrier.put("428-99", "Mobicom");
		hni2carrier.put("428-88", "Unitel");
		hni2carrier.put("297-2", "Monet/T-mobile");
		hni2carrier.put("297-3", "Mtel");
		hni2carrier.put("297-1", "Promonte GSM");
		hni2carrier.put("354-860", "Cable & Wireless");
		hni2carrier.put("604-2", "INWI/WANA");
		hni2carrier.put("604-1", "IAM/Itissallat");
		hni2carrier.put("604-0", "Medi Telecom");
		hni2carrier.put("643-3", "Movitel");
		hni2carrier.put("643-1", "mCel");
		hni2carrier.put("643-4", "Vodacom Sarl");
		hni2carrier.put("649-3", "Leo / Orascom");
		hni2carrier.put("649-1", "MTC");
		hni2carrier.put("649-2", "Switch/Nam. Telec.");
		hni2carrier.put("429-2", "Ncell");
		hni2carrier.put("429-1", "NT Mobile / Namaste");
		hni2carrier.put("429-4", "Smart Cell");
		hni2carrier.put("204-14", "KPN Telecom B.V.");
		hni2carrier.put("204-23", "Aspider Solutions");
		hni2carrier.put("204-5", "T-Mobile B.V.");
		hni2carrier.put("204-17", "KPN Telecom B.V.");
		hni2carrier.put("204-69", "KPN Telecom B.V.");
		hni2carrier.put("204-10", "KPN Telecom B.V.");
		hni2carrier.put("204-8", "KPN Telecom B.V.");
		hni2carrier.put("204-24", "KPN/Telfort");
		hni2carrier.put("204-12", "KPN/Telfort");
		hni2carrier.put("204-28", "Lancelot BV");
		hni2carrier.put("204-9", "Vodafone Libertel");
		hni2carrier.put("204-21", "NS Railinfrabeheer B.V.");
		hni2carrier.put("204-20", "Orange/T-mobile");
		hni2carrier.put("204-98", "T-Mobile B.V.");
		hni2carrier.put("204-15", "T-Mobile B.V.");
		hni2carrier.put("204-16", "T-Mobile B.V.");
		hni2carrier.put("204-2", "Tele2");
		hni2carrier.put("204-7", "Vodafone Libertel");
		hni2carrier.put("204-68", "Unify Mobile");
		hni2carrier.put("204-9999", "Unknown");
		hni2carrier.put("204-18", "T-Mobile B.V.");
		hni2carrier.put("204-6", "Vodafone Libertel");
		hni2carrier.put("204-4", "Vodafone Libertel");
		hni2carrier.put("204-3", "KPN Telecom B.V.");
		hni2carrier.put("362-630", "Cingular Wireless");
		hni2carrier.put("362-69", "DigiCell");
		hni2carrier.put("362-95", "MIO");
		hni2carrier.put("362-51", "TELCELL GSM");
		hni2carrier.put("362-91", "SETEL GSM");
		hni2carrier.put("362-951", "UTS Wireless");
		hni2carrier.put("546-1", "OPT Mobilis");
		hni2carrier.put("530-24", "2degrees");
		hni2carrier.put("530-28", "2degrees");
		hni2carrier.put("530-2", "NZ Telecom CDMA");
		hni2carrier.put("530-4", "Telstra");
		hni2carrier.put("530-1", "Vodafone");
		hni2carrier.put("530-3", "Walker Wireless Ltd.");
		hni2carrier.put("710-21", "Claro");
		hni2carrier.put("710-30", "Movistar");
		hni2carrier.put("710-73", "Claro");
		hni2carrier.put("614-2", "Zain/CelTel");
		hni2carrier.put("614-4", "Orange Sahelc.");
		hni2carrier.put("614-1", "Orange Sahelc.");
		hni2carrier.put("614-3", "Etisalat/TeleCel");
		hni2carrier.put("621-", "Alpha Technologies Ltd");
		hni2carrier.put("621-20", "Airtel/ZAIN/Econet");
		hni2carrier.put("621-60", "ETISALAT");
		hni2carrier.put("621-50", "Glo Mobile");
		hni2carrier.put("621-30", "MTN");
		hni2carrier.put("621-40", "M-Tel/Nigeria Telecom. Ltd.");
		hni2carrier.put("621-99", "Starcomms");
		hni2carrier.put("621-1", "Visafone");
		hni2carrier.put("621-25", "Visafone");
		hni2carrier.put("242-20", "Jernbaneverket (GSM-R)");
		hni2carrier.put("242-2", "Netcom");
		hni2carrier.put("242-5", "Network Norway");
		hni2carrier.put("242-6", "ICE Nordisk Mobiltelefon AS");
		hni2carrier.put("242-8", "TDC Mobil A/S");
		hni2carrier.put("242-4", "Tele2");
		hni2carrier.put("242-1", "Telenor");
		hni2carrier.put("242-3", "Teletopia");
		hni2carrier.put("242-7", "Ventelo Norge AS");
		hni2carrier.put("422-3", "Nawras");
		hni2carrier.put("422-2", "Oman Mobile/GTO");
		hni2carrier.put("410-8", "Instaphone");
		hni2carrier.put("410-1", "Mobilink");
		hni2carrier.put("410-3", "UFONE/PAKTel");
		hni2carrier.put("410-6", "Telenor");
		hni2carrier.put("410-7", "Warid Telecom");
		hni2carrier.put("410-4", "ZONG/CMPak");
		hni2carrier.put("425-5", "Jawwal");
		
		hni2carrier.put("425-6", "Wataniya Mobile");
		hni2carrier.put("714-2", "Movistar");
		hni2carrier.put("714-1", "Cable & Wireless S.A.");
		hni2carrier.put("714-3", "Claro");
		hni2carrier.put("714-4", "Digicel");
		hni2carrier.put("714-20", "Movistar");
		hni2carrier.put("537-3", "Digicel");
		hni2carrier.put("537-1", "Pacific Mobile");
		hni2carrier.put("744-3", "Compa");
		hni2carrier.put("744-1", "Hola/VOX");
		hni2carrier.put("744-2", "Claro/Hutchison");
		hni2carrier.put("744-5", "TIM/Nucleo/Personal");
		hni2carrier.put("744-4", "Tigo/Telecel");
		hni2carrier.put("716-20", "Claro /Amer.Mov./TIM");
		hni2carrier.put("716-10", "Claro /Amer.Mov./TIM");
		hni2carrier.put("716-1", "GlobalStar");
		hni2carrier.put("716-2", "GlobalStar");
		hni2carrier.put("716-6", "Movistar");
		hni2carrier.put("716-7", "Nextel");
		hni2carrier.put("716-", "Winner Systems SAC");
		hni2carrier.put("515-", "Express Telecommunication Co. Inc. (EXTELCOM)");
		hni2carrier.put("515-999", "Express Telecommunication");
		hni2carrier.put("515-0", "Fix Line");
		hni2carrier.put("515-2", "Globe Telecom");
		hni2carrier.put("515-1", "Globe Telecom");
		hni2carrier.put("515-88", "Next Mobile");
		hni2carrier.put("515-18", "RED Mobile/Cure");
		hni2carrier.put("515-3", "Smart");
		hni2carrier.put("515-5", "SUN/Digitel");
		hni2carrier.put("260-17", "Aero2 SP.");
		hni2carrier.put("260-18", "AMD Telecom.");
		hni2carrier.put("260-38", "CallFreedom Sp. z o.o.");
		hni2carrier.put("260-12", "Cyfrowy POLSAT S.A.");
		hni2carrier.put("260-999", "Dialog");
		hni2carrier.put("260-8", "e-Telko");
		hni2carrier.put("260-9", "Lycamobile");
		hni2carrier.put("260-", "MASSPAY S.A.");
		hni2carrier.put("260-16", "Mobyland");
		hni2carrier.put("260-36", "Mundio Mobile Sp. z o.o.");
		hni2carrier.put("260-7", "Play/P4");
		hni2carrier.put("260-11", "NORDISK Polska");
		hni2carrier.put("260-5", "Orange/IDEA/Centertel");
		hni2carrier.put("260-3", "Orange/IDEA/Centertel");
		hni2carrier.put("260-35", "PKP Polskie Linie Kolejowe S.A.");
		hni2carrier.put("260-98", "Play/P4");
		hni2carrier.put("260-6", "Play/P4");
		hni2carrier.put("260-1", "Polkomtel/Plus");
		hni2carrier.put("260-10", "Sferia");
		hni2carrier.put("260-13", "Sferia");
		hni2carrier.put("260-14", "Sferia");
		hni2carrier.put("260-2", "T-Mobile/ERA");
		hni2carrier.put("260-34", "T-Mobile/ERA");
		hni2carrier.put("260-15", "Tele2");
		hni2carrier.put("260-4", "Tele2");
		hni2carrier.put("268-3", "Optimus");
		hni2carrier.put("268-6", "TMN");
		hni2carrier.put("268-1", "Vodafone");
		hni2carrier.put("427-1", "Qtel");
		hni2carrier.put("427-2", "Vodafone");
		hni2carrier.put("647-0", "Orange");
		hni2carrier.put("647-2", "Outremer Telecom");
		hni2carrier.put("647-10", "SFR");
		hni2carrier.put("226-3", "Cosmote");
		hni2carrier.put("226-2", "Cosmote");
		hni2carrier.put("226-11", "Enigma Systems");
		hni2carrier.put("226-1", "Vodafone");
		hni2carrier.put("226-10", "Orange");
		hni2carrier.put("226-5", "RCS&RDS Digi Mobile");
		hni2carrier.put("226-6", "Telemobil/Zapp");
		hni2carrier.put("226-4", "Telemobil/Zapp");
		hni2carrier.put("250-12", "Baykal Westcom");
		hni2carrier.put("250-28", "Bee Line GSM");
		hni2carrier.put("250-", "CJSC AKOS");
		hni2carrier.put("250-20", "CJSC Arkhangelsk Mobile Network (CJSC Tele2 - Arkhangelsk)");
		
		hni2carrier.put("250-20", "CJSC Tele2-Smolensk");
		hni2carrier.put("250-", "CJSC Vainah Telecom (VTK)");
		hni2carrier.put("250-10", "DTC/Don Telecom");
		hni2carrier.put("250-13", "Kuban GSM");
		hni2carrier.put("250-2", "Megafon");
		hni2carrier.put("250-1", "MTS");
		hni2carrier.put("250-3", "NCC");
		hni2carrier.put("250-16", "NTC");
		hni2carrier.put("250-19", "OJSC Altaysvyaz");
		hni2carrier.put("250-99", "OJSC Vimpel-Communications (VimpelCom)");
		hni2carrier.put("250-11", "Orensot");
		hni2carrier.put("250-92", "Printelefone");
		hni2carrier.put("250-4", "Sibchallenge");
		hni2carrier.put("250-44", "StavTelesot");
		hni2carrier.put("250-93", "Telecom XXL");
		hni2carrier.put("250-17", "U-Tel/Ermak RMS");
		hni2carrier.put("250-39", "U-Tel/Ermak RMS");
		hni2carrier.put("250-5", "Yenisey Telecom");
		hni2carrier.put("250-15", "ZAO SMARTS");
		hni2carrier.put("250-7", "ZAO SMARTS");
		hni2carrier.put("635-14", "Airtel Rwanda Ltd");
		hni2carrier.put("635-10", "MTN/Rwandacell");
		hni2carrier.put("635-13", "TIGO");
		hni2carrier.put("356-110", "Cable & Wireless");
		hni2carrier.put("356-50", "Digicel");
		hni2carrier.put("356-70", "UTS Cariglobe");
		hni2carrier.put("358-110", "Cable & Wireless");
		hni2carrier.put("358-30", "Cingular Wireless");
		hni2carrier.put("358-50", "Digicel (St Lucia) Limited");
		hni2carrier.put("549-27", "Samoatel Mobile");
		hni2carrier.put("549-1", "Telecom Samoa Cellular Ltd.");
		hni2carrier.put("292-1", "Prima Telecom");
		hni2carrier.put("626-1", "CSTmovel");
		hni2carrier.put("901-14", "AeroMobile");
		hni2carrier.put("901-11", "InMarSAT");
		hni2carrier.put("901-12", "Maritime Communications Partner AS");
		hni2carrier.put("901-5", "Thuraya Satellite");
		hni2carrier.put("420-7", "Zain");
		hni2carrier.put("420-3", "Etihad/Etisalat/Mobily");
		hni2carrier.put("420-1", "STC/Al Jawal");
		hni2carrier.put("420-4", "Zain");
		hni2carrier.put("608-3", "Expresso/Sudatel");
		hni2carrier.put("608-2", "Sentel GSM");
		hni2carrier.put("608-1", "Orange/Sonatel");
		hni2carrier.put("220-3", "MTS/Telekom Srbija");
		hni2carrier.put("220-1", "Telenor/Mobtel");
		hni2carrier.put("220-2", "Telenor/Mobtel");
		hni2carrier.put("220-5", "VIP Mobile");
		hni2carrier.put("633-10", "Airtel");
		hni2carrier.put("633-1", "C&W");
		hni2carrier.put("633-2", "Smartcom");
		hni2carrier.put("619-3", "Africel");
		hni2carrier.put("619-5", "Africel");
		hni2carrier.put("619-1", "Zain/Celtel");
		hni2carrier.put("619-4", "Comium");
		hni2carrier.put("619-2", "Tigo/Millicom");
		hni2carrier.put("619-25", "Mobitel");
		hni2carrier.put("525-12", "GRID Communications Pte Ltd");
		hni2carrier.put("525-3", "MobileOne Ltd");
		hni2carrier.put("525-", "Nexwave Technologies Ltd");
		hni2carrier.put("525-2", "Singtel");
		hni2carrier.put("525-1", "Singtel");
		hni2carrier.put("525-7", "Singtel");
		hni2carrier.put("525-6", "Starhub");
		hni2carrier.put("525-5", "Starhub");
		hni2carrier.put("231-2", "T-Mobile");
		hni2carrier.put("231-4", "T-Mobile");
		hni2carrier.put("231-6", "O2");
		hni2carrier.put("231-15", "Orange");
		hni2carrier.put("231-5", "Orange");
		hni2carrier.put("231-1", "Orange");
		
		hni2carrier.put("293-41", "Mobitel");
		hni2carrier.put("293-40", "SI.Mobil");
		hni2carrier.put("293-64", "Mobitel");
		hni2carrier.put("293-70", "TusMobil");
		hni2carrier.put("540-2", "bemobile");
		hni2carrier.put("540-10", "BREEZE");
		hni2carrier.put("540-1", "BREEZE");
		hni2carrier.put("637-30", "Golis");
		hni2carrier.put("637-19", "HorTel");
		hni2carrier.put("637-60", "Nationlink");
		hni2carrier.put("637-10", "Nationlink");
		hni2carrier.put("637-4", "Somafone");
		hni2carrier.put("637-82", "Telcom Mobile Somalia");
		hni2carrier.put("637-1", "Telesom");
		hni2carrier.put("655-2", "8.ta");
		hni2carrier.put("655-21", "Cape Town Metropolitan");
		hni2carrier.put("655-7", "Cell C");
		hni2carrier.put("655-12", "MTN");
		hni2carrier.put("655-10", "MTN");
		hni2carrier.put("655-6", "Sentech");
		hni2carrier.put("655-", "Virgin Mobile SA (Pty) Ltd");
		hni2carrier.put("655-1", "Vodacom");
		hni2carrier.put("655-19", "Wireless Business Solutions (Pty) Ltd");
		hni2carrier.put("214-23", "Lycamobile SL");
		hni2carrier.put("214-22", "Movistar");
		hni2carrier.put("214-15", "BT Espana Compania de Servicios Globales de Telecomunicaciones SAU");
		hni2carrier.put("214-18", "Cableuropa SAU (ONO)");
		hni2carrier.put("214-", "Carrefouronline SLU");
		hni2carrier.put("214-8", "Euskaltel SA");
		hni2carrier.put("214-20", "fonYou Wireless SL");
		hni2carrier.put("214-21", "Jazz Telecom SAU");
		hni2carrier.put("214-19", "KPN Spain SLU");
		hni2carrier.put("214-26", "Lleida");
		hni2carrier.put("214-25", "Lycamobile SL");
		hni2carrier.put("214-7", "Movistar");
		hni2carrier.put("214-3", "Orange");
		hni2carrier.put("214-9", "Orange");
		hni2carrier.put("214-17", "R Cable y Telecomunicaciones Galicia SA");
		hni2carrier.put("214-16", "Telecable de Asturias SA");
		hni2carrier.put("214-5", "Movistar");
		hni2carrier.put("214-27", "Truphone");
		hni2carrier.put("214-6", "Vodafone");
		hni2carrier.put("214-1", "Vodafone");
		hni2carrier.put("214-4", "Yoigo");
		hni2carrier.put("413-5", "Bharti Airtel");
		hni2carrier.put("413-3", "Etisalat/Tigo");
		hni2carrier.put("413-8", "H3G Hutchison");
		hni2carrier.put("413-1", "Mobitel Ltd.");
		hni2carrier.put("413-2", "MTN/Dialog");
		hni2carrier.put("308-1", "Ameris");
		hni2carrier.put("360-110", "C & W");
		hni2carrier.put("360-10", "Cingular");
		hni2carrier.put("360-50", "Digicel");
		hni2carrier.put("360-70", "Digicel");
		hni2carrier.put("634-0", "Canar Telecom");
		hni2carrier.put("634-22", "MTN");
		hni2carrier.put("634-2", "MTN");
		hni2carrier.put("634-15", "Sudani One");
		hni2carrier.put("634-7", "Sudani One");
		hni2carrier.put("634-5", "Vivacell");
		hni2carrier.put("634-8", "Vivacell");
		hni2carrier.put("634-1", "ZAIN/Mobitel");
		hni2carrier.put("746-3", "Digicel");
		hni2carrier.put("746-2", "Telesur");
		hni2carrier.put("746-1", "Telesur");
		hni2carrier.put("746-4", "UNIQA");
		hni2carrier.put("653-10", "Swazi MTN");
		hni2carrier.put("653-1", "SwaziTelecom");
		hni2carrier.put("240-16", "42 Telecom");
		hni2carrier.put("240-", "42 Telecom");
		hni2carrier.put("240-26", "Beepsend");
		hni2carrier.put("240-0", "Compatel");
		hni2carrier.put("240-25", "Digitel Mobile Srl");
		hni2carrier.put("240-22", "Eu Tel AB");
		hni2carrier.put("240-27", "Fogg Mobile AB");
		hni2carrier.put("240-18", "Generic Mobile Systems Sweden AB");
		
		hni2carrier.put("240-17", "Gotalandsnatet AB");
		hni2carrier.put("240-2", "H3G Access AB");
		hni2carrier.put("240-4", "H3G Access AB");
		hni2carrier.put("240-36", "ID Mobile");
		hni2carrier.put("240-", "ID Mobile");
		hni2carrier.put("240-23", "Infobip Ltd.");
		hni2carrier.put("240-11", "Lindholmen Science Park AB");
		hni2carrier.put("240-12", "Lycamobile Sweden Ltd");
		hni2carrier.put("240-29", "Mercury International Carrier Services");
		hni2carrier.put("240-3", "Orange");
		hni2carrier.put("240-10", "Spring Mobil AB");
		hni2carrier.put("240-14", "TDC Sverige AB");
		hni2carrier.put("240-24", "Tele2 Sverige AB");
		hni2carrier.put("240-7", "Tele2 Sverige AB");
		hni2carrier.put("240-5", "Tele2 Sverige AB");
		hni2carrier.put("240-8", "Telenor (Vodafone)");
		hni2carrier.put("240-6", "Telenor (Vodafone)");
		hni2carrier.put("240-9", "Telenor Mobile Sverige AS");
		hni2carrier.put("240-1", "Telia Mobile");
		hni2carrier.put("240-0", "EUTel");
		hni2carrier.put("240-13", "Ventelo Sverige AB");
		hni2carrier.put("240-20", "Wireless Maingate AB");
		hni2carrier.put("240-15", "Wireless Maingate AB");
		hni2carrier.put("228-51", "BebbiCell AG");
		hni2carrier.put("228-9", "Comfone AG");
		hni2carrier.put("228-5", "Comfone AG");
		hni2carrier.put("228-999", "Fix Line CH");
		hni2carrier.put("228-7", "TDC Sunrise");
		hni2carrier.put("228-54", "Lycamobile AG");
		hni2carrier.put("228-52", "Mundio Mobile AG");
		hni2carrier.put("228-3", "Orange");
		hni2carrier.put("228-1", "Swisscom");
		hni2carrier.put("228-", "Swissphone Wireless AG");
		hni2carrier.put("228-2", "TDC Sunrise");
		hni2carrier.put("228-12", "TDC Sunrise");
		hni2carrier.put("228-8", "TDC Sunrise");
		hni2carrier.put("228-53", "upc cablecom GmbH");
		hni2carrier.put("417-2", "MTN/Spacetel");
		hni2carrier.put("417-9", "Syriatel Holdings");
		hni2carrier.put("417-1", "Syriatel Holdings");
		hni2carrier.put("466-68", "ACeS Taiwan - ACeS Taiwan Telecommunications Co Ltd");
		hni2carrier.put("466-11", "Chunghwa Telecom LDM");
		hni2carrier.put("466-92", "Chunghwa Telecom LDM");
		hni2carrier.put("466-1", "Far EasTone");
		hni2carrier.put("466-88", "KG Telecom");
		hni2carrier.put("466-93", "Mobitai");
		hni2carrier.put("466-97", "Taiwan Cellular");
		hni2carrier.put("466-99", "TransAsia");
		hni2carrier.put("466-89", "VIBO");
		hni2carrier.put("436-2", "Tcell/JC Somoncom");
		hni2carrier.put("436-5", "Bee Line");
		hni2carrier.put("436-12", "Tcell/JC Somoncom");
		hni2carrier.put("436-1", "Tcell/JC Somoncom");
		hni2carrier.put("436-4", "Babilon-M");
		hni2carrier.put("436-3", "MLT/TT mobile");
		hni2carrier.put("640-8", "Benson Informatics Ltd");
		hni2carrier.put("640-6", "Dovetel (T) Ltd");
		hni2carrier.put("640-9", "ExcellentCom (T) Ltd");
		hni2carrier.put("640-", "MyCell Company Ltd");
		hni2carrier.put("640-11", "Smile Communications Tanzania Ltd");
		hni2carrier.put("640-7", "Tanzania Telecommunications Company Ltd (TTCL)");
		hni2carrier.put("640-2", "TIGO/MIC");
		hni2carrier.put("640-4", "Vodacom Ltd");
		hni2carrier.put("640-5", "ZAIN/Celtel");
		hni2carrier.put("640-3", "Zantel/Zanzibar Telecom");
		hni2carrier.put("520-20", "ACeS Thailand - ACeS Regional Services Co Ltd");
		hni2carrier.put("520-15", "ACT Mobile");
		hni2carrier.put("520-1", "AIS/Advanced Info Service");
		hni2carrier.put("520-0", "Hutch/CAT CDMA");
		hni2carrier.put("520-23", "Digital Phone Co.");
		hni2carrier.put("520-18", "Total Access (DTAC)");
		hni2carrier.put("520-99", "True Move/Orange");
		hni2carrier.put("514-2", "Timor Telecom");
		hni2carrier.put("615-2", "Telecel/MOOV");
		hni2carrier.put("615-1", "Togo Telecom/TogoCELL");
		hni2carrier.put("539-43", "Shoreline Communication");
		hni2carrier.put("539-1", "Tonga Communications");
		hni2carrier.put("374-130", "Digicel");
		hni2carrier.put("374-12", "Bmobile/TSTT");
		hni2carrier.put("605-1", "Orange");
		hni2carrier.put("605-3", "Orascom Telecom");
		hni2carrier.put("605-2", "Tunisie Telecom");
		hni2carrier.put("286-3", "AVEA/Aria");
		hni2carrier.put("286-4", "AVEA/Aria");
		hni2carrier.put("286-2", "Vodafone-Telsim");
		hni2carrier.put("286-1", "Turkcell");
		hni2carrier.put("438-1", "Barash Communication");
		hni2carrier.put("438-2", "TM-Cell");
		hni2carrier.put("641-1", "Celtel");
		hni2carrier.put("641-66", "i-Tel Ltd");
		hni2carrier.put("641-30", "K2 Telecom Ltd");
		hni2carrier.put("641-10", "MTN Ltd.");
		hni2carrier.put("641-14", "Orange");
		
		hni2carrier.put("641-33", "Smile Communications Uganda Ltd");
		hni2carrier.put("641-18", "Suretelecom Uganda Ltd");
		hni2carrier.put("641-11", "Uganda Telecom Ltd.");
		hni2carrier.put("641-22", "Warid Telecom");
		hni2carrier.put("255-6", "Astelit/LIFE");
		hni2carrier.put("255-5", "Golden Telecom");
		hni2carrier.put("255-39", "Golden Telecom");
		hni2carrier.put("255-3", "KyivStar");
		hni2carrier.put("255-67", "KyivStar");
		hni2carrier.put("255-50", "UMC/MTS");
		hni2carrier.put("255-2", "Beeline");
		hni2carrier.put("255-1", "UMC/MTS");
		hni2carrier.put("255-7", "Utel");
		hni2carrier.put("255-68", "Beeline");
		hni2carrier.put("424-3", "DU");
		hni2carrier.put("424-2", "Etisalat");
		hni2carrier.put("234-", "");
		hni2carrier.put("234-3", "Airtel/Vodafone");
		hni2carrier.put("234-77", "BT Group");
		hni2carrier.put("234-76", "BT Group");
		hni2carrier.put("234-7", "Cable and Wireless");
		hni2carrier.put("234-92", "Cable and Wireless");
		hni2carrier.put("234-36", "Calbe and Wireless Isle of Man");
		hni2carrier.put("234-18", "Cloud9/wire9 Tel.");
		hni2carrier.put("235-2", "Everyth. Ev.wh.");
		hni2carrier.put("234-17", "FlexTel");
		hni2carrier.put("234-55", "Guernsey Telecoms");
		hni2carrier.put("234-14", "HaySystems");
		hni2carrier.put("234-94", "Hutchison 3G");
		hni2carrier.put("234-20", "Hutchison 3G");
		hni2carrier.put("234-75", "Inquam Telecom Ltd");
		hni2carrier.put("234-50", "Jersey Telecom");
		hni2carrier.put("234-35", "JSC Ingenicum");
		hni2carrier.put("234-26", "Lycamobile");
		hni2carrier.put("234-58", "Manx Telecom");
		hni2carrier.put("234-1", "Mapesbury C. Ltd");
		hni2carrier.put("234-28", "Marthon Telecom");
		hni2carrier.put("234-10", "O2 Ltd.");
		hni2carrier.put("234-2", "O2 Ltd.");
		hni2carrier.put("234-11", "O2 Ltd.");
		hni2carrier.put("234-8", "OnePhone");
		hni2carrier.put("234-16", "Opal Telecom");
		hni2carrier.put("234-34", "Everyth. Ev.wh./Orange");
		hni2carrier.put("234-33", "Everyth. Ev.wh./Orange");
		hni2carrier.put("234-19", "PMN/Teleware");
		hni2carrier.put("234-12", "Railtrack Plc");
		hni2carrier.put("234-22", "Routotelecom");
		hni2carrier.put("234-24", "Stour Marine");
		hni2carrier.put("234-37", "Synectiv Ltd.");
		hni2carrier.put("234-30", "Everyth. Ev.wh./T-Mobile");
		hni2carrier.put("234-31", "Everyth. Ev.wh./T-Mobile");
		hni2carrier.put("234-32", "Everyth. Ev.wh./T-Mobile");
		hni2carrier.put("234-27", "Vodafone");
		hni2carrier.put("234-9", "Tismi");
		hni2carrier.put("234-25", "Truphone");
		hni2carrier.put("234-51", "Jersey Telecom");
		hni2carrier.put("234-23", "Vectofone Mobile Wifi");
		hni2carrier.put("234-91", "Vodafone");
		hni2carrier.put("234-15", "Vodafone");
		hni2carrier.put("234-78", "Wave Telecom Ltd");
		hni2carrier.put("310-880", "Advantage Cell. Sys. Inc.");
		hni2carrier.put("310-31", "AERIAL");
		hni2carrier.put("310-850", "Aeris Comm. Inc.");
		hni2carrier.put("310-640", "Airadigm Comm.");
		hni2carrier.put("310-510", "Airtel Wireless LLC");
		hni2carrier.put("310-430", "Unknown");
		hni2carrier.put("310-190", "Unknown");
		hni2carrier.put("310-560", "American Cellular Corp.");
		hni2carrier.put("310-710", "Artic Slope Tel. Coop.");
		hni2carrier.put("310-980", "AT&T Wireless Inc.");
		hni2carrier.put("310-380", "AT&T Wireless Inc.");
		hni2carrier.put("310-830", "Caprock Cellular Ltd.");
		hni2carrier.put("311-130", "Unknown");
		hni2carrier.put("311-190", "Unknown");
		hni2carrier.put("310-30", "Centennial Comm.");
		hni2carrier.put("310-570", "Chinook Wireless");
		hni2carrier.put("311-120", "Choice Phone LLC");
		hni2carrier.put("310-480", "Choice Phone LLC");
		hni2carrier.put("310-420", "Cincinnati Bell Wireless LLC");
		hni2carrier.put("310-410", "Cingular Wireless");
		hni2carrier.put("310-180", "Cingular Wireless");
		
		hni2carrier.put("310-170", "Cingular Wireless");
		hni2carrier.put("310-150", "Cingular Wireless");
		hni2carrier.put("310-620", "Coleman County Telco /Trans TX");
		hni2carrier.put("310-630", "Comtel PCS Mainstreet LP");
		hni2carrier.put("310-40", "Concho Cellular Telephone Co. Inc.");
		hni2carrier.put("310-690", "Conestoga Wireless");
		hni2carrier.put("310-60", "Consolidated Telcom");
		hni2carrier.put("310-6", "Consolidated Telcom");
		hni2carrier.put("310-80", "Unknown");
		hni2carrier.put("310-8", "Unknown");
		hni2carrier.put("310-16", "Cricket Communications");
		hni2carrier.put("310-440", "Dobson Cellular Systems");
		hni2carrier.put("310-990", "E.N.M.R. Telephone Coop.");
		hni2carrier.put("311-70", "Easterbrooke");
		hni2carrier.put("310-90", "Edge Wireless LLC");
		hni2carrier.put("310-9", "Edge Wireless LLC");
		hni2carrier.put("310-610", "Elkhart TelCo. / Epic Touch Co.");
		hni2carrier.put("311-311", "Farmers");
		hni2carrier.put("310-970", "Globalstar USA");
		hni2carrier.put("310-340", "High Plains MidW. LLC / Wetlink");
		hni2carrier.put("311-110", "High Plains Wireless");
		hni2carrier.put("310-7", "Unknown");
		hni2carrier.put("310-70", "Unknown");
		hni2carrier.put("311-250", "i CAN_GSM");
		hni2carrier.put("310-770", "Iowa Wireless Serv. LP");
		hni2carrier.put("310-650", "Jasper");
		hni2carrier.put("310-870", "Kaplan TelCo Inc.");
		hni2carrier.put("311-310", "Lamar County Cellular");
		hni2carrier.put("311-90", "Long Lines Wireless");
		hni2carrier.put("311-140", "MBO Wireless Inc./Cross TelCo");
		hni2carrier.put("310-10", "MCI");
		hni2carrier.put("310-780", "Message Express Co. / Airlink PCS");
		hni2carrier.put("311-0", "Mid-Tex Cellular Ltd.");
		hni2carrier.put("310-400", "Minnesota South. Wirel. Co. / Hickory");
		hni2carrier.put("310-13", "Mobile Tel Inc.");
		hni2carrier.put("310-34", "Nevada Wireless LLC");
		hni2carrier.put("310-100", "New Mexico RSA 4 East");
		hni2carrier.put("316-10", "Nextel Comm.");
		hni2carrier.put("310-450", "North East Cell.");
		hni2carrier.put("310-670", "Northstar");
		hni2carrier.put("310-680", "Noverr Publishing Inc./ NPI Wireless");
		hni2carrier.put("310-540", "Oklahoma Western TelCo.");
		hni2carrier.put("310-760", "Panhandle Telco. Sys Inc.");
		hni2carrier.put("310-580", "PCS ONE");
		hni2carrier.put("311-170", "PetroCom");
		hni2carrier.put("311-80", "Pine Cellular");
		hni2carrier.put("310-790", "PinPoint Comm.Inc.");
		hni2carrier.put("310-940", "Poka Lambro Telco Ltd.");
		hni2carrier.put("310-500", "Public Service Cellular Inc.");
		hni2carrier.put("310-890", "Rural Cellular Corporation");
		hni2carrier.put("310-46", "SIMMETRY");
		hni2carrier.put("311-260", "SLO Cellular Inc / Cellular One of San Luis");
		hni2carrier.put("310-15", "Unknown");
		hni2carrier.put("310-11", "Southern Comm. Inc.");
		hni2carrier.put("310-910", "Unknown");
		hni2carrier.put("310-120", "Sprint");
		hni2carrier.put("310-2", "Sprint Spectrum");
		hni2carrier.put("310-4", "T-Mobile");
		hni2carrier.put("310-210", "T-Mobile");
		hni2carrier.put("310-330", "T-Mobile");
		hni2carrier.put("310-300", "T-Mobile");
		hni2carrier.put("310-320", "T-Mobile");
		hni2carrier.put("310-290", "T-Mobile");
		hni2carrier.put("310-800", "T-Mobile");
		hni2carrier.put("310-280", "T-Mobile");
		hni2carrier.put("310-310", "T-Mobile");
		hni2carrier.put("310-250", "T-Mobile");
		hni2carrier.put("310-160", "T-Mobile");
		hni2carrier.put("310-240", "T-Mobile");
		hni2carrier.put("310-200", "T-Mobile");
		hni2carrier.put("310-230", "T-Mobile");
		hni2carrier.put("310-270", "T-Mobile");
		hni2carrier.put("310-220", "T-Mobile");
		hni2carrier.put("310-260", "T-Mobile");
		hni2carrier.put("310-660", "T-Mobile");
		hni2carrier.put("310-900", "Taylor Telco.");
		hni2carrier.put("310-740", "Telemetrix Technologies");
		hni2carrier.put("310-14", "Testing");
		hni2carrier.put("310-950", "Unknown");
		hni2carrier.put("310-960", "Unknown");
		hni2carrier.put("310-460", "TMP Corporation");
		hni2carrier.put("310-490", "Triton PCS");
		hni2carrier.put("310-20", "Union Telephone Company");
		hni2carrier.put("310-38", "USA 3650 AT&T");
		hni2carrier.put("310-520", "VeriSign");
		hni2carrier.put("310-3", "Unknown");
		hni2carrier.put("310-12", "Unknown");
		hni2carrier.put("310-23", "Unknown");
		hni2carrier.put("310-24", "Unknown");
		hni2carrier.put("310-25", "Unknown");
		hni2carrier.put("310-530", "West Virginia Wireless");
		hni2carrier.put("310-590", "Unknown");
		hni2carrier.put("310-26", "Unknown");
		hni2carrier.put("310-390", "Yorkville Telephone Cooperative");
		hni2carrier.put("0-0", "");
		hni2carrier.put("748-1", "Ancel/Antel");
		hni2carrier.put("748-3", "Ancel/Antel");
		hni2carrier.put("748-10", "Claro/AM Wireless");
		hni2carrier.put("748-7", "MOVISTAR");
		
		hni2carrier.put("434-4", "Bee Line/Unitel");
		hni2carrier.put("434-1", "Buztel");
		hni2carrier.put("434-5", "Ucell/Coscom");
		hni2carrier.put("434-7", "MTS/Uzdunrobita");
		hni2carrier.put("434-2", "Uzmacom");
		hni2carrier.put("541-0", "DigiCel");
		hni2carrier.put("541-1", "SMILE");
		hni2carrier.put("734-2", "DigiTel C.A.");
		hni2carrier.put("734-3", "DigiTel C.A.");
		hni2carrier.put("734-1", "DigiTel C.A.");
		hni2carrier.put("734-6", "Movilnet C.A.");
		hni2carrier.put("734-4", "Movistar/TelCel");
		hni2carrier.put("452-7", "GTEL Mobile JSC");
		hni2carrier.put("452-1", "Mobifone");
		hni2carrier.put("452-3", "S-Fone/Telecom");
		hni2carrier.put("452-", "Vietnam Posts and Telecommunications Group (VNPT)");
		hni2carrier.put("452-5", "VietnaMobile");
		hni2carrier.put("452-8", "Viettel Mobile");
		hni2carrier.put("452-6", "Viettel Mobile");
		hni2carrier.put("452-4", "Viettel Mobile");
		hni2carrier.put("452-2", "Vinaphone");
		hni2carrier.put("376-350", "Cable & Wireless (Turks & Caicos)");
		hni2carrier.put("376-50", "Digicel");
		hni2carrier.put("376-352", "IslandCom");
		hni2carrier.put("421-1", "Sabaphone");
		hni2carrier.put("421-2", "MTN/Spacetel");
		hni2carrier.put("421-4", "HITS/Y Unitel");
		hni2carrier.put("421-3", "Yemen Mob. CDMA");
		hni2carrier.put("645-1", "Zain/Celtel");
		hni2carrier.put("645-2", "MTN/Telecel");
		hni2carrier.put("645-3", "Cell Z/MTS");
		hni2carrier.put("648-4", "Econet");
		hni2carrier.put("648-1", "Net One");
		hni2carrier.put("648-3", "Telecel");
	};
	
	public Integer getMcc() {
		return mcc;
	}

	public Integer getMnc() {
		return mnc;
	}
}