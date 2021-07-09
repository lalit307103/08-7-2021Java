//EMPLOYEE FIRST CLASS 1
public class Employee {
//properties
	int empId;
	String empName ;
	float bsal;
	
	
//default constructor 
          Employee()
           {
	       }
	
		// overloaded constructor
          
        Employee(int empId, String name)
         {
        	 this.empId = empId;
        	 this.empName = name;
        	 
         }
        Employee(int id,String name,float sal)
        {
        	empId= id;
        	empName= name;
        	bsal= sal;
        }
        
        //method 
        void dispEmpData()
        {
        	empId=10;
        	empName="Hiber";
        	System.out.println("employee data"+empId+""+empName);
        	
        }
          
        
        
       /*float getTax() 
        {
        	if(gs>250000 && gs<500000 )
        	{
        		calcuate = 5/100*gs
        		System.out.println("the tax is="+calculate);
        	}
        	else 
        	{
        		if(gs>500000 && gs<750000)
        			calcuate = 20/100*gs
            		System.out.println("the tax is="+calculate);
        			
        	}
        	else if (gs>750000)
        	{
        		        calcuate = 30/100*gs
                		System.out.println("the tax is="+calculate);
        	}
        	
        }
        */
        int getEmpSal() {
        	float hra = 0.12f * bsal;//calculate HRA
        	float da = 0.73f * bsal;//Calculate DA
        	float gs = bsal + da+ hra;//calculate GROSS SALARY
        	float totSal = bsal + hra;// Caculate tatal salary
        	
        	double tax=0,it;
        	it= gs*12;
        	System.out.println("Annual Income is : "+it);
        	if(it<=200000)
        		tax=0;
        	else if(it<=300000)
        		tax=0.1*gs;
        	else if(it<=500000)
        		tax=0.2*gs;
        	else if(it<=1000000)
        		tax=0.3*gs;
        	else
        		tax=0.4*gs;
        	System.out.println("Income tax amount is "+tax);
        	System.out.println("BASIC SALARY is="+Math.round(bsal));
        	System.out.println("total HRA is="+Math.round(hra));//
        	System.out.println("total GROSS_SALARY is HRA+DA+BS="+Math.round(gs));//
        	System.out.println("total DA is="+Math.round(da));//
        	System.out.println("total SALARY IN HAND BASIC+ HRA="+Math.round(totSal));
        	
        	
        	//return totSal; // 
        	
        	int tot = Math.round(totSal);
        	return tot;
        }
        
        
	}

