n1=input()
n2=input()
def anagramlen(res):
    count=0
    for i in res:
        count=count+1
    return count

def strtolst(n):
    res=[]
    for i in n:
        res.append(i)
    return res
    
n1list=strtolst(n1)
n2list=strtolst(n2)

def sortofstr(n1list,n2list):
    c=0
    for i in range(0,anagramlen(n1list)):
        for j in range(0,anagramlen(n2list)):
            if n1list[i]==n2list[j]:
                c=c+1
                n2list[j]="*"
            else:
                continue
    return c

if anagramlen(n1)==anagramlen(n2) and sortofstr(n1list,n2list)==anagramlen(n1):
        print("anagram")
else:
    print("not anagram")
    


 
