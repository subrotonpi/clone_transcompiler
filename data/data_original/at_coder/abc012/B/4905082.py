n=input()
n=int(n)
h=int(n/3600)
m=int((n-h*3600)/60)
s=n-h*3600-m*60
print(str(h).zfill(2),end="")
print(":",end="")
print(str(m).zfill(2),end="")
print(":",end="")
print(str(s).zfill(2))