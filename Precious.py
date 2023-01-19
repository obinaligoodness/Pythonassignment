#ask the user if he or she would like to play
#if the user says yes then prompt a question to enter any number from 1 to 10
#if the user chooses 3 then display correct 
#if the number is less than 3 print too low 
#if the number is higher than 3 print too high

print("Would you like to play a guess game?")
decision=input()
if decision == "yes":
   print("enter a number from 1 to 10")
userinput = input()
userinput2 = int(userinput)
if userinput2 == 3:
    print("correct!")
elif userinput2 != 3:
  if userinput2 <3:
    print("too low!")
  if userinput2 >3:
    print("too high!")
else:
   print("See you next time!")
   
