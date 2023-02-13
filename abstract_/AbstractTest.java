package abstract_;

public abstract class AbstractTest extends Object {	//POJO (Plain Old Java Object)
	protected String name;	//생성자 , setter를 통해 데이터를 넣는다
							// 나올때는 getter
	public AbstractTest() {
		
	}
	
	public AbstractTest(String name) {
		super();
		this.name = name;
	}

	public String getName() { //구현
		return name;
	}

	public abstract void setName(String name);  //추상메소드
	

}


