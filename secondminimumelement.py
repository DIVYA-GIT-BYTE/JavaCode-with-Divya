l=list(map(int,input().split()))
min1=float('inf')
min2=float('inf')
for i in l:
    if min1>i:
        min2=min1
        min1=i
    elif min1<i<min2:
        min2=i
print(min2)