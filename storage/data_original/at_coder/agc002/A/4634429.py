#AGC002 A 23:04 - 
'''
??
??a,b??????????a<=b????
????a,a+1,...,b????????????????0??????
???a,b?-10**9??10**9????a<=b

??
a*b<=0?????0
a*b>0??a+b>0??????
a*b>0??a+b<0??...
	a??b???????????????
		???a-b?????????
	a??b???????????????
		???a-b?????????
'''

a,b=map(int,input().split(' '))

if a*b<=0:
	print('Zero')
elif a+b>0 or (a+b<0 and (a-b)%2==1):
	print('Positive')
else:
	print('Negative')