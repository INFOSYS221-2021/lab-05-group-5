# Exercise Three
# Write a simple program that finds the number of digits of a given integer value
given_number = -1000
if given_number < 0:
   given_number= given_number * -1
number_string = str(given_number)
digit = str(len(number_string))
print("The number of digits for a value of " + str(given_number) + " is " + digit)
    
