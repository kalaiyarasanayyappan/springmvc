package com.chainsys.classandmethods;

public class Phone {
	private final long phoneNo;
	private int frontCameraPixel;
	private int rearCameraPixel;
	private float cost;
	private String model;
	private String manufacturer;
	private int memory;
	private java.util.Date dateofPurchase;
	private String planDetails;
	
	public Phone(long no)
	{
		this.phoneNo=999999999L;
	}
	public Phone(long no,float pcost,String pmodel)
	{
		this.phoneNo=no;
		this.setCost(pcost);
		this.setModel(pmodel);
	}
	public void sendMSG (long toNo,String outmsg)
	{
		System.out.println("Phone.sendMSG");
	}
	public void receiveMSG(String incomingmsg)
	{
		System.out.println("Phone.receiveMSG "+incomingmsg);
	}
	public void makeCall(long no)
	{
		System.out.println("Phone.makeCall to " +no);
	}
	public void receiveCall(long fromNo)
	{
		System.out.println("Phone.receive");
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public int getFrontCameraPixel() {
		return frontCameraPixel;
	}
	public void setFrontCameraPixel(int frontCameraPixel) {
		this.frontCameraPixel = frontCameraPixel;
	}
	public int getRearCameraPixel() {
		return rearCameraPixel;
	}
	public void setRearCameraPixel(int rearCameraPixel) {
		this.rearCameraPixel = rearCameraPixel;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		// Validation
		this.cost = cost;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		//Validation
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public java.util.Date getDateofPurchase() {
		return dateofPurchase;
	}
	public void setDateofPurchase(java.util.Date dateofPurchase) {
		this.dateofPurchase = dateofPurchase;
	}
	public String getPlanDetails() {
		return planDetails;
	}
	public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
	}

}
