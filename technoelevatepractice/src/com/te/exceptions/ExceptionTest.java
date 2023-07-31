package com.te.exceptions;
import com.te.exceptions.*;
public class ExceptionTest{
	public static void main(String[] args) throws AgeException {
		valid(16);
		
	}public static void valid(int n)
	{
		
		if(n<18)
		{
			try
			{
				throw new AgeException();
			}
			catch(AgeException e)
			{
				System.out.println(e);
			}
		}
	}

}
