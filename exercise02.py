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
