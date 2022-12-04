package application;

public class Conversor {
	private  double temperatura ;

	public Conversor() {
	}
	
	public Conversor(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public double converterTemp(double temperatura) {
		double aux = (temperatura*1.8)+32;
		return aux;
		
		
	}
	
}
