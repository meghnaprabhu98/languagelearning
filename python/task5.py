type1=['april','june','september','november']
type2=['january','march','may','july','august','october','december']
m=input("enter a month name:")

if m in type1:
    print("no. of days are 30")

elif m in type2:
    print("no. of days are 31")

else:
    print("no. of days are 28 (29 if leap year)")
