from heapq import*
X,Y,Z=map(int,input().split());N=X+Y+Z;A=[];q1=[];q2=[];L=[0];R=[0]
for _ in[0]*N:A.append([int(e)for e in input().split()])
A.sort(key=lambda a:a[0]-a[1])
for i in range(N):
	L.append(L[i]+A[i][1]);heappush(q1,A[i][1]-A[i][2]);R.append(R[i]+A[N-1-i][0]);heappush(q2,A[N-1-i][0]-A[N-1-i][2])
	if i>=Y:L[i+1]-=heappop(q1)
	if i>=X:R[i+1]-=heappop(q2)
print(max(L[i]+R[N-i] for i in range(Y,N-X+1)))