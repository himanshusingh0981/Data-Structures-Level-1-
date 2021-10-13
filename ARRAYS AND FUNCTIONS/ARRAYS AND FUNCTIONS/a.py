str  = input()
str2 = reversed(str)
if list(str)==list(str2):
    print("you inputted a strong string")
else:
    print("you inputted a weak string")