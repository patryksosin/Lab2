package lab2;

public class Kula {
	private double masa;
	public double getMasa() {
		return masa;
		}
	public void setMasa(double masa) {
		this.masa = masa;
		}
	public Kula(){
		masa = 50;
		}
	public Kula(double wartosc){
		setMasa(wartosc);
		}
	public double obliczGlownyMomentBezwladnosci(){
		return 0;
		}
	public double obliczMomentBezwladnosciSteiner(double promien){
		double rezultat;
		rezultat = getMasa()*promien*promien*2/5;
		return rezultat;
		}
	public String toString(){
		String tmp;
		tmp = "Kula o masie: "+ this.getMasa()+". Moment Bezwladnosci kuli wynosi:"
				+this.obliczGlownyMomentBezwladnosci()+". Moment bezwladnosci kuli wzgledem nowej osi: "
				+this.obliczMomentBezwladnosciSteiner(10);
		return tmp;
	}
}