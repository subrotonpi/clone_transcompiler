# ??
N=int(input())
S=input()

# ??
c=0

# ???
x='b'

# ????
if x==S:
  print(c)
  exit()

# ????? 1->2->3->1->...
f=1

# ??100???
for i in range(100):
  # ?????1???????'a'????'c'?
  if f==1:
    x='a'+x+'c'
    f=2
  # ?????2???????'c'????'a'?
  elif f==2:
    x='c'+x+'a'
    f=3
  # ?????3???????'b'????'b'?
  elif f==3:
    x='b'+x+'b'
    f=1
  # ????????
  c+=1
  # ????
  if x==S:
    print(c)
    exit()

# ??????????'-1'???
print(-1)