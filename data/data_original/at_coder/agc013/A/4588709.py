N = int(input())
AN = list(map(int,input().split()))

ans = 1		#??????1
beforeDiff = 0

for i in range(1,N):
	diff = AN[i] - AN[i-1]
	
	if beforeDiff==0:	#?????
		beforeDiff = diff
	elif beforeDiff*diff < 0:	#????????????
		beforeDiff = 0	#??1????????????diff????????0
		ans += 1
				#???????????????
print(ans)