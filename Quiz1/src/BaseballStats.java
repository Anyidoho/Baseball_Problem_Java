

public class BaseballStats {
private int Hits;
private int AB;
private int BB;
private int HBP;
private int SF;
private int doubles;
private int triples;
private int HR;
public static void main(String[] args) {
}
public BaseballStats(int hits, int aB, int bB, int hBP, int sF,int doubles,int triples,int hR) {
super();
Hits=hits;
AB=aB;
BB=bB;
HBP=hBP;
SF=sF;
this.doubles=doubles;
this.triples=triples;
HR=hR;
}
public int getHits() {
	return Hits;
}
public void setHits(int hits) {
	Hits=hits;
}
public int getAB() {
	return AB;
}
public void setAB(int aB) {
	AB=aB;
}	
public int getBB() {
return BB;
}
public void setBB(int bB) {
	BB=bB;	
}
public int getHBP() {
	return HBP;
}
	
public int getSF() {
	return SF;
}
public void setSF(int sF) {
	SF = sF;
}
public int getDoubles() {
	return doubles;
}
public void setDoubles(int doubles) {
	this.doubles = doubles;
}
public int getTriples() {
	return triples;
}
public void setTriples(int triples) {
	this.triples = triples;
}
public int getHR() {
	return HR;
}
public void setHR(int hR) {
	HR = hR;
}
public void setHBP(int hBP) {
	HBP = hBP;
}
public double SLG() {
	int singles=this.Hits-this.doubles-this.triples-this.HR;
	double slg= (singles+(2*this.doubles)+(3*this.triples)+(4*this.HR))/this.AB;
	return slg;}
public double OBP() {
	int num=(Hits+BB+HBP);
	int denum=(AB+BB+HBP+SF);
	return num/denum;}
public double OBS() {
	return SLG()+OBP();
}
public int TB(){
	return (Hits+(2*doubles)+(3*triples)+(4*HR));}
public double BA() {
	return TB()/AB;
	}

}
