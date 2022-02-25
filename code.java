class Solution {
    public int reverse(int x)
    {
        long n;
        int i=0;
        long j=x;
        String s="";
        if(x<0)
        {
            j=j*-1;
        }
      
        while(j!=0)
        {
            n=j%10;
            j=j/10;
            
            s=s+Long.toString(n);
        }
      if(!s.equals(""))
      {
          if(Math.pow(2,31)>Long.parseLong(s))
            i=Integer.parseInt(s); 
          else
              i=0;
      }
     
        if(x<0)
        {
            i=i*-1;
        }
      return i;
    }
}
