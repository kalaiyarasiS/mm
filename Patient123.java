public class Patient123 
{
	  String Pnam="";
	 double Pwt=0;
	 double Pht=0;
	Patient(String Pnam,double Pwt,double Pht)
	{
		this.Pnam=Pnam;
		this.Pwt=Pwt;
		this.Pht=Pht;
	}
	
	
	public double bm()
	{
		return (Pwt/(Pht * Pht))*703;
	}
	
}
 class Patients
	{
		static String Pnam[]=new String[]{"a","b","c","d","e","h","t","r","y","k"};
        static double Pwt[]={10,20,30,40,50,90,80,70,65,54};
        static double Pht[]={12,23,34,45,65,44,33,77,66,88};
            public static void main(String[] args) {
		for(int i=0; i<Pnam.length;i++) {
			Patient p = new Patient(Pnam[i], Pwt[i], Pht[i]);
			
			
	      if(p.bm()>25.0){
		 System.out.println("pnam \t"+ Pnam[i]+"\n" + "Pht" + Pht[i] +"\n"+ " Pwt" + Pwt[i] +"\n" +"BMI"+p.bm());
	         }
		
	      else
	      {
	    	  System.out.println("it is less than 25.0");
	      }
	}
		
            }}
