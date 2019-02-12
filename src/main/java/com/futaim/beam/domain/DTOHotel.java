package com.futaim.beam.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Anas Quedan
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DTOHotel extends Hotel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6633365467122476706L;

	@NotNull
	private String hotelName;

	@NotNull
	private Provider provider;


	@NotNull
	private Integer fare;

	@NotNull
	private List<String> amenities;

	@NotNull
	private Integer rate;

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the provider
	 */
	public Provider getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	/**
	 * @return the fare
	 */
	public Integer getFare() {
		return fare;
	}

	/**
	 * @param fare the fare to set
	 */
	public void setFare(Integer fare) {
		this.fare = fare;
	}

	/**
	 * @return the amenities
	 */
	public List<String> getAmenities() {
		return amenities;
	}

	/**
	 * @param amenities the amenities to set
	 */
	public void setAmenities(List<String> amenities) {
		this.amenities = amenities;
	}

	/**
	 * @return the rate
	 */
	public Integer getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(Integer rate) {
		this.rate = rate;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amenities == null) ? 0 : amenities.hashCode());
		result = prime * result + ((fare == null) ? 0 : fare.hashCode());
		result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
		result = prime * result + ((provider == null) ? 0 : provider.hashCode());
		result = prime * result + ((rate == null) ? 0 : rate.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DTOHotel other = (DTOHotel) obj;
		if (amenities == null) {
			if (other.amenities != null)
				return false;
		} else if (!amenities.equals(other.amenities))
			return false;
		if (fare == null) {
			if (other.fare != null)
				return false;
		} else if (!fare.equals(other.fare))
			return false;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		if (provider != other.provider)
			return false;
		if (rate == null) {
			if (other.rate != null)
				return false;
		} else if (!rate.equals(other.rate))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DTOHotel [hotelName=" + hotelName + ", provider=" + provider + ", fare=" + fare + ", amenities="
				+ amenities + ", rate=" + rate + ", getCity()=" + getCity() + ", getFromDate()=" + getFromDate()
				+ ", getToDate()=" + getToDate() + ", getAdultNumber()=" + getAdultNumber() + ", getId()=" + getId()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

}
