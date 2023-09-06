package abstraction;

public abstract class animal {
	//defined method
	void data() {
		System.out.println("the animal data");
		
	}
	//undefined method
abstract void move();
	abstract void eat();
abstract	 void name();
	
	

}

class dog extends animal{

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void name() {
		// TODO Auto-generated method stub
		
	}

	
} 

class cat extends animal{

	@Override
	void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void name() {
		// TODO Auto-generated method stub
		
	}
	
}

