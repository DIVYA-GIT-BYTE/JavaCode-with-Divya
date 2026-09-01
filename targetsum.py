
'''t=int(input())

l2=[]
for i in range(0,len(l)):
    for j in range(i+1,len(l)):
        if l[i]+l[j]==t:
            l2.append((l[i],l[j]))
print(l2)'''

l=list(map(int,input().split()))
l2=[]
for i in range(len(l)):
    if l[i]<0:
        l2.append(l[i])
for i in range(len(l)):
    if l[i]>0:
        l2.append(l[i])
print(l2)
