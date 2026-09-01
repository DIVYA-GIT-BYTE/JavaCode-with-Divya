'''Given a list of numbers, print only those numbers whose:

Sum of digits is a prime number, AND

Reverse of the number is divisible by 3 
input 12 23 41
output 12'''

l=list(map(int,input().split()))

def primenum(n):
    if n<1:
        return False
    else:
        for i in range(2,n):
            if n%i==0:
                return False
        else:
            return True

for i in range(len(l)):
    r=l[i]
    n=0
    rem,c=0,0
    while r:
        rem=r%10
        n=n*10+rem
        c+=rem
        r=r//10
    if primenum(c) and n%3==0:
        print(l[i])
