/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
       System.out.println(Math.random()*5);
       System.out.println(Math.random()*20 + 15);
       System.out.println(Math.random()*10001 + 5234);
       
       int low = (int)(Math.random()*(80-30)+30);
       int high = (int)(Math.random()*(140-90)+90);
       int c = (int)(Math.random()*(high-low)+low);
       System.out.println(c);
       
       int x = (int)(Math.random()*(80-30)+30);
       int y = (int)(Math.random()*(140-90)+90);
       
       double w = (Math.random());
        
        
       boolean z;
		z = (w>0.5);
		if(z)
		{
		System.out.println(x);
		}
		
		boolean s;
		s = (w<0.5);
		if(s)
       {
           System.out.println(y);
       }
	}
}
