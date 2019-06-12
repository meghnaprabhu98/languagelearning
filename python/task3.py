list=input("list of words");
m=0;
for words in list.split():
    if(len(words)>m) : m=len(words);
print (m);