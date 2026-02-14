package enumeration;

public enum Color {

	 RED, GREEN, BLUE;

    private Color(){
        
        System.out.println("Constructor called for: " + this);
    }

    public void display(){
        
        System.out.println("Color is: " + this);
    }
}
