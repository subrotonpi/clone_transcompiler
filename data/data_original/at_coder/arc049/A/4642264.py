s = list(str(input()))
A,B,C,D=map(int,input().split())
s.insert(D,'"')
s.insert(C,'"')
s.insert(B,'"')
s.insert(A,'"')
print(*s,sep=(""))