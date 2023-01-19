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