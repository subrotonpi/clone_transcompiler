#AGC006 A
'''
??
???s, t??????
??N???, ??N???s????, ??N???t???????????????????????????

??
s?t????????????N
s?t?????????????2*N
s???????t??????????,s?????2??????t?????2???????????????2*N-1

s???????t?????2??????????
s?????2??????t???????????
???2*N-1

s?????1??????t?????i???????
s?????2??????t?????i-1???????
...
s?????i??????t?????1????????
???2*N-i

N?1??100??
????O(N**2)
????????????????i?N??????1??????????????????????i??????
'''

N = int(input())
s = str(input())
t = str(input())

m = 0

for i in range(N,0,-1): #i?N,N-1,...,1???
	unity = True
	for j in range(i):
		#print(s[-(j+1)],t[j])
		if s[-(j+1)] == t[i-j-1]:
			continue
		else:
			unity = False
	#print(unity)
	if unity:
		m = i
		break
	
print(str(2*N-m))