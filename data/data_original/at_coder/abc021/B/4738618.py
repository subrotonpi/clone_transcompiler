# ??
N=int(input())
a,b=map(int,input().split())
K=int(input())
l=list(map(int,input().split()))

# ??????????????????????NG
if a in l or b in l:
  print('NO')
  exit()

# ??????????
setl=list(set(l))

# ????????????NG
if len(setl)!=len(l):
  print('NO')
  exit()

# ???????????????OK
print('YES')