package com.syntel.hackathon.model;

import java.util.HashMap;
import java.util.Map;

import org.bson.types.ObjectId;

public class DeliveryDetails {

	private ObjectId id;
	private String pickupLocation;
	private String deliveryLocation;
	private String weightyAndDimensions;
	private String specialRequest;
	private String buid;

	private String bidStartQuotePrice;
	private HashMap<String, String> driversQuotedPrice;
	private String biddingStatus;
	private String selectedDriverEmail;

	private String negotiationTemrsAndCondition;
	private String pickupStartPoint;
	private String pickupEndPoint;
	private String deliveryStatus;

	private String paymentStatus;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDeliveryLocation() {
		return deliveryLocation;
	}

	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}

	public String getWeightyAndDimensions() {
		return weightyAndDimensions;
	}

	public void setWeightyAndDimensions(String weightyAndDimensions) {
		this.weightyAndDimensions = weightyAndDimensions;
	}

	public String getSpecialRequest() {
		return specialRequest;
	}

	public void setSpecialRequest(String specialRequest) {
		this.specialRequest = specialRequest;
	}

	public String getBuid() {
		return buid;
	}

	public void setBuid(String buid) {
		this.buid = buid;
	}

	public String getBidStartQuotePrice() {
		return bidStartQuotePrice;
	}

	public void setBidStartQuotePrice(String bidStartQuotePrice) {
		this.bidStartQuotePrice = bidStartQuotePrice;
	}

	public Map<String, String> getDriversQuotedPrice() {
		return driversQuotedPrice;
	}

	public void setDriversQuotedPrice(HashMap<String, String> driversQuotedPrice) {
		this.driversQuotedPrice = driversQuotedPrice;
	}

	public String getBiddingStatus() {
		return biddingStatus;
	}

	public void setBiddingStatus(String biddingStatus) {
		this.biddingStatus = biddingStatus;
	}

	public String getSelectedDriverEmail() {
		return selectedDriverEmail;
	}

	public void setSelectedDriverEmail(String selectedDriverEmail) {
		this.selectedDriverEmail = selectedDriverEmail;
	}

	public String getNegotiationTemrsAndCondition() {
		return negotiationTemrsAndCondition;
	}

	public void setNegotiationTemrsAndCondition(String negotiationTemrsAndCondition) {
		this.negotiationTemrsAndCondition = negotiationTemrsAndCondition;
	}

	public String getPickupStartPoint() {
		return pickupStartPoint;
	}

	public void setPickupStartPoint(String pickupStartPoint) {
		this.pickupStartPoint = pickupStartPoint;
	}

	public String getPickupEndPoint() {
		return pickupEndPoint;
	}

	public void setPickupEndPoint(String pickupEndPoint) {
		this.pickupEndPoint = pickupEndPoint;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
