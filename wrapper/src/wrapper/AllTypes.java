package wrapper;

public class AllTypes {

		static Number square(Number value)		
		{
			if(value instanceof Byte) 
				return value.byteValue()*value.byteValue();
			else if(value instanceof Short) 
				return value.shortValue()*value.shortValue();
			else if(value instanceof Integer) 
				return value.intValue()*value.intValue();
			else if(value instanceof Long)
				return value.longValue()*value.longValue();
			else if(value instanceof Float)
				return value.floatValue()*value.floatValue();
			else 
				return value.doubleValue()*value.doubleValue();		
		}
		
		public static void main(String[] args) {
			
			System.out.println("Square value of 5 is   "+square(5));
			System.out.println("Square value of 5.5 is "+square(5.5f));
			System.out.println("Square value of 6.7 is "+square(6.7));
		}

	}

