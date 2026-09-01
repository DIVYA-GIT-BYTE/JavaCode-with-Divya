l=list(map(int,input().split()))
maxi1=float('-inf')
maxi2=float('-inf')

for i in l:
    if maxi1<i:
        maxi2=maxi1
        maxi1=i
    elif maxi1>i>maxi2:
        maxi2=i
print(maxi2)