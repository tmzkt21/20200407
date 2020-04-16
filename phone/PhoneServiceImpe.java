package com.jse.phone;




public class PhoneServiceImpe implements PhoneService{
	
	private Phone[] phones;

	private CelPhone[] celPhones;

	private Iphone[] iPhones;

	private GalaxyNote[] galaxyNote;
	
	private int count;
	
	public PhoneServiceImpe() {

		galaxyNote = new GalaxyNote[3];

		iPhones = new Iphone[3];

		phones = new Phone[3];

		celPhones = new CelPhone[3];

	

	}

	
	@Override
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
		
	}




	@Override
	public int count() {
		
		return 0;
	}

	@Override
	public void update(Phone phone) {
	
		
	}

	@Override
	public void delete(Phone phone) {
	
		
	}


	@Override
	public void add(GalaxyNote phone) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void add(Iphone phone) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void add(CelPhone phone) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public GalaxyNote[] galaxylist() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iphone[] iphonelist() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Phone[] phonelist() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public CelPhone[] celphonelist() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public GalaxyNote detail(GalaxyNote phone) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iphone detail(Iphone phone) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
