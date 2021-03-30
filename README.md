# Lab-05

Update this README to include your team name and team members. Don't forget to record all your answers to lab 05 in this repository.
Brodie Fogarty - bfog012
Ricky xu - xxu281


    // Exercise One
    private String reverseString(String word) {
        
        String revword = "";
        for (int i = word.length()-1;i >= 0;i--){
            revword = revword + word.charAt(i);
        }
        return revword;
    }
    
    
# Exercise Two
# Write a simple program that finds the value at the nth position in the Fibonacci sequence
value = 6
fibonacci = 1 
p = 1
pp = 1
if value > 2:
    for i in range(value-2):
        fibonacci =  p + pp
        pp = p 
        p = fibonacci
  
  
print("The value at the " +  str(value) + " postion in the Fibonacci sequence is " + str(fibonacci))
