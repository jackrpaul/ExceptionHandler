import java.io.*;
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class runner
	{
		public static void main(String[] args)
			{
			//catcherIE();
			catcher1();
			catcher2();
			catcher3();
			}

		private static void catcherIE()
			{
			for(int i = 1; i <= 5; i++)
				{
				try
					{
						Thread.sleep(1000);
						System.out.println(i);
					} 
				catch (InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			System.out.println("");
			}
		
		private static void catcher1()
			{
			Super yes = new Super();
			try
				{
				System.out.println((Sub)yes);
				}
			catch(ClassCastException fred)
				{
				System.out.println("Whoops, you can't cast a double superclass instantiation as a subclass object!");
				}
			finally
				{
				System.out.println("Phew, glad that's over with.");
				}
				
			}
		
		private static void catcher2()
			{
			
				
			}
		
		private static void catcher3()
			{
			
				
			}

	}
