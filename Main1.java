import java.util.Scanner;

class Box {
    Scanner input = new Scanner(System.in);
    private double height;
    private double width;
    private double depth;

    Box() {
        this.height = 0;
        this.width = 0;
        this.depth = 0;
    }

    Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void setData() {
        System.out.print("Enter height here: ");
        height = input.nextDouble();
        System.out.print("Enter width here: ");
        width = input.nextDouble();
        System.out.print("Enter depth here: ");
        depth = input.nextDouble();
    }

	void setData (double width , double height , double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;

	}

    void showData() {
        System.out.println("Height is: " + height);
        System.out.println("Width is: " + width);
        System.out.println("Depth is: " + depth);
    }


    void setHeight(double height) {
        this.height = height;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setDepth(double depth) {
        this.depth = depth;
    }

    double getHeight() {
        return height;
    }

    double getWidth() {
        return width;
    }

    double getDepth() {
        return depth;
    }

	double Volume () {
	   return width*height*depth; 
	}

	double Volume (double width , double height , double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;

		return width*height*depth;
	}
}

class Main1 {
    public static void main(String[] args) {

	System.out.println("\n\n\tData for Box 1 ");
        Box b1 = new Box(1.5,1.5,1.5);
	b1.showData();
	System.out.println("Volume is : " + b1.Volume());

	System.out.println("\n\n\tData for Box 2 ");
	Box b2 = new Box ();
	b2.setData(2,2,2);
	b2.showData();
	System.out.println("Volume is : " + b2.Volume());

	System.out.println("\n\n\tData for Box 3 ");
	Box b3 = new Box ();
	b3.setData();
	b3.showData();
	System.out.println("Volume is : " + b3.Volume());

	System.out.println("\n\n\tData for Box 4 ");
	Box b4 = new Box ();
	b4.setHeight(4);
	b4.setWidth(4);
	b4.setDepth(4);
	System.out.println("Heigth is : " + b4.getHeight());
	System.out.println("Width is  : " + b4.getWidth());
	System.out.println("Depth is  : " + b4.getDepth());
	System.out.println("Volume is : " + b4.Volume());
	
	
	System.out.println("\n\n\tData for Box 5 ");
	Box b5 = new Box ();
	b5.showData();
	System.out.println("Volume is : " + b5.Volume());
	
	System.out.println("\n\n\tData for Box 6 ");
	Box b6 = new Box ();
	System.out.println("Volume is : " + b6.Volume(6,6,6));
	
	        
    }
}
