import numpy as P
def I(): return map(int,input().split())
M,G=P.maximum,range;N,Q=I();X,R,H=map(P.array,zip(*[I()for _ in G(N)]))
for _ in G(Q):a,b=I();K=M(X+H-M(X,a),0);L=M(X+H-M(X,b),0);print(P.sum(P.pi*(K**3-L**3)*(R/H)**2/3),sep="\n")