n=input()+" "
res=[]
res1=""
for i in n:
    if i!=" ":
        res1=res1+i
    else:
        res.append(res1)
        res1=""
print(res)
for i in range(len(res)-1,-1,-1):
    print(res[i],end=" ")