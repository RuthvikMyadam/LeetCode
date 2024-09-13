class Solution {
    public boolean isPalindrome(int x) {
        
        int i=0,j=0;
        int[] a = new int[10];
        
        if(x<0)
            return false;
        
        do
        {
           a[i]=x%10;
            x=x/10;
            i++;
            j++;
        }while(x>0);
        
        j=j-1;
        int mid = (j/2)+1;
        
        for(i=0;i<j;i++)
        {
            if(a[i]==a[j])
            { 
                if(a[i]==mid)
                    return true;
                else
                {
                j=j-1;
                continue;
                }
            }
            else
            {
                return false;
            }
        }
    return true;
    }
}