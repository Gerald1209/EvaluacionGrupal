package evaluaciongrupal;


/**
 * @author Armandol
 * @version 1.0
 * @created 02-Dec-2020 6:14:00 PM
 */
public class Memoria {

	private float m1;
	private float m2;

	public Memoria(){

	}

	public void finalize() throws Throwable {

	}

	public void clear(){
           this.m1 = 0;
           this.m2 = 0;
	}

	public void save(){
            this.m1 = m1;
            this.m2 = m2;
	}

    public float getM1() {
        return m1;
    }

    public void setM1(float m1) {
        this.m1 = m1;
    }

    public float getM2() {
        return m2;
    }

    public void setM2(float m2) {
        this.m2 = m2;
    }

    
        

}