/**
 * 
 */
package circle;

/**
 * @author Jon-Joel Ocfemia
 *
 */

// TODO Complete the code


public class Circle extends GraphicObject {

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;
	
	 public double getCenterX() {
	        return centerX;
	    }
	    public double getCenterY() {
	        return centerY;
	    }
	    public double radius() {
	        return radius;
	    }
	    public int windowNumber() {
	        return windowNumber;
	    }
	    public void setCenterX(double centerX) {
	        this.centerX = centerX;
	    }
	    public void setCenterY(double centerY) {
	        this.centerY = centerY;
	    }
	    public void setRadius(double radius) {
	        this.radius = radius;
	    }
	    public void setWindowNumber(int windowNumber) {
	        this.windowNumber = windowNumber;
	    }
	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
	}

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		return super.toString();
	}
	
	public String toString(Circle Obj) {
		return("Circle: centerX = " + Obj.centerX + " centerY = " + Obj.centerY + " radius = " + Obj.radius);
		
	}

	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public boolean equals(Object obj, Object obj1) {
		return obj.equals(obj1);
	}


	// TODO To complete
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	protected Object clone(Circle c) throws CloneNotSupportedException{
		Circle copy = new Circle();
		c.centerX = copy.centerX;
		c.centerY = copy.centerY;
		c.radius = copy.radius;
		return copy;	
	}

}
