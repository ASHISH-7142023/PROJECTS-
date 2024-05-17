package Reg2341019494;

import java.util.Scanner;

public class Member extends Date {
	Member(int day , String month , int year)
	{
		super(day , month , year);
		//TODO Auto-generated constructor stub
		
	}
	private int MemberID;
	private String LastName;
	private String FirstName;
	private int Handicap;
	private char Gender;
	private String Team;
	private String MemberType;
	private int Coach;
	private long Phone;
	private Date JoinDate;
	
	void seniorhandicap()
	{
		if(this.MemberType.equalsIgnoreCase("senior")&& this.Handicap<12)
		{
			this.display();
		}
		
	}
	
	void TeamBfemales()
	{
		if((this.Gender=='F'||this.Gender=='f')&&
				this.Team.equalsIgnoreCase("TeamB")&&
				this.MemberType.equalsIgnoreCase("senior"))
		{
			this.display();
		}	
	}
	void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter MemberID : ");
		this.MemberID = sc.nextInt();
		
		System.out.println(" Enter Last Name : ");
		this.LastName = sc.next();
		
		System.out.println(" Enter First Name : ");
		this.FirstName = sc.next();
		
		System.out.println(" Enter Handicap : ");
		this.Handicap = sc.nextInt();
		
		System.out.println(" Enter ur Gender : ");
		this.Gender = sc.next().charAt(0);
		
		System.out.println(" Enter Team : ");
		this.Team = sc.next();
		
		System.out.println(" Enter MemberType : ");
		this.MemberType = sc.next().toLowerCase();
		
		System.out.println(" Enter Coach : ");
		this.Coach = sc.nextInt();
		
		System.out.println(" Enter Phone : ");
		this.Phone = sc.nextLong();
		
	}
	
	void Display()
	{
		System.out.print("MemberID : " + this.MemberID + "\n" + " LastName : " + 
	                this.LastName+"\n"+"FirstName: "+this.FirstName+"\n"+"HandiCap: "+this.Handicap+"\n"+"Gender: "+
				    this.Gender+"\n"+"Team: "+this.Team+"\n"+"MemberType: "+this.MemberType+"\n"+"Coach: "+
	                this.Coach+"\n"+"Phone: "+this.Phone+"\n"+"Joindate: ");
		this.displayDate();
	}
	
	public static void main (String []args) {
		Scanner aa = new Scanner(System.in);
		System.out.println("Enter No. of Members of the club : ");
		Member m[] = new Member[aa.nextInt()];
		String mon[] = {"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		for(int i=0;i<m.length;i++)
		{
			System.out.println("\n Enter Join Date : ");
			m[i]=new Member(aa.nextInt(), aa.next(),aa.nextInt());
	        m[i].setDetails(); 
	        System.out.println();
	      //method for printing info of people who joined earlier than 7 April 9
	        int k=0;
	        for(int j=0;j<mon.length;j++)
	        {
	        	if(m[i].getmonth1().equals(mon[j]))
	        	{
	        		k=j;
	        		if(((m[i].getday1()<=7) && k==3 && (m[i].getyear1()==9)) || (m[i].getday1()<=31)&& k<=11 && m[i].getyear1()<=8 )
	        		{
	        			m[i].display();
	        		}
	        	}
	        }
	        /////////////////////////
	        m[i].seniorhandicap();
	        System.out.println();
	        m[i].TeamBfemales();
	           
	     }    
	 }

	private void display() {
		// TODO Auto-generated method stub
		
	}

	 }
class Date

	 {
		 private int day;
		 private String month; 
		 private int year;
		 
		 Date(int day,String month, int year)
		 {
			 this.day=day;
			 this.month=month;
			 this.year=year;
		 }
		 
		 void displayDate()
		 {
			 System.out.print(this.day+" "+this.month+" "+this.year+"\n");
		 }
		 int getday1()
		 {
			 return this.day;
		 }
		 int getyear1()
		 {
			 return this.year;
		 }
		 String getmonth1()
		 {
			 return this.month;
		 }
	 }
