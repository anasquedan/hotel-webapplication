package com.futaim.beam.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.validation.constraints.NotNull;

/**
 * @author Anas Quedan
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BestHotel extends Hotel {

    /**
     *
     */
    private static final long serialVersionUID = -736689397121039988L;

    @NotNull
    private String hotel;

    @NotNull
    private Integer hotelRate;

    @NotNull
    private Integer hotelFare;

    @NotNull
    private String roomAmenities;

    /**
     * @return the hotel
     */
    public String getHotel() {
        return hotel;
    }

    /**
     * @param hotel the hotel to set
     */
    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    /**
     * @return the hotelRate
     */
    public Integer getHotelRate() {
        return hotelRate;
    }

    /**
     * @param hotelRate the hotelRate to set
     */
    public void setHotelRate(Integer hotelRate) {
        this.hotelRate = hotelRate;
    }

    /**
     * @return the hotelFare
     */
    public Integer getHotelFare() {
        return hotelFare;
    }

    /**
     * @param hotelFare the hotelFare to set
     */
    public void setHotelFare(Integer hotelFare) {
        this.hotelFare = hotelFare;
    }

    /**
     * @return the roomAmenities
     */
    public String getRoomAmenities() {
        return roomAmenities;
    }

    /**
     * @param roomAmenities the roomAmenities to set
     */
    public void setRoomAmenities(String roomAmenities) {
        this.roomAmenities = roomAmenities;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
        result = prime * result + ((hotelFare == null) ? 0 : hotelFare.hashCode());
        result = prime * result + ((hotelRate == null) ? 0 : hotelRate.hashCode());
        result = prime * result + ((roomAmenities == null) ? 0 : roomAmenities.hashCode());
        return result;
    }

    /* (non-Javadoc)
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
        BestHotel other = (BestHotel) obj;
        if (hotel == null) {
            if (other.hotel != null)
                return false;
        } else if (!hotel.equals(other.hotel))
            return false;
        if (hotelFare == null) {
            if (other.hotelFare != null)
                return false;
        } else if (!hotelFare.equals(other.hotelFare))
            return false;
        if (hotelRate == null) {
            if (other.hotelRate != null)
                return false;
        } else if (!hotelRate.equals(other.hotelRate))
            return false;
        if (roomAmenities == null) {
            if (other.roomAmenities != null)
                return false;
        } else if (!roomAmenities.equals(other.roomAmenities))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "BestHotel [hotel=" + hotel + ", hotelRate=" + hotelRate + ", hotelFare=" + hotelFare
                + ", roomAmenities=" + roomAmenities + ", getCity()=" + getCity() + ", getFromDate()=" + getFromDate()
                + ", getToDate()=" + getToDate() + ", getAdultNumber()=" + getAdultNumber() + ", getId()=" + getId()
                + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
    }


}
