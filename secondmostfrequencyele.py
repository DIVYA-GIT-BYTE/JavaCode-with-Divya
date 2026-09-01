l=list(map(int,input().split()))
d={}
for i in l:
    if i in d:
        d[i]+=1
    else:
        d[i]=1
l2=[]
for key in d:
    l2.append(d[key])
l2=list(set(l2))
l2.sort(reverse='True')
print(l2)

maxi1=float('-inf')
maxi2=float('-inf')
for i in l2:
    if i>maxi1:
        maxi2=maxi1
        maxi1=i
    elif maxi1>i>maxi2:
        maxi2=i
for i in d:
    if d[i]==maxi2:
        print(i)
        break
