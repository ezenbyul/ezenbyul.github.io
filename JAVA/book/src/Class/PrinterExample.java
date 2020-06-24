package Class;

public class PrinterExample {
	public static void main(String[] args) {
		Printer printer = new Printer();
		int 	a = printer.printerln(10);
		boolean b =	printer.printerln(false);
		String 	c =	printer.printerln("String");
		double 	d = printer.printerln(5.6);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		printer.printerln2(10);
		printer.printerln2(false);
		printer.printerln2("String");
		printer.printerln2(5.6);	
	}
}
