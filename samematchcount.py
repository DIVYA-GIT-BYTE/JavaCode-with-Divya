n=input()
res1=""
d={} 
for i in range(len(n)):
    for j in range(1,len(n)):
        if n[i]==n[j] and n[i] not in d and n[j] not in d:
            d[i]=1
        else:
            d[i]+=1
print(d)

