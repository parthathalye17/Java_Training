import java.util.Scanner;
class Calculator{
	Scanner sc =new Scanner(System.in);
	public void areaOfCircle(){
		System.out.println("Enter radius: ");
		Double r= sc.nextDouble();
		Double ar=3.14*r*r;
		System.out.println("Area is :"+ar);
	}
	public void circumOfCircle(){
		System.out.println("Enter radius: ");
		Double cir= sc.nextDouble();
		Double circumference=3.14*cir*2;
		System.out.println("Area is :"+circumference);
	}
	public void areaOfRectangle(){
		System.out.println("Enter length :");
		System.out.println("Enter breadth :");
		Double l=sc.nextDouble();
		Double b=sc.nextDouble();
		Double rect = l*b;
		System.out.println("Area is :"+rect);
	}
	public void volOfSphere(){
		System.out.println("Enter radius: ");
		Double rad =sc.nextDouble();
		Double volume= (4/3)*rad*rad*rad*3.14;
		System.out.println("Volume is :"+volume);
	}
	public void surface(){
		System.out.println("Enter radius");
		Double ri =sc.nextDouble();
		Double surfacearea = 4*3.14*ri*ri;
		System.out.println("Surface Area is :"+surfacearea);

	}
	public void sqr(){
		System.out.println("Enter side: " );
		Double side = sc.nextDouble();
		Double area = side*side;
		System.out.println("Area is:"+area);
	}
	public void right(){
		Double right =sc.nextDouble();
		Double tria = sc.nextDouble();
		Double angle = (1/2)*right*tria;
		System.out.println("Area is :"+angle);

	}
	public void equi(){
		System.out.println("Enter side: ");
		Double sid =sc.nextDouble();
		Double equilateral = (1.73/4)*sid*sid;
		System.out.println("Area is :"+equilateral);

	}
	public void peri(){
		System.out.println("Enter length: ");
		System.out.println("Enter breadth: ");
		Double leng =sc.nextDouble();
		Double bred =sc.nextDouble();
		Double perimeter = 2*(leng+bred);
		System.out.println("Perimeter is :"+perimeter);
	}
	public void tri(){
		System.out.println("Enter length:");
		System.out.println("Enter breadth: ");
		Double len =sc.nextDouble();
		Double bdth =sc.nextDouble();
		Double triangle= (1/2)*len*bdth;
		System.out.println("Area is :"+triangle);
	}
}
class MyJava{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Calculator cal = new Calculator();
		while(true){
			System.out.println("1.Area of Circle:");
			System.out.println("2.Cirumference of Circle :");
			System.out.println("3.Area of Rectangle :");
			System.out.println("4.Volume of Sphere :");
			System.out.println("5.Surface Area of sphere :");
			System.out.println("6.area of square:");
			System.out.println("7.area of right angled triangle:");
			System.out.println("8.Area of equilateral triangle :");
			System.out.println("9.Perimeter of rectangle:");
			System.out.println("10.Area of triangle :");
			System.out.println("11.Exit");
			Double ch =sc.nextDouble();
			if (ch==1){
				cal.areaOfCircle();
			}
			else if (ch==2)
				cal.circumOfCircle();
			else if (ch==3){
				cal.areaOfRectangle();
			}
			else if (ch==4){
				cal.volOfSphere();
			}
			else if (ch==5){
				cal.surface();
			}
			else if (ch==6){
				cal.sqr();
			}
			else if (ch==7){
				cal.right();
			}
			else if (ch==8){
				cal.equi();
			}
			else if (ch==9){
				cal.peri();
			}
			else if (ch==10){
				cal.tri();
			}
			else if (ch==11){
				System.exit(0);
			}
		}
	}
}
