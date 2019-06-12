num=[]
for i in range(0,3):
    n=int(input("enter 3 nos"));
    num.append(n);
num.sort();
print("median is ",num[1]);