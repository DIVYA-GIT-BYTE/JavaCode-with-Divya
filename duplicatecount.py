n=input()

#model---1
'''d={}
for i in n:
    if i in d:
        d[i]+=1
    else:
        d[i]=1
for key in d:
    if d[key]>1:
        print(key)'''

#model--2
for i in range(0,len(n)):
    for j in range(i+1,len(n)):
        if n[i]==n[j]:
            print(n[i])