import java.lang.*;
import java.util.*;

import java.io.*;

public class Account
{
	private String usernam;
	private String pas;
	
	private File file;
	private FileWriter filewriter;
	private Scanner sc;
	
	public Account()
	{
		this.usernam="";
	}
	
	public Account(String usernam,String pas)
	{
		this.usernam=usernam;
		this.pas=pas;
	}
	
	public void setusernam(String usernam)
	{
		this.usernam=usernam;
	}
	
	public void setpas(String pas)
	{
		this.pas=pas;
	}
	
	public String getusernam()
	{
		return usernam;
	}
	
	public String getpas()
	{
		return pas;
	}
	
	public void addaccount()
	{
		try{
		file=new File("./Data.txt");
		file.createNewFile();
		filewriter=new FileWriter(file,true);
		filewriter.write(getusernam()+"\t");
		filewriter.write(getpas()+"\n");
		filewriter.flush();
		filewriter.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public boolean getAccount(String usernam,String pas)
	{
		boolean flag=false;
		file=new File("./Data.txt");
		
		try
		{
		  sc=new Scanner(file);
		  
		  while(sc.hasNextLine())
		  {
			  String line=sc.nextLine();
			  String[] value=line.split("\t");
			  if(value[0].equals(usernam)&&value[1].equals(pas))
			  {
				  flag=true;
			  }
		  }
		
		
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return flag;
		
	}
	
}