import bisect as bis
n=int(input())
l=[int(input()) for i in range(n)]
INF=n+10
DP=[-INF]+[INF]*(n)
z=0
for i in range(n):
    j = bis.bisect_left(DP, l[i])
    if DP[j]==INF:
        z=j
    DP[j]=l[i]
print(n-z)