package Weekday.Assignments;

public class MajarityElement {

	public static void main(String[] args) {
		//6/20
		
        int elements[]= {2,2,1,1,1,2,2};
		
        int len=elements.length;
        int greater =len/2; 
        int majority = 0;
        int count = 0;
	
        for (int i = 0; i < elements.length; i++) 
        {
		
        	for (int j = 0; j < elements.length; j++) 
        	{
			
        		if (elements[i]== elements[j])
        		{
        			count++;
        		}
			
        	}
		
        	if (count >greater)
        	{
        		majority=elements[i];
        	}
				count=0;
		}
        	System.out.println("Majority element  " + majority);       
	}

}
