
public class DataTypeSizes {
	    public static void main(String[] args) {

	        System.out.println("----- Primitive Data Types and Their Sizes -----");

	        System.out.println("byte:");
	        System.out.println("Size: " + Byte.BYTES + " bytes");
	        System.out.println("Min Value: " + Byte.MIN_VALUE);
	        System.out.println("Max Value: " + Byte.MAX_VALUE);
	        System.out.println();

	        System.out.println("short:");
	        System.out.println("Size: " + Short.BYTES + " bytes");
	        System.out.println("Min Value: " + Short.MIN_VALUE);
	        System.out.println("Max Value: " + Short.MAX_VALUE);
	        System.out.println();

	        System.out.println("int:");
	        System.out.println("Size: " + Integer.BYTES + " bytes");
	        System.out.println("Min Value: " + Integer.MIN_VALUE);
	        System.out.println("Max Value: " + Integer.MAX_VALUE);
	        System.out.println();

	        System.out.println("long:");
	        System.out.println("Size: " + Long.BYTES + " bytes");
	        System.out.println("Min Value: " + Long.MIN_VALUE);
	        System.out.println("Max Value: " + Long.MAX_VALUE);
	        System.out.println();

	        System.out.println("float:");
	        System.out.println("Size: " + Float.BYTES + " bytes");
	        System.out.println("Min Value: " + Float.MIN_VALUE);
	        System.out.println("Max Value: " + Float.MAX_VALUE);
	        System.out.println();

	        System.out.println("double:");
	        System.out.println("Size: " + Double.BYTES + " bytes");
	        System.out.println("Min Value: " + Double.MIN_VALUE);
	        System.out.println("Max Value: " + Double.MAX_VALUE);
	        System.out.println();

	        System.out.println("char:");
	        System.out.println("Size: " + Character.BYTES + " bytes");
	        System.out.println("Min Value: " + (int) Character.MIN_VALUE);
	        System.out.println("Max Value: " + (int) Character.MAX_VALUE);
	        System.out.println();

	        System.out.println("boolean:");
	        System.out.println("Size: JVM-dependent (usually 1 bit)");
	        System.out.println("Values: true or false");
	    }

}
