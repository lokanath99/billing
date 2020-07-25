package myprog;

public class CustomerDtl {
String name;
double ph;int GSTno;
public CustomerDtl(String a,double b,int c) {
	name =a;
	ph=b;
	GSTno=c;
}
public CustomerDtl()
{
	name=null;
	ph=(double) 000;
	GSTno=0000;
}
void cusprint() {
	System.out.println("name:"+name );
	System.out.println("phno:"+ph);
}

}
