package uppgift1;

public class Hund {
String namn;
String ras;

public Hund(String n, String r) { 
	this.namn=n;
	this.ras=r;
}
public String getNamn() {
	return namn;
}
public String getRas() {
	return ras;
}
 void printInfo() {
System.out.println("Namn: " +getNamn());
System.out.println("Ras: " +getRas());

}
}