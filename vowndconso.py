n=input()
vow="aeiouAEIOU"
vowcount,concount=0,0
for i in n:
    if i in vow:
        vowcount=vowcount+1
    else:
        concount=concount+1
print(vowcount)
print(concount)