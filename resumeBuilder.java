package javaMainProject;

import java.util.Scanner;

public class resumeBuilder {
	String name,mobile,email,j,y,r,edu,p,dp,sk,k;
	void contact()
	{
		System.out.println("User can add the Contact Details\n");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Full Name\n");
		name=s.next();
		System.out.println("Enter Mobile number\n");
		mobile=s.next();
		System.out.println("Enter Email ID");
		email=s.next();
		System.out.println("EmailId"+email);
	}
	void Work()
	{
		System.out.println("Add the Work Experience\n");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Job Title\n");
		j=s.next();
		System.out.println("Enter year\n");
		y=s.next();
		System.out.println("Enter Roles and responsibilities\n");
		r=s.next();
		
	}
	void Education()
	{
		System.out.println("Education Details\n");
		Scanner s=new Scanner(System.in);
		edu=s.next();
		
		
	}
	void Project()
	{
		System.out.println("project Details\n");
		Scanner s=new Scanner(System.in);
		System.out.println("Add project title\n");
		p=s.next();
		System.out.println("Add details of Project\n");
		dp=s.next();
	}
	void skills() {

		System.out.println("Skills\n");
		Scanner s=new Scanner(System.in);
		System.out.println("Add skills\n");
		sk=s.next();
	}
	void Conclusion()
	{
		System.out.println("Background details");
		Scanner s=new Scanner(System.in);
		System.out.println("add background details briefly\n");
		k=s.next();
	}
	void all()
	{
		System.out.println("***Resume***");
		System.out.println("Contact Details\n");
		System.out.println("Full Name:"+name);
		System.out.println("Mobile Number:"+mobile);
		System.out.println("Email:"+email);
		System.out.println("----------------\n"); 
		System.out.println("Work Experience\n");
	    System.out.println("Job Title:"+j);
	    System.out.println("Year:"+y);
        System.out.println("Roles and Responsibilities:"+r);
	    System.out.println("----------------\n");
	    System.out.println("Education:\n");
	    System.out.println("Degree:"+edu);
	    System.out.println("----------------\n");
	    System.out.println("Project:\n");
	    System.out.println("Project Title:"+p+"\nProject Details"+dp);
	    System.out.println("----------------\n");
	    System.out.println("Skills:"+sk);
	    
	    System.out.println("Conclusion:"+k);
	}
	public static void main(String[] args) {


resumeBuilder obj=new resumeBuilder();
obj.contact();
obj.Work();
obj.Education();
obj.Project();
obj.skills();
obj.Conclusion();
obj.all();
	}

}
