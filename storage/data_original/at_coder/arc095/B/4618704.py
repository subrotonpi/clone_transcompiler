input()
a=list(map(int,input().split(' ')))
m=max(a)
a.remove(m)
b=[abs(2*i-m) for i in a]
print(m,a[b.index(min(b))])