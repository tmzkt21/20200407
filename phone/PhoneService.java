package com.jse.phone;



public interface PhoneService {

	public void add(GalaxyNote phone);//오버로딩
	public void add(Iphone phone);//오버로딩
	public void add(Phone phone);
	public void add(CelPhone phone);

	public GalaxyNote[] galaxylist();
	public Iphone[] iphonelist();
	public Phone[] phonelist();
	public CelPhone[] celphonelist();
    //유니크해야함 리턴타입은 상관없음  파라미터값 
	public GalaxyNote detail(GalaxyNote phone);
	public Iphone detail(Iphone phone);
	public int count();
	
	public void update(Phone phone);
	public void delete(Phone phone);


	



}