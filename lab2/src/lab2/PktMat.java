package lab2;

public class PktMat {
	private double masa;
	public double getMasa() {
		return masa;
		}
	public void setMasa(double masa) {
		this.masa = masa;
		}
	public PktMat(){
		masa = 50;
		}
	public PktMat(double wartosc){
		setMasa(wartosc);
		}
	public double obliczGlownyMomentBezwladnosci(){
		return 0;
		}
	public double obliczMomentBezwladnosciSteiner(double promien){
		double rezultat;
		rezultat = getMasa()*promien*promien;
		return rezultat;
		}
	public String toString(){
		String tmp;
		tmp = "Punkt Materialny o masie: "+ this.getMasa()+". Moment Bezwladnosci punktu wynosi: "
				+this.obliczGlownyMomentBezwladnosci()+". Moment bezwladnosci punktu wzgledem nowej osi: "
				+this.obliczMomentBezwladnosciSteiner(10);
		return tmp; } }