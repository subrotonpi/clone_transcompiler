d,e,f = map(int,input().split())
a,b,c = map(int,input().split())
q = (d//a) * (e//b) * (f//c)
w = (e//a) * (d//b) * (f//c)
r = (f//a) * (e//b) * (d//c)
t = (d//a) * (f//b) * (e//c)
y = (e//a) * (f//b) * (d//c)
u = (f//a) * (d//b) * (e//c)
print(max(q,w,r,t,y,u))