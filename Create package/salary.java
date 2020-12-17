package sakshi;
public class salary{
	   private float b_salary,da,hra,gross,pf,net;
    	// get salary from user
	   public void getBasicSalary(float s){
		   b_salary=s;
	   }
	   //show salary
	   public void showBasicSalary(){
		   System.out.println("\t Basic Salary :- "+b_salary);
	   }
	   //calculate DA
	   public void calDa(){
		   da=(b_salary<5000)?(0.1f*b_salary):(0.2f*b_salary);
		   System.out.println("\t DA    : - "+da);
	   }
	   //calculate HRA 
	   public void calHra(){
		   hra=(b_salary<5000)?(0.05f*b_salary):(0.07f*b_salary);
		   System.out.println("\t HRA   :- "+hra);
	   }//calculate Gross
	   public void calGross(){
		   gross=b_salary+da+hra;
		   System.out.println("\t Gross :- "+gross); 
	   }
	   //calculate pf
	   public void calPf(){
		   pf=(gross<1000)?(0.02f*b_salary):(b_salary*0.03f);
		   System.out.println("\t PF    :- "+pf);
	   }
	   //calculate net
	   public void calNet(){
		  net=gross-pf;
		  System.out.println("\t Net   :- "+net);
	   }
}