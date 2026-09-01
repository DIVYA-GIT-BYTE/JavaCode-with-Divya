l=list(map(int,input().split()))
l2=[]
for i in l:
    if i!=0:
        l2.append(i)

for i in range(len(l2),len(l)):
    l2.append(0)
print(l2)