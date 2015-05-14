package org.javaprotrepticon.android.geonamesbrowser.storage.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable (tableName = "alternate_name")
public class AlternateName {

	@DatabaseField(columnName = "id", id = true)
	private Integer id;
	
	@DatabaseField(columnName = "geoname_id")
	private GeoName geoName;
	
	@DatabaseField(columnName = "iso_language")
	private String isoLanguage;
	
	@DatabaseField(columnName = "alternate_name")
	private String alternateName;
	
	@DatabaseField(columnName = "is_preferred_name")
	private Boolean isPreferredName;
	
	@DatabaseField(columnName = "is_short_name")
	private Boolean isShortName;
	
	@DatabaseField(columnName = "is_colloquial")
	private Boolean isColloquial;
	
	@DatabaseField(columnName = "is_historical")
	private Boolean isHistorical;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public GeoName getGeoName() {
		return geoName;
	}

	public void setGeoName(GeoName geoName) {
		this.geoName = geoName;
	}

	public String getIsoLanguage() {
		return isoLanguage;
	}

	public void setIsoLanguage(String isoLanguage) {
		this.isoLanguage = isoLanguage;
	}

	public String getAlternateName() {
		return alternateName;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	public Boolean getIsPreferredName() {
		return isPreferredName;
	}

	public void setIsPreferredName(Boolean isPreferredName) {
		this.isPreferredName = isPreferredName;
	}

	public Boolean getIsShortName() {
		return isShortName;
	}

	public void setIsShortName(Boolean isShortName) {
		this.isShortName = isShortName;
	}

	public Boolean getIsColloquial() {
		return isColloquial;
	}

	public void setIsColloquial(Boolean isColloquial) {
		this.isColloquial = isColloquial;
	}

	public Boolean getIsHistorical() {
		return isHistorical;
	}

	public void setIsHistorical(Boolean isHistorical) {
		this.isHistorical = isHistorical;
	}
	
}
