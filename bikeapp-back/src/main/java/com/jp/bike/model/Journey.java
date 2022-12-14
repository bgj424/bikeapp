package com.jp.bike.model;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bikeapp_journeys")
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "Journey_Type")
public class Journey {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private @Id Integer id;
	private LocalDateTime departureDate;
	private LocalDateTime returnDate;
	private String departureStationId;
	private String departureStationName;
	private String returnStationId;
	private String returnStationName;
	@Column(name = "distanceCovered")
	private Integer distanceCoveredInMeters;
	@Column(name = "duration")
	private Integer durationInSeconds;

	public Journey() {}

	public Journey(
			LocalDateTime departureDate, LocalDateTime returnDate, String departureStationId, 
			String departureStationName, String returnStationId, String returnStationName, 
			Integer distanceCoveredInMeters, Integer durationInSeconds) {

		this.departureDate = departureDate;
		this.returnDate = returnDate;
		this.departureStationId = departureStationId;
		this.departureStationName = departureStationName;
		this.returnStationId = returnStationId;
		this.returnStationName = returnStationName;
		this.distanceCoveredInMeters = distanceCoveredInMeters;
		this.durationInSeconds = durationInSeconds;
	}

	public Integer getId() {
		return id;
	}

	public LocalDateTime getDepartureDate() {
		return departureDate;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public String getDepartureStationId() {
		return departureStationId;
	}

	public String getDepartureStationName() {
		return departureStationName;
	}

	public String getReturnStationId() {
		return returnStationId;
	}

	public String getReturnStationName() {
		return returnStationName;
	}

	public Integer getDistanceCoveredInMeters() {
		return distanceCoveredInMeters;
	}

	public Integer getDurationInSeconds() {
		return durationInSeconds;
	}
	
}