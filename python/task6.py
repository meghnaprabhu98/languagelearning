s1=int(input("side1 of triangle"));
s2=int(input("side2 of triangle"));
s3=int(input("side3 of triangle"));
if s1==s2 and s2==s3:print ("equilateral triangle");
elif s1==s2 or s2==s3 or s1==s3:print ("isosceles triangle");
elif s1!=s2 or s2!=s3 or s1!=s3:print ("scalene triangle");