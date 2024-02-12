Problem 1)
To find the Big O of this function, I took note of how many times each line ran.  

The while loop will run n times. And n will be the size of ‘sz’:

2N+(N+1)+2(N-1)+7

5N+6

After removing constants:

5N

This means the complexity of this function is linear:

O(N) 


Problem 2)
If I were to argue that one full use of the scale involves removing the previously weighed bag, then I would put all the bags on the scale one by one without removing any. When the scales tenth place turns to .1, the heavier bag would be the last bag I placed on the scale. 

Otherwise, there would be no reliable way to find the heavy bag every time without checking every bag of M&Ms. O(n) 
