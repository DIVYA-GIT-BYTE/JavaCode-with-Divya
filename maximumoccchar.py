n=input()
maxi=0
c=""
d={}
for i in n:
    if i not in d:
        d[i]=1
    else:
        d[i]+=1
for i in d:
    if d[i]>maxi:
        maxi=d[i]
        c=i
print(maxi)
print(c)