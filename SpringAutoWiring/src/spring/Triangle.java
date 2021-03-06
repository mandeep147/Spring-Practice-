package spring;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;
/**
 * Auto-wiring 
 * for escaping the mention of property tags multiple times
 * 3 methods
 * 1. if bean name and name of member variables is same we can use autowire= byName tag
 * 2. autowire=byType if name is different.. it will look for class for wiring.. good if there is only one member variable
 * 3. autowire = constructor... constructor overloading 
 */
	public Point getPointA() {
		return pointA;
	}
	
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public Point getPointC() {
		return pointC;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw(){
		System.out.println(getPointA().getX()+ " : "+getPointA().getY());
		System.out.println(getPointB().getX()+ " : "+getPointB().getY());
		System.out.println(getPointC().getX()+ " : "+getPointC().getY());
	}
}