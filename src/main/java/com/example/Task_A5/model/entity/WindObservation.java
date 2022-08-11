package com.example.Task_A5.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wind_observation")
public class WindObservation {
	
	@Id
	private String id;
	@Column
	private String place;
	@Column(name = "track_entries")
	private Integer trackEnrty;
	@Column
	private Date date;
	@Column
	private Date time;
	@Column(name = "record_identifier")
	private String recordId;
	@Column(name = "status_of_system")
	private String statusOfSystem;
	@Column
	private Double latitude;
	@Column
	private String hemisphereNS;
	@Column
	private Double longitude;
	@Column
	private String hemisphereEW;
	@Column(name = "maximum_sustained_wind")
	private Integer maximumSustainedWind;
	@Column(name = "minimium_pressure")
	private Integer minimumPressure;
	@Column
	private Integer northeastern;
	@Column
	private Integer southeastern;
	@Column
	private Integer southwestern;
	@Column
	private Integer northwestern;
	@Column(name = "northeastern2")
	private Integer northeasternSecond;
	@Column(name = "southeastern2")
	private Integer southeasternSecond;
	@Column(name = "southwestern2")
	private Integer southwesternSecond;
	@Column(name = "northwestern2")
	private Integer northwesternSecond;
	@Column(name = "northeastern3")
	private Integer northeasternThird;
	@Column(name = "southeastern3")
	private Integer southeasternThird;
	@Column(name = "southwestern3")
	private Integer southwesternThird;
	@Column(name = "northwestern3")
	private Integer northwesternThird;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Integer getTrackEnrty() {
		return trackEnrty;
	}
	public void setTrackEnrty(Integer trackEnrty) {
		this.trackEnrty = trackEnrty;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getRecordId() {
		return recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getStatusOfSystem() {
		return statusOfSystem;
	}
	public void setStatusOfSystem(String statusOfSystem) {
		this.statusOfSystem = statusOfSystem;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public String getHemisphereNS() {
		return hemisphereNS;
	}
	public void setHemisphereNS(String hemisphereNS) {
		this.hemisphereNS = hemisphereNS;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getHemisphereEW() {
		return hemisphereEW;
	}
	public void setHemisphereEW(String hemisphereEW) {
		this.hemisphereEW = hemisphereEW;
	}
	public Integer getMaximumSustainedWind() {
		return maximumSustainedWind;
	}
	public void setMaximumSustainedWind(Integer maximumSustainedWind) {
		this.maximumSustainedWind = maximumSustainedWind;
	}
	public Integer getMinimumPressure() {
		return minimumPressure;
	}
	public void setMinimumPressure(Integer minimumPressure) {
		this.minimumPressure = minimumPressure;
	}
	public Integer getNortheastern() {
		return northeastern;
	}
	public void setNortheastern(Integer northeastern) {
		this.northeastern = northeastern;
	}
	public Integer getSoutheastern() {
		return southeastern;
	}
	public void setSoutheastern(Integer southeastern) {
		this.southeastern = southeastern;
	}
	public Integer getSouthwestern() {
		return southwestern;
	}
	public void setSouthwestern(Integer southwestern) {
		this.southwestern = southwestern;
	}
	public Integer getNorthwestern() {
		return northwestern;
	}
	public void setNorthwestern(Integer northwestern) {
		this.northwestern = northwestern;
	}
	public Integer getNortheasternSecond() {
		return northeasternSecond;
	}
	public void setNortheasternSecond(Integer northeasternSecond) {
		this.northeasternSecond = northeasternSecond;
	}
	public Integer getSoutheasternSecond() {
		return southeasternSecond;
	}
	public void setSoutheasternSecond(Integer southeasternSecond) {
		this.southeasternSecond = southeasternSecond;
	}
	public Integer getSouthwesternSecond() {
		return southwesternSecond;
	}
	public void setSouthwesternSecond(Integer southwesternSecond) {
		this.southwesternSecond = southwesternSecond;
	}
	public Integer getNorthwesternSecond() {
		return northwesternSecond;
	}
	public void setNorthwesternSecond(Integer northwesternSecond) {
		this.northwesternSecond = northwesternSecond;
	}
	public Integer getNortheasternThird() {
		return northeasternThird;
	}
	public void setNortheasternThird(Integer northeasternThird) {
		this.northeasternThird = northeasternThird;
	}
	public Integer getSoutheasternThird() {
		return southeasternThird;
	}
	public void setSoutheasternThird(Integer southeasternThird) {
		this.southeasternThird = southeasternThird;
	}
	public Integer getSouthwesternThird() {
		return southwesternThird;
	}
	public void setSouthwesternThird(Integer southwesternThird) {
		this.southwesternThird = southwesternThird;
	}
	public Integer getNorthwesternThird() {
		return northwesternThird;
	}
	public void setNorthwesternThird(Integer northwesternThird) {
		this.northwesternThird = northwesternThird;
	}

}
