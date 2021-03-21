package com.javamastermind.payment.domain;

import com.javamastermind.payment.enums.Statuses;

/**
 * @author lahiru_w
 */
public class Booking
{
    private String userId;

    private String propertyID;

    private String bookingTranUUId;

    private String checkIn;

    private String checkOut;

    private String bookedPrice;

    private String paymentType;

    private Visitors visitors;

    private RoomData roomdata;

    private String status;

    public Booking()
    {

    }

    public Booking(String bookingTranUUId, String userId, String bookedPrice)
    {
        this.bookingTranUUId = bookingTranUUId;
        this.userId = userId;
        this.bookedPrice = bookedPrice;
        this.setStatus(Statuses.PENDING.name());
    }

    public class Visitors
    {
        private String noOfAdults;

        private String noOfChildren;

        public String getNoOfAdults()
        {
            return noOfAdults;
        }

        public void setNoOfAdults(String noOfAdults)
        {
            this.noOfAdults = noOfAdults;
        }

        public String getNoOfChildren()
        {
            return noOfChildren;
        }

        public void setNoOfChildren(String noOfChildren)
        {
            this.noOfChildren = noOfChildren;
        }

    }

    public class RoomData
    {
        private String noOfRooms;

        private String bedsPerRoom;

        public String getNoOfRooms()
        {
            return noOfRooms;
        }

        public void setNoOfRooms(String noOfRooms)
        {
            this.noOfRooms = noOfRooms;
        }

        public String getBedsPerRoom()
        {
            return bedsPerRoom;
        }

        public void setBedsPerRoom(String bedsPerRoom)
        {
            this.bedsPerRoom = bedsPerRoom;
        }

    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getPropertyID()
    {
        return propertyID;
    }

    public void setPropertyID(String propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getBookingTranId()
    {
        return bookingTranUUId;
    }

    public void setBookingTranId(String bookingTranId)
    {
        this.bookingTranUUId = bookingTranId;
    }

    public String getCheckIn()
    {
        return checkIn;
    }

    public void setCheckIn(String checkIn)
    {
        this.checkIn = checkIn;
    }

    public String getCheckOut()
    {
        return checkOut;
    }

    public void setCheckOut(String checkOut)
    {
        this.checkOut = checkOut;
    }

    public String getBookedPrice()
    {
        return bookedPrice;
    }

    public void setBookedPrice(String bookedPrice)
    {
        this.bookedPrice = bookedPrice;
    }

    public String getPaymentType()
    {
        return paymentType;
    }

    public void setPaymentType(String paymentType)
    {
        this.paymentType = paymentType;
    }

    public Visitors getVisitors()
    {
        return visitors;
    }

    public void setVisitors(Visitors visitors)
    {
        this.visitors = visitors;
    }

    public RoomData getRoomdata()
    {
        return roomdata;
    }

    public void setRoomdata(RoomData roomdata)
    {
        this.roomdata = roomdata;
    }

    public String getBookingTranUUId()
    {
        return bookingTranUUId;
    }

    public void setBookingTranUUId(String bookingTranUUId)
    {
        this.bookingTranUUId = bookingTranUUId;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "Booking [userId=" + userId + ", propertyID=" + propertyID + ", bookingTranUUId=" + bookingTranUUId
            + ", checkIn=" + checkIn + ", checkOut=" + checkOut + ", bookedPrice=" + bookedPrice + ", paymentType="
            + paymentType + ", visitors=" + visitors + ", roomdata=" + roomdata + ", status=" + status + "]";
    }

}
