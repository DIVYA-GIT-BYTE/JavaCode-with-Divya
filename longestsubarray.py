l=list(map(int,input().split()))
subl=1
sub2=1
for i in range(1,len(l)):
        if l[i]>l[i-1]:
            subl+=1
        else:
            subl=1
        sub2=max(sub2,subl)
print(sub2)