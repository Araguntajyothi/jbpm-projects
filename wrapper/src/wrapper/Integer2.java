package wrapper;
class Integer2 {
	
	public static void main(String[] args) {
		
	    Integer obj = new Integer(10);
	    byte   b  = obj.byteValue();
	    short  s  = obj.shortValue();
	    int    i1 = obj.intValue();
	    int    i2 = obj;
	    long   l  = obj.longValue();
	    float  f  = obj.floatValue();
	    double d  = obj.doubleValue();
	    	
	    System.out.println("byte value b = "+b);
	    System.out.println("short value s "+s);
	    System.out.println("int value i1 = "+i1+" i2 = "+i2);
	    System.out.println("long value l = "+l);
	    System.out.println("float value f = "+f);
	    System.out.println("double value d = "+d);
	    
	}
}


