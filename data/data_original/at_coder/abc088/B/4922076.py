n=int(input())
a=sorted([int(i) for i in input().split()])
A=sum([a[i] for i in range(n) if i%2==0])
B=sum([a[i] for i in range(n) if i%2!=0])
print(abs(A-B))