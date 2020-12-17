 class Box{
          private
		      int length,breadth,height;
			  public  void SetDimension(int l,int b,int h){
				  length=l;
				  breadth=b;
				  height=h;
			  }
			  public void ShowDimension(){
				  System.out.println("LENGTH  = "+length);
				  System.out.println("BREADTH = "+breadth);
				  System.out.println("HEIGHT  = "+height);
			  }
}
 public class Example{
	      public static void main(String[] args){
			  Box smallbox=new Box();                 //make obj.
			  smallbox.SetDimension(12,10,5);
			  smallbox.ShowDimension();
			  smallbox=new Box();          //once again make new obj.of same name
			  smallbox.ShowDimension();
		  }
}