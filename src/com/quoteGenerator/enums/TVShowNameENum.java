package com.quoteGenerator.enums;

public enum TVShowNameENum {

	BREAKING_BAD(1 , "https://api.breakingbadquotes.xyz/v1/quotes"), GAME_OF_THRONES(2 , "https://api.gameofthronesquotes.xyz/v1/random");

	Integer value;
	String endPoint;

	private TVShowNameENum(int value , String endPoint) {
		this.value = value;
		this.endPoint = endPoint;

	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	// Helper method to map an integer value to the corresponding enum constant
	public static TVShowNameENum fromValue(int value) {
		for (TVShowNameENum tvShow : TVShowNameENum.values()) {
			if (tvShow.value.equals(value)) {
				return tvShow;
			}
		}
		return null;
	}

}
