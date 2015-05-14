package org.javaprotrepticon.android.geonamesbrowser.storage.model;

import java.sql.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable (tableName = "geoname")
public class GeoName {
	
	/*
	 * integer id of record in geonames database
	 */
	@DatabaseField(columnName = "geoname_id", id = true)
	private Integer id;
	
	/*
	 * name of geographical point
	 */
	@DatabaseField(columnName = "name")
	private String name;
	
	/*
	 * name of geographical point in plain ascii characters
	 */
	@DatabaseField(columnName = "ascii_name")
	private String asciiName;
	
	/*
	 * alternatenames, comma separated
	 */
	@DatabaseField(columnName = "alternate_names")
	private String alternateNames;
	
	/*
	 * latitude in decimal degrees (wgs84)
	 */
	@DatabaseField(columnName = "latitude")
	private Double latitude;
	
	/*
	 * longitude in decimal degrees (wgs84)
	 */
	@DatabaseField(columnName = "longitude")
	private Double longitude;
	
	/*
	 * see http://www.geonames.org/export/codes.html
	 */
	@DatabaseField(columnName = "feature")
	private String feature;
	
	/*
	 * see http://www.geonames.org/export/codes.html
	 */
	@DatabaseField(columnName = "feature_code")
	private String featureCode;
	
	/*
	 * ISO-3166 2-letter country code, 2 characters
	 */
	@DatabaseField(columnName = "country_code")
	private String countryCode;
	
	/*
	 * alternate country codes, comma separated, 
	 * ISO-3166 2-letter country code, 60 characters
	 */
	@DatabaseField(columnName = "cc2")
	private String cc2;
	
	/*
	 * fipscode (subject to change to iso code), 
	 * see exceptions below, see file admin1Codes.txt 
	 * for display names of this code
	 */
	@DatabaseField(columnName = "admin1_code")
	private String admin1Code;
	
	/*
	 * code for the second administrative division, 
	 * a county in the US, see file admin2Codes.txt
	 */
	@DatabaseField(columnName = "admin2_code")
	private String admin2Code;
	
	/*
	 * code for third level administrative division
	 */
	@DatabaseField(columnName = "admin3_code")
	private String admin3Code;
	
	/*
	 * code for fourth level administrative division
	 */
	@DatabaseField(columnName = "admin4_code")
	private String admin4Code;
	
	/*
	 * 
	 */
	@DatabaseField(columnName = "population")
	private Integer population;
	
	/*
	 * in meters
	 */
	@DatabaseField(columnName = "elevation")
	private Integer elevation;
	
	/*
	 * digital elevation model, srtm3 or gtopo30, 
	 * average elevation of 3''x3'' (ca 90mx90m) or 
	 * 30''x30'' (ca 900mx900m) area in meters. 
	 * srtm processed by cgiar/ciat
	 */
	@DatabaseField(columnName = "dem")
	private Integer dem;
	
	/*
	 * the timezone id (see file timeZone.txt)
	 */
	@DatabaseField(columnName = "timezone")
	private String timezone;
	
	/*
	 * date of last modification in yyyy-MM-dd format
	 */
	@DatabaseField(columnName = "modification")
	private Date modification;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAsciiName() {
		return asciiName;
	}

	public void setAsciiName(String asciiName) {
		this.asciiName = asciiName;
	}

	public String getAlternateNames() {
		return alternateNames;
	}

	public void setAlternateNames(String alternateNames) {
		this.alternateNames = alternateNames;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public String getFeatureCode() {
		return featureCode;
	}

	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCc2() {
		return cc2;
	}

	public void setCc2(String cc2) {
		this.cc2 = cc2;
	}

	public String getAdmin1Code() {
		return admin1Code;
	}

	public void setAdmin1Code(String admin1Code) {
		this.admin1Code = admin1Code;
	}

	public String getAdmin2Code() {
		return admin2Code;
	}

	public void setAdmin2Code(String admin2Code) {
		this.admin2Code = admin2Code;
	}

	public String getAdmin3Code() {
		return admin3Code;
	}

	public void setAdmin3Code(String admin3Code) {
		this.admin3Code = admin3Code;
	}

	public String getAdmin4Code() {
		return admin4Code;
	}

	public void setAdmin4Code(String admin4Code) {
		this.admin4Code = admin4Code;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public Integer getElevation() {
		return elevation;
	}

	public void setElevation(Integer elevation) {
		this.elevation = elevation;
	}

	public Integer getDem() {
		return dem;
	}

	public void setDem(Integer dem) {
		this.dem = dem;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public Date getModification() {
		return modification;
	}

	public void setModification(Date modification) {
		this.modification = modification;
	}
	
}
