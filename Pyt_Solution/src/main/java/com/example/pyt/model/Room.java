package com.example.pyt.model;

public class Room {
 
	private String roomName;
	private int roomCode;
	private String roomDescription;
	private String rateCode ;
	private String mealPlan;
	private int price ;
	private boolean soldOut;
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public int getRoomCode() {
		return roomCode;
	}
	public void setRoomCode(int roomCode) {
		this.roomCode = roomCode;
	}
	public String getRoomDescription() {
		return roomDescription;
	}
	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}
	public String getRateCode() {
		return rateCode;
	}
	public void setRateCode(String rateCode) {
		this.rateCode = rateCode;
	}
	public String getMealPlan() {
		return mealPlan;
	}
	public void setMealPlan(String mealPlan) {
		this.mealPlan = mealPlan;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isSoldOut() {
		return soldOut;
	}
	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}
	
	
	
	
	
	
	
	
	
}
