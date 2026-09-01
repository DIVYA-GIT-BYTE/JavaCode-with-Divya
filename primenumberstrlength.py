s=input()+" "
l=list(s)
def primenum(n):
    if n<1:
        return False
    else:
        for i in range(2,n):
            if n%i==0:
                return False
        else:
            return True
c=0
l2=[]  
word=""     
for i in l:
    if i!=" ":
        c+=1
        word=word+i
    else:
        if primenum(c)==True:
            l2.append(word)
        c=0
        word=""
res=""
larg=""   
for i in l2:
    if len(i)>len(larg):
        larg=i
print(larg)

res=""
count=0
vow="AEIOUaeiou"
numlist=['Zero','One','Two','Three','Four','Five','Six','Seven','Eight','Nine','Ten']
for i in larg:
    if i in vow:
        res=res+i
        count=count+1
print(res)
print(numlist[count])
