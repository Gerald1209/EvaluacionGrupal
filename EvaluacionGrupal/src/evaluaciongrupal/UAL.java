package evaluaciongrupal;

import javax.swing.JOptionPane;

public class UAL {

	public Memoria mem;
       

	public UAL(){

	}

	public void finalize() throws Throwable {

	}

	public void igual(){
		if(this.mem.getM1() == this.mem.getM2())
                    JOptionPane.showMessageDialog(null,"Son iguales");
                else
                    JOptionPane.showMessageDialog(null,"No son iguales");
	}

	public float menor(){
		if(this.mem.getM1() < this.mem.getM2())
                    return mem.getM1();
                else
                    return mem.getM2();
                          
	}

	public float multiplicar(){
		return mem.getM1()* mem.getM2();
	}

	public float sumar(){
            
            return this.mem.getM1()+ this.mem.getM2();
	}

}