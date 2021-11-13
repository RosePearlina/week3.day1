package org.system;

public class Desktop extends Computer{
	public void DesktopSize() {
		System.out.println("The DEsktop size");
	}

	public static void main(String[] args) {
		Desktop des=new Desktop();
		des.computerModel();
		des.DesktopSize();

	}

}
