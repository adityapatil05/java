package utility.date;

import java.io.Serializable;

public class Date implements Serializable{
int dd,mm,yy;
public Date() {
	
}
public Date(int dd, int mm, int yy) {
	super();
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}
public void display() {
	System.out.println(dd+"/"+mm+"/"+yy);
}
}
