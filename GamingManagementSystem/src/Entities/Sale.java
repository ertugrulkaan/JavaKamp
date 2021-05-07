package Entities;

import Abstract.Entity;

public class Sale implements Entity{
	private int id;
	private int gameId;
	private int userId;
	private double unitPrice;
	private double discount;
	
	public Sale() {
		
	}
	
	public Sale(int id, int gameId, int userId, double unitPrice) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.userId = userId;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setPrice(double price) {
		this.unitPrice = price;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public double getDiscountedPrice() {
		return (this.unitPrice - (this.unitPrice*this.discount/100));
	}
	
}
