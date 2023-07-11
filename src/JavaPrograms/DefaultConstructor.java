package JavaPrograms;
class D
{
int a;
String b;
char c;
boolean d;


void show()
{
System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
}
}


public class DefaultConstructor {

	public static void main(String[] args) {
		 D rr = new D();
		 
		 rr.show();// this shows default values
		 
		 rr.a = 2;
		 rr.b = "ALL IS WELL";
		 rr.c = 'A';
		 rr.d = true;
		 rr.show(); // this shows after putting values

	}

	}


